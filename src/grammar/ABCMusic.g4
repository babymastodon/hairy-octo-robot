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
WHITESPACE : ('\t' | ' ')+ ;
DIGIT: [0-9]+;
WORD: [a-zA-Z!.?]+;
LINEFEED: ('\n')+;

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
abcheader : fieldnumber comment* fieldtitle otherfields* fieldkey;
fieldnumber : 'X:' (' '+ | DIGIT)+ endofline;
fieldtitle : 'T:' fieldtitletext endofline;
fieldtitletext : (' '+ | text | DIGIT | (space* DIGIT space*))+;
otherfields : fieldcomposer | fielddefaultlength | fieldmeter | fieldtempo | fieldvoice | comment;
fieldcomposer : 'C:' ' '* composername ' '* endofline;
composername: (' '+ | text)+;
fielddefaultlength : 'L:' ' '* notelengthstrict ' '* endofline;
fieldmeter : 'M:' ' '* meter ' '* endofline;
fieldtempo : 'Q:' ' '* tempo ' '* endofline;
fieldvoice : 'V:' text endofline;
fieldkey : 'K:' ' '* key ' '* endofline;
key : keynote (modeminor)*;
keynote : basenote (keyaccidental)*;
keyaccidental : '#' | 'b';
modeminor : 'm';
meter : 'C' | 'C|' | meterfraction;
meterfraction : DIGIT+ '/' DIGIT+;
tempo : meterfraction '=' DIGIT+;
abcmusic : abcline+;
abcline : element+ LINEFEED (lyric LINEFEED*)* | midtunefield | comment;
//abcline : element+ LINEFEED | midtunefield | comment;
element : noteelement | tupletelement | barline | nthrepeat | ' ' ;
noteelement : note | multinote;
// note is either a pitch or a rest;
note : noteorrest notelength?;
noteorrest : pitch | rest;
pitch : accidental* basenote octave* ;
octave : '\''+ | ','+;
notelength : DIGIT* '/'? DIGIT*;
notelengthstrict : DIGIT+ '/' DIGIT+;
// '^' is sharp, '_' is flat, and '=' is neutral;
accidental : '^' | '^^' | '_' | '__' | '=';
basenote : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
rest : 'z';
// tuplets;
tupletelement : tupletspec (noteelement+ | WORD);
tupletspec : '(' DIGIT ;
// chords;
multinote : '[' note+ ']';
barline : '|' | '||' | '[|' | '|]' | ':|' | '|:';
nthrepeat : '[1' | '[2';
// A voice field might reappear in the middle of a piece;
// to indicate the change of a voice;
midtunefield : fieldvoice;
comment : '%' text LINEFEED;
endofline : comment | LINEFEED;
lyric : 'w:' lyrical_element*;
lyrical_element : ' '+ | '-' | '_' | '*' | '~' | '\-' | '|' | lyric_text | basenote | rest;
text : WHITESPACE* WORD WHITESPACE*;
lyric_text : WHITESPACE* WORD WHITESPACE*;
space: WHITESPACE;
