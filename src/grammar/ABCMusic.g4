/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

/*
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
    // This method makes the lexer or parser stop running if it encounters
    // invalid input and throw a RuntimeException.
    public void reportErrorsAsExceptions() {
        removeErrorListeners();
        addErrorListener(new ExceptionThrowingErrorListener());
    }

    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            throw new RuntimeException(msg);
        }
    }
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
WHITESPACE : ('\t' | ' ')+;
LINEFEED: ('\n' | '\r')+;

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */
abctune : abcheader abcmusic EOF;

//header
abcheader : endofline? fieldnumber fieldtitle otherfields fieldkey;
otherfields : (fieldcomposer | fielddefaultlength | fieldmeter | fieldtempo | fieldvoice)*;

fieldnumber : 'X' ':' space? songnumber endofline;
songnumber : number;

fieldtitle : 'T' ':' title endofline;
title: text;

fieldcomposer : 'C' ':' composer endofline;
composer : text;

fielddefaultlength : 'L' ':' space? defaultlength endofline;
defaultlength: number space? '/' space? number;

fieldmeter : 'M' ':' space? meter endofline;
meter : 'C' '|'? | (number space? '/' space? number);

// spaces are permitted within the note length in the header

fieldtempo : 'Q' ':' space? tempo endofline;
tempo : number space? '/' space? number space? '=' space? number;

fieldvoice : 'V' ':' voice endofline;
voice : text;

fieldkey : 'K' ':' space? key endofline;
key : basenote keyaccidental? modeminor?;
keyaccidental : '#' | 'b';
modeminor : 'm';

//body
abcmusic : abcline*;
abcline :  notesline | midtunefield;

// line of notes
notesline : element+ endofline lyric?;
element : pitch | rest | multinote | tuplet | barline | space ;

// pitch
pitch : accidental? basenote octave? notelength?;
octave : '\''+ | ','+;
accidental : '^' | '^' '^' | '_' | '_' '_' | '=';

// rest
rest: 'z' notelength?;

// chords only contain pitches
multinote : '[' space? pitch (space | pitch)* ']' notelength?;

notelength: notelengthfull | notelengthmultiply | notelengthnumerator | notelengthdenominator | notelengthhalf;
notelengthfull: number '/' number;
notelengthmultiply: number;
notelengthnumerator: number '/';
notelengthdenominator: '/' number;
notelengthhalf: '/';

// tuplets can contain pitches and chords, but not rests
tuplet : duplet | triplet | quadruplet;
duplet : '(' '2' space? tupletnote space? tupletnote;
triplet: '(' '3' space? tupletnote space? tupletnote space? tupletnote;
quadruplet: '(' '4' space? tupletnote space? tupletnote space? tupletnote space? tupletnote;
tupletnote: pitch | multinote;

barline : '[' '|' | '|' ']' | ':' '|' | '|' ':' | '[' '1' | '[' '2' | '|' '|' | '|';

// A voice field might reappear in the middle of a piece;
// to indicate the change of a voice;
midtunefield : fieldvoice;

// lyrics always occur on a single line
lyric : 'w:' (lyricunderscore | lyricstar | lyricbar | lyricword | space)* endofline;
lyricunderscore : '_';
lyricstar : '*';
lyricbar : '|';
lyricword : (character | number | punctuation)+;

// Each line may be ended with a comment, and a comment may span multiple lines
comment : '%' commenttext LINEFEED;
endofline : space? (comment | LINEFEED) endofline?;
commenttext : (~LINEFEED)*;
text : (~(LINEFEED | '%'))*;
space: WHITESPACE;

// Lists of valid tokens (did not work when included in the Lexer
// section, so they are here instead)
basenote : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' |
           'd' | 'e' | 'f' | 'g' | 'a' | 'b';
character: 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' |
           'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' |
           'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' |
           'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' |
           'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' |
           'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' |
           'W' | 'X' | 'Y' | 'Z';
punctuation: '"' | '\''| '?' | '!' | ',' | ';' | ':' | '.' | '(' | ')' | '-' | '\\' '-' | '~';
digit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
number: digit+;
