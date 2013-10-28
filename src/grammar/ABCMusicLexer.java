// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, WHITESPACE=38, DIGIT=39, 
		BASENOTE=40, REST=41, WORD=42, LINEFEED=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'C:'", "','", "'['", "'-'", "'*'", "'('", "'X:'", "'T:'", "'Q:'", 
		"'w:'", "'''", "' '", "'|]'", "'-'", "'M:'", "'^^'", "'[2'", "'|:'", "'%'", 
		"'^'", "'L:'", "'__'", "'_'", "':|'", "'='", "'V:'", "'[|'", "'||'", "'m'", 
		"'K:'", "'/'", "'[1'", "'~'", "'#'", "'|'", "'C|'", "WHITESPACE", "DIGIT", 
		"BASENOTE", "'z'", "WORD", "LINEFEED"
	};
	public static final String[] ruleNames = {
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "WHITESPACE", "DIGIT", "BASENOTE", "REST", 
		"WORD", "LINEFEED"
	};


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


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4-\u00d7\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3&\3\'\6\'\u00b9\n\'\r\'\16\'\u00ba\3(\6(\u00be\n"+
		"(\r(\16(\u00bf\3)\3)\3*\3*\3+\6+\u00c7\n+\r+\16+\u00c8\3,\6,\u00cc\n,"+
		"\r,\16,\u00cd\3,\3,\6,\u00d2\n,\r,\16,\u00d3\5,\u00d6\n,\2-\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1\3\2\6\4\13\13\"\"\3\62;\4CIci"+
		"\b##))\60\60AAJ\\j{\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7^"+
		"\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23"+
		"k\3\2\2\2\25n\3\2\2\2\27q\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2"+
		"\37{\3\2\2\2!~\3\2\2\2#\u0081\3\2\2\2%\u0084\3\2\2\2\'\u0087\3\2\2\2)"+
		"\u008a\3\2\2\2+\u008c\3\2\2\2-\u008e\3\2\2\2/\u0091\3\2\2\2\61\u0094\3"+
		"\2\2\2\63\u0096\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009e\3\2\2"+
		"\2;\u00a1\3\2\2\2=\u00a4\3\2\2\2?\u00a6\3\2\2\2A\u00a9\3\2\2\2C\u00ab"+
		"\3\2\2\2E\u00ae\3\2\2\2G\u00b0\3\2\2\2I\u00b2\3\2\2\2K\u00b4\3\2\2\2M"+
		"\u00b8\3\2\2\2O\u00bd\3\2\2\2Q\u00c1\3\2\2\2S\u00c3\3\2\2\2U\u00c6\3\2"+
		"\2\2W\u00d5\3\2\2\2YZ\7_\2\2Z\4\3\2\2\2[\\\7E\2\2\\]\7<\2\2]\6\3\2\2\2"+
		"^_\7.\2\2_\b\3\2\2\2`a\7]\2\2a\n\3\2\2\2bc\7/\2\2c\f\3\2\2\2de\7,\2\2"+
		"e\16\3\2\2\2fg\7*\2\2g\20\3\2\2\2hi\7Z\2\2ij\7<\2\2j\22\3\2\2\2kl\7V\2"+
		"\2lm\7<\2\2m\24\3\2\2\2no\7S\2\2op\7<\2\2p\26\3\2\2\2qr\7y\2\2rs\7<\2"+
		"\2s\30\3\2\2\2tu\7)\2\2u\32\3\2\2\2vw\7\"\2\2w\34\3\2\2\2xy\7~\2\2yz\7"+
		"_\2\2z\36\3\2\2\2{|\7^\2\2|}\7/\2\2} \3\2\2\2~\177\7O\2\2\177\u0080\7"+
		"<\2\2\u0080\"\3\2\2\2\u0081\u0082\7`\2\2\u0082\u0083\7`\2\2\u0083$\3\2"+
		"\2\2\u0084\u0085\7]\2\2\u0085\u0086\7\64\2\2\u0086&\3\2\2\2\u0087\u0088"+
		"\7~\2\2\u0088\u0089\7<\2\2\u0089(\3\2\2\2\u008a\u008b\7\'\2\2\u008b*\3"+
		"\2\2\2\u008c\u008d\7`\2\2\u008d,\3\2\2\2\u008e\u008f\7N\2\2\u008f\u0090"+
		"\7<\2\2\u0090.\3\2\2\2\u0091\u0092\7a\2\2\u0092\u0093\7a\2\2\u0093\60"+
		"\3\2\2\2\u0094\u0095\7a\2\2\u0095\62\3\2\2\2\u0096\u0097\7<\2\2\u0097"+
		"\u0098\7~\2\2\u0098\64\3\2\2\2\u0099\u009a\7?\2\2\u009a\66\3\2\2\2\u009b"+
		"\u009c\7X\2\2\u009c\u009d\7<\2\2\u009d8\3\2\2\2\u009e\u009f\7]\2\2\u009f"+
		"\u00a0\7~\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7~\2\2\u00a2\u00a3\7~\2\2\u00a3"+
		"<\3\2\2\2\u00a4\u00a5\7o\2\2\u00a5>\3\2\2\2\u00a6\u00a7\7M\2\2\u00a7\u00a8"+
		"\7<\2\2\u00a8@\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aaB\3\2\2\2\u00ab\u00ac"+
		"\7]\2\2\u00ac\u00ad\7\63\2\2\u00adD\3\2\2\2\u00ae\u00af\7\u0080\2\2\u00af"+
		"F\3\2\2\2\u00b0\u00b1\7%\2\2\u00b1H\3\2\2\2\u00b2\u00b3\7~\2\2\u00b3J"+
		"\3\2\2\2\u00b4\u00b5\7E\2\2\u00b5\u00b6\7~\2\2\u00b6L\3\2\2\2\u00b7\u00b9"+
		"\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bbN\3\2\2\2\u00bc\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0P\3"+
		"\2\2\2\u00c1\u00c2\t\4\2\2\u00c2R\3\2\2\2\u00c3\u00c4\7|\2\2\u00c4T\3"+
		"\2\2\2\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9V\3\2\2\2\u00ca\u00cc\7\f\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00d6\3\2\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d2\7\f\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6"+
		"X\3\2\2\2\t\2\u00ba\u00bf\u00c8\u00cd\u00d3\u00d5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}