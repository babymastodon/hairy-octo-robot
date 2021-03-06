// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__85=1, T__84=2, T__83=3, T__82=4, T__81=5, T__80=6, T__79=7, T__78=8, 
		T__77=9, T__76=10, T__75=11, T__74=12, T__73=13, T__72=14, T__71=15, T__70=16, 
		T__69=17, T__68=18, T__67=19, T__66=20, T__65=21, T__64=22, T__63=23, 
		T__62=24, T__61=25, T__60=26, T__59=27, T__58=28, T__57=29, T__56=30, 
		T__55=31, T__54=32, T__53=33, T__52=34, T__51=35, T__50=36, T__49=37, 
		T__48=38, T__47=39, T__46=40, T__45=41, T__44=42, T__43=43, T__42=44, 
		T__41=45, T__40=46, T__39=47, T__38=48, T__37=49, T__36=50, T__35=51, 
		T__34=52, T__33=53, T__32=54, T__31=55, T__30=56, T__29=57, T__28=58, 
		T__27=59, T__26=60, T__25=61, T__24=62, T__23=63, T__22=64, T__21=65, 
		T__20=66, T__19=67, T__18=68, T__17=69, T__16=70, T__15=71, T__14=72, 
		T__13=73, T__12=74, T__11=75, T__10=76, T__9=77, T__8=78, T__7=79, T__6=80, 
		T__5=81, T__4=82, T__3=83, T__2=84, T__1=85, T__0=86, WHITESPACE=87, LINEFEED=88;
	public static final String[] tokenNames = {
		"<INVALID>", "'E'", "'u'", "'*'", "'['", "'8'", "'A'", "'W'", "'d'", "'q'", 
		"'N'", "'w:'", "'4'", "'O'", "'l'", "'y'", "'I'", "'h'", "'S'", "'\"'", 
		"'0'", "'M'", "'%'", "')'", "'D'", "'_'", "'9'", "'t'", "'c'", "'X'", 
		"'p'", "'='", "'x'", "'5'", "'k'", "'H'", "'\\'", "'P'", "'1'", "'|'", 
		"'T'", "'!'", "'g'", "'L'", "'b'", "']'", "'C'", "','", "'-'", "':'", 
		"'('", "'o'", "'s'", "'w'", "'Y'", "'f'", "'6'", "'?'", "'''", "'2'", 
		"'G'", "'Q'", "'n'", "'K'", "'j'", "'U'", "'7'", "'v'", "'^'", "'a'", 
		"'.'", "'B'", "'r'", "';'", "'e'", "'Z'", "'m'", "'R'", "'z'", "'3'", 
		"'F'", "'V'", "'i'", "'/'", "'~'", "'#'", "'J'", "WHITESPACE", "LINEFEED"
	};
	public static final int
		RULE_abctune = 0, RULE_abcheader = 1, RULE_otherfields = 2, RULE_fieldnumber = 3, 
		RULE_songnumber = 4, RULE_fieldtitle = 5, RULE_title = 6, RULE_fieldcomposer = 7, 
		RULE_composer = 8, RULE_fielddefaultlength = 9, RULE_defaultlength = 10, 
		RULE_fieldmeter = 11, RULE_meter = 12, RULE_fieldtempo = 13, RULE_tempo = 14, 
		RULE_fieldvoice = 15, RULE_voice = 16, RULE_fieldkey = 17, RULE_key = 18, 
		RULE_keyaccidental = 19, RULE_modeminor = 20, RULE_abcmusic = 21, RULE_abcline = 22, 
		RULE_notesline = 23, RULE_element = 24, RULE_pitch = 25, RULE_octave = 26, 
		RULE_accidental = 27, RULE_rest = 28, RULE_multinote = 29, RULE_notelength = 30, 
		RULE_notelengthfull = 31, RULE_notelengthmultiply = 32, RULE_notelengthnumerator = 33, 
		RULE_notelengthdenominator = 34, RULE_notelengthhalf = 35, RULE_tuplet = 36, 
		RULE_duplet = 37, RULE_triplet = 38, RULE_quadruplet = 39, RULE_tupletnote = 40, 
		RULE_barline = 41, RULE_midtunefield = 42, RULE_lyric = 43, RULE_lyricunderscore = 44, 
		RULE_lyricstar = 45, RULE_lyricbar = 46, RULE_lyricword = 47, RULE_comment = 48, 
		RULE_endofline = 49, RULE_commenttext = 50, RULE_text = 51, RULE_space = 52, 
		RULE_basenote = 53, RULE_character = 54, RULE_punctuation = 55, RULE_digit = 56, 
		RULE_number = 57;
	public static final String[] ruleNames = {
		"abctune", "abcheader", "otherfields", "fieldnumber", "songnumber", "fieldtitle", 
		"title", "fieldcomposer", "composer", "fielddefaultlength", "defaultlength", 
		"fieldmeter", "meter", "fieldtempo", "tempo", "fieldvoice", "voice", "fieldkey", 
		"key", "keyaccidental", "modeminor", "abcmusic", "abcline", "notesline", 
		"element", "pitch", "octave", "accidental", "rest", "multinote", "notelength", 
		"notelengthfull", "notelengthmultiply", "notelengthnumerator", "notelengthdenominator", 
		"notelengthhalf", "tuplet", "duplet", "triplet", "quadruplet", "tupletnote", 
		"barline", "midtunefield", "lyric", "lyricunderscore", "lyricstar", "lyricbar", 
		"lyricword", "comment", "endofline", "commenttext", "text", "space", "basenote", 
		"character", "punctuation", "digit", "number"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AbctuneContext extends ParserRuleContext {
		public AbcmusicContext abcmusic() {
			return getRuleContext(AbcmusicContext.class,0);
		}
		public AbcheaderContext abcheader() {
			return getRuleContext(AbcheaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public AbctuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abctune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbctune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbctune(this);
		}
	}

	public final AbctuneContext abctune() throws RecognitionException {
		AbctuneContext _localctx = new AbctuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abctune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); abcheader();
			setState(117); abcmusic();
			setState(118); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbcheaderContext extends ParserRuleContext {
		public OtherfieldsContext otherfields() {
			return getRuleContext(OtherfieldsContext.class,0);
		}
		public FieldkeyContext fieldkey() {
			return getRuleContext(FieldkeyContext.class,0);
		}
		public FieldtitleContext fieldtitle() {
			return getRuleContext(FieldtitleContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public FieldnumberContext fieldnumber() {
			return getRuleContext(FieldnumberContext.class,0);
		}
		public AbcheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbcheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbcheader(this);
		}
	}

	public final AbcheaderContext abcheader() throws RecognitionException {
		AbcheaderContext _localctx = new AbcheaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abcheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==22 || _la==WHITESPACE || _la==LINEFEED) {
				{
				setState(120); endofline();
				}
			}

			setState(123); fieldnumber();
			setState(124); fieldtitle();
			setState(125); otherfields();
			setState(126); fieldkey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherfieldsContext extends ParserRuleContext {
		public List<FieldvoiceContext> fieldvoice() {
			return getRuleContexts(FieldvoiceContext.class);
		}
		public FieldtempoContext fieldtempo(int i) {
			return getRuleContext(FieldtempoContext.class,i);
		}
		public FieldvoiceContext fieldvoice(int i) {
			return getRuleContext(FieldvoiceContext.class,i);
		}
		public FieldcomposerContext fieldcomposer(int i) {
			return getRuleContext(FieldcomposerContext.class,i);
		}
		public List<FieldmeterContext> fieldmeter() {
			return getRuleContexts(FieldmeterContext.class);
		}
		public FielddefaultlengthContext fielddefaultlength(int i) {
			return getRuleContext(FielddefaultlengthContext.class,i);
		}
		public FieldmeterContext fieldmeter(int i) {
			return getRuleContext(FieldmeterContext.class,i);
		}
		public List<FielddefaultlengthContext> fielddefaultlength() {
			return getRuleContexts(FielddefaultlengthContext.class);
		}
		public List<FieldtempoContext> fieldtempo() {
			return getRuleContexts(FieldtempoContext.class);
		}
		public List<FieldcomposerContext> fieldcomposer() {
			return getRuleContexts(FieldcomposerContext.class);
		}
		public OtherfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOtherfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOtherfields(this);
		}
	}

	public final OtherfieldsContext otherfields() throws RecognitionException {
		OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_otherfields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (21 - 21)) | (1L << (43 - 21)) | (1L << (46 - 21)) | (1L << (61 - 21)) | (1L << (81 - 21)))) != 0)) {
				{
				setState(133);
				switch (_input.LA(1)) {
				case 46:
					{
					setState(128); fieldcomposer();
					}
					break;
				case 43:
					{
					setState(129); fielddefaultlength();
					}
					break;
				case 21:
					{
					setState(130); fieldmeter();
					}
					break;
				case 61:
					{
					setState(131); fieldtempo();
					}
					break;
				case 81:
					{
					setState(132); fieldvoice();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldnumberContext extends ParserRuleContext {
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public SongnumberContext songnumber() {
			return getRuleContext(SongnumberContext.class,0);
		}
		public FieldnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldnumber(this);
		}
	}

	public final FieldnumberContext fieldnumber() throws RecognitionException {
		FieldnumberContext _localctx = new FieldnumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldnumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(29);
			setState(139); match(49);
			setState(141);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(140); space();
				}
			}

			setState(143); songnumber();
			setState(144); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SongnumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SongnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_songnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterSongnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitSongnumber(this);
		}
	}

	public final SongnumberContext songnumber() throws RecognitionException {
		SongnumberContext _localctx = new SongnumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_songnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldtitleContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public FieldtitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldtitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldtitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldtitle(this);
		}
	}

	public final FieldtitleContext fieldtitle() throws RecognitionException {
		FieldtitleContext _localctx = new FieldtitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldtitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(40);
			setState(149); match(49);
			setState(150); title();
			setState(151); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldcomposerContext extends ParserRuleContext {
		public ComposerContext composer() {
			return getRuleContext(ComposerContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public FieldcomposerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldcomposer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldcomposer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldcomposer(this);
		}
	}

	public final FieldcomposerContext fieldcomposer() throws RecognitionException {
		FieldcomposerContext _localctx = new FieldcomposerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldcomposer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(46);
			setState(156); match(49);
			setState(157); composer();
			setState(158); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComposerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ComposerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComposer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComposer(this);
		}
	}

	public final ComposerContext composer() throws RecognitionException {
		ComposerContext _localctx = new ComposerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FielddefaultlengthContext extends ParserRuleContext {
		public DefaultlengthContext defaultlength() {
			return getRuleContext(DefaultlengthContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public FielddefaultlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddefaultlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFielddefaultlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFielddefaultlength(this);
		}
	}

	public final FielddefaultlengthContext fielddefaultlength() throws RecognitionException {
		FielddefaultlengthContext _localctx = new FielddefaultlengthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fielddefaultlength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(43);
			setState(163); match(49);
			setState(165);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(164); space();
				}
			}

			setState(167); defaultlength();
			setState(168); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultlengthContext extends ParserRuleContext {
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public DefaultlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterDefaultlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitDefaultlength(this);
		}
	}

	public final DefaultlengthContext defaultlength() throws RecognitionException {
		DefaultlengthContext _localctx = new DefaultlengthContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defaultlength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); number();
			setState(172);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(171); space();
				}
			}

			setState(174); match(83);
			setState(176);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(175); space();
				}
			}

			setState(178); number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldmeterContext extends ParserRuleContext {
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public FieldmeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldmeter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldmeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldmeter(this);
		}
	}

	public final FieldmeterContext fieldmeter() throws RecognitionException {
		FieldmeterContext _localctx = new FieldmeterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldmeter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(21);
			setState(181); match(49);
			setState(183);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(182); space();
				}
			}

			setState(185); meter();
			setState(186); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeterContext extends ParserRuleContext {
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_meter);
		int _la;
		try {
			setState(202);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); match(46);
				setState(190);
				_la = _input.LA(1);
				if (_la==39) {
					{
					setState(189); match(39);
					}
				}

				}
				break;
			case 5:
			case 12:
			case 20:
			case 26:
			case 33:
			case 38:
			case 56:
			case 59:
			case 66:
			case 79:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(192); number();
				setState(194);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(193); space();
					}
				}

				setState(196); match(83);
				setState(198);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(197); space();
					}
				}

				setState(200); number();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldtempoContext extends ParserRuleContext {
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public FieldtempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldtempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldtempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldtempo(this);
		}
	}

	public final FieldtempoContext fieldtempo() throws RecognitionException {
		FieldtempoContext _localctx = new FieldtempoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldtempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(61);
			setState(205); match(49);
			setState(207);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(206); space();
				}
			}

			setState(209); tempo();
			setState(210); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); number();
			setState(214);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(213); space();
				}
			}

			setState(216); match(83);
			setState(218);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(217); space();
				}
			}

			setState(220); number();
			setState(222);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(221); space();
				}
			}

			setState(224); match(31);
			setState(226);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(225); space();
				}
			}

			setState(228); number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldvoiceContext extends ParserRuleContext {
		public VoiceContext voice() {
			return getRuleContext(VoiceContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldvoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldvoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldvoice(this);
		}
	}

	public final FieldvoiceContext fieldvoice() throws RecognitionException {
		FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldvoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(81);
			setState(231); match(49);
			setState(232); voice();
			setState(233); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoiceContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitVoice(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldkeyContext extends ParserRuleContext {
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public FieldkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldkey(this);
		}
	}

	public final FieldkeyContext fieldkey() throws RecognitionException {
		FieldkeyContext _localctx = new FieldkeyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fieldkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(63);
			setState(238); match(49);
			setState(240);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(239); space();
				}
			}

			setState(242); key();
			setState(243); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public ModeminorContext modeminor() {
			return getRuleContext(ModeminorContext.class,0);
		}
		public KeyaccidentalContext keyaccidental() {
			return getRuleContext(KeyaccidentalContext.class,0);
		}
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); basenote();
			setState(247);
			_la = _input.LA(1);
			if (_la==44 || _la==85) {
				{
				setState(246); keyaccidental();
				}
			}

			setState(250);
			_la = _input.LA(1);
			if (_la==76) {
				{
				setState(249); modeminor();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyaccidentalContext extends ParserRuleContext {
		public KeyaccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyaccidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKeyaccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKeyaccidental(this);
		}
	}

	public final KeyaccidentalContext keyaccidental() throws RecognitionException {
		KeyaccidentalContext _localctx = new KeyaccidentalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_keyaccidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==44 || _la==85) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeminorContext extends ParserRuleContext {
		public ModeminorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeminor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterModeminor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitModeminor(this);
		}
	}

	public final ModeminorContext modeminor() throws RecognitionException {
		ModeminorContext _localctx = new ModeminorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modeminor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(76);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbcmusicContext extends ParserRuleContext {
		public AbclineContext abcline(int i) {
			return getRuleContext(AbclineContext.class,i);
		}
		public List<AbclineContext> abcline() {
			return getRuleContexts(AbclineContext.class);
		}
		public AbcmusicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcmusic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbcmusic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbcmusic(this);
		}
	}

	public final AbcmusicContext abcmusic() throws RecognitionException {
		AbcmusicContext _localctx = new AbcmusicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_abcmusic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 24) | (1L << 25) | (1L << 28) | (1L << 31) | (1L << 39) | (1L << 42) | (1L << 44) | (1L << 46) | (1L << 49) | (1L << 50) | (1L << 55) | (1L << 60))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (69 - 68)) | (1L << (71 - 68)) | (1L << (74 - 68)) | (1L << (78 - 68)) | (1L << (80 - 68)) | (1L << (81 - 68)) | (1L << (WHITESPACE - 68)))) != 0)) {
				{
				{
				setState(256); abcline();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbclineContext extends ParserRuleContext {
		public MidtunefieldContext midtunefield() {
			return getRuleContext(MidtunefieldContext.class,0);
		}
		public NoteslineContext notesline() {
			return getRuleContext(NoteslineContext.class,0);
		}
		public AbclineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbcline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbcline(this);
		}
	}

	public final AbclineContext abcline() throws RecognitionException {
		AbclineContext _localctx = new AbclineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_abcline);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 6:
			case 8:
			case 24:
			case 25:
			case 28:
			case 31:
			case 39:
			case 42:
			case 44:
			case 46:
			case 49:
			case 50:
			case 55:
			case 60:
			case 68:
			case 69:
			case 71:
			case 74:
			case 78:
			case 80:
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); notesline();
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); midtunefield();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteslineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public NoteslineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notesline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotesline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotesline(this);
		}
	}

	public final NoteslineContext notesline() throws RecognitionException {
		NoteslineContext _localctx = new NoteslineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_notesline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(266); element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(271); endofline();
			setState(273);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(272); lyric();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public BarlineContext barline() {
			return getRuleContext(BarlineContext.class,0);
		}
		public MultinoteContext multinote() {
			return getRuleContext(MultinoteContext.class,0);
		}
		public TupletContext tuplet() {
			return getRuleContext(TupletContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_element);
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); pitch();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); rest();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277); multinote();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); tuplet();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279); barline();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280); space();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PitchContext extends ParserRuleContext {
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public NotelengthContext notelength() {
			return getRuleContext(NotelengthContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (25 - 25)) | (1L << (31 - 25)) | (1L << (68 - 25)))) != 0)) {
				{
				setState(283); accidental();
				}
			}

			setState(286); basenote();
			setState(288);
			_la = _input.LA(1);
			if (_la==47 || _la==58) {
				{
				setState(287); octave();
				}
			}

			setState(291);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 20) | (1L << 26) | (1L << 33) | (1L << 38) | (1L << 56) | (1L << 59))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (79 - 66)) | (1L << (83 - 66)))) != 0)) {
				{
				setState(290); notelength();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OctaveContext extends ParserRuleContext {
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOctave(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_octave);
		int _la;
		try {
			setState(303);
			switch (_input.LA(1)) {
			case 58:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(293); match(58);
					}
					}
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==58 );
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298); match(47);
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==47 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccidentalContext extends ParserRuleContext {
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_accidental);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); match(68);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(68);
				setState(307); match(68);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); match(25);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309); match(25);
				setState(310); match(25);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311); match(31);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestContext extends ParserRuleContext {
		public NotelengthContext notelength() {
			return getRuleContext(NotelengthContext.class,0);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(78);
			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 20) | (1L << 26) | (1L << 33) | (1L << 38) | (1L << 56) | (1L << 59))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (79 - 66)) | (1L << (83 - 66)))) != 0)) {
				{
				setState(315); notelength();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultinoteContext extends ParserRuleContext {
		public NotelengthContext notelength() {
			return getRuleContext(NotelengthContext.class,0);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public PitchContext pitch(int i) {
			return getRuleContext(PitchContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public List<PitchContext> pitch() {
			return getRuleContexts(PitchContext.class);
		}
		public MultinoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multinote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMultinote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMultinote(this);
		}
	}

	public final MultinoteContext multinote() throws RecognitionException {
		MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(4);
			setState(320);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(319); space();
				}
			}

			setState(322); pitch();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 24) | (1L << 25) | (1L << 28) | (1L << 31) | (1L << 42) | (1L << 44) | (1L << 46) | (1L << 55) | (1L << 60))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (69 - 68)) | (1L << (71 - 68)) | (1L << (74 - 68)) | (1L << (80 - 68)) | (1L << (WHITESPACE - 68)))) != 0)) {
				{
				setState(325);
				switch (_input.LA(1)) {
				case WHITESPACE:
					{
					setState(323); space();
					}
					break;
				case 1:
				case 6:
				case 8:
				case 24:
				case 25:
				case 28:
				case 31:
				case 42:
				case 44:
				case 46:
				case 55:
				case 60:
				case 68:
				case 69:
				case 71:
				case 74:
				case 80:
					{
					setState(324); pitch();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330); match(45);
			setState(332);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 20) | (1L << 26) | (1L << 33) | (1L << 38) | (1L << 56) | (1L << 59))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (79 - 66)) | (1L << (83 - 66)))) != 0)) {
				{
				setState(331); notelength();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthContext extends ParserRuleContext {
		public NotelengthmultiplyContext notelengthmultiply() {
			return getRuleContext(NotelengthmultiplyContext.class,0);
		}
		public NotelengthnumeratorContext notelengthnumerator() {
			return getRuleContext(NotelengthnumeratorContext.class,0);
		}
		public NotelengthhalfContext notelengthhalf() {
			return getRuleContext(NotelengthhalfContext.class,0);
		}
		public NotelengthfullContext notelengthfull() {
			return getRuleContext(NotelengthfullContext.class,0);
		}
		public NotelengthdenominatorContext notelengthdenominator() {
			return getRuleContext(NotelengthdenominatorContext.class,0);
		}
		public NotelengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelength(this);
		}
	}

	public final NotelengthContext notelength() throws RecognitionException {
		NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_notelength);
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); notelengthfull();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); notelengthmultiply();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336); notelengthnumerator();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337); notelengthdenominator();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338); notelengthhalf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthfullContext extends ParserRuleContext {
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NotelengthfullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthfull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthfull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthfull(this);
		}
	}

	public final NotelengthfullContext notelengthfull() throws RecognitionException {
		NotelengthfullContext _localctx = new NotelengthfullContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_notelengthfull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); number();
			setState(342); match(83);
			setState(343); number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthmultiplyContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NotelengthmultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthmultiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthmultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthmultiply(this);
		}
	}

	public final NotelengthmultiplyContext notelengthmultiply() throws RecognitionException {
		NotelengthmultiplyContext _localctx = new NotelengthmultiplyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_notelengthmultiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthnumeratorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NotelengthnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthnumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthnumerator(this);
		}
	}

	public final NotelengthnumeratorContext notelengthnumerator() throws RecognitionException {
		NotelengthnumeratorContext _localctx = new NotelengthnumeratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_notelengthnumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); number();
			setState(348); match(83);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthdenominatorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NotelengthdenominatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthdenominator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthdenominator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthdenominator(this);
		}
	}

	public final NotelengthdenominatorContext notelengthdenominator() throws RecognitionException {
		NotelengthdenominatorContext _localctx = new NotelengthdenominatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_notelengthdenominator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(83);
			setState(351); number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthhalfContext extends ParserRuleContext {
		public NotelengthhalfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthhalf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthhalf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthhalf(this);
		}
	}

	public final NotelengthhalfContext notelengthhalf() throws RecognitionException {
		NotelengthhalfContext _localctx = new NotelengthhalfContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_notelengthhalf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(83);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupletContext extends ParserRuleContext {
		public DupletContext duplet() {
			return getRuleContext(DupletContext.class,0);
		}
		public QuadrupletContext quadruplet() {
			return getRuleContext(QuadrupletContext.class,0);
		}
		public TripletContext triplet() {
			return getRuleContext(TripletContext.class,0);
		}
		public TupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet(this);
		}
	}

	public final TupletContext tuplet() throws RecognitionException {
		TupletContext _localctx = new TupletContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tuplet);
		try {
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); duplet();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); triplet();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357); quadruplet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DupletContext extends ParserRuleContext {
		public List<TupletnoteContext> tupletnote() {
			return getRuleContexts(TupletnoteContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TupletnoteContext tupletnote(int i) {
			return getRuleContext(TupletnoteContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public DupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterDuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitDuplet(this);
		}
	}

	public final DupletContext duplet() throws RecognitionException {
		DupletContext _localctx = new DupletContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_duplet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(50);
			setState(361); match(59);
			setState(363);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(362); space();
				}
			}

			setState(365); tupletnote();
			setState(367);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(366); space();
				}
			}

			setState(369); tupletnote();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripletContext extends ParserRuleContext {
		public List<TupletnoteContext> tupletnote() {
			return getRuleContexts(TupletnoteContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TupletnoteContext tupletnote(int i) {
			return getRuleContext(TupletnoteContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public TripletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTriplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTriplet(this);
		}
	}

	public final TripletContext triplet() throws RecognitionException {
		TripletContext _localctx = new TripletContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_triplet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(50);
			setState(372); match(79);
			setState(374);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(373); space();
				}
			}

			setState(376); tupletnote();
			setState(378);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(377); space();
				}
			}

			setState(380); tupletnote();
			setState(382);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(381); space();
				}
			}

			setState(384); tupletnote();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuadrupletContext extends ParserRuleContext {
		public List<TupletnoteContext> tupletnote() {
			return getRuleContexts(TupletnoteContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TupletnoteContext tupletnote(int i) {
			return getRuleContext(TupletnoteContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public QuadrupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadruplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterQuadruplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitQuadruplet(this);
		}
	}

	public final QuadrupletContext quadruplet() throws RecognitionException {
		QuadrupletContext _localctx = new QuadrupletContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_quadruplet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(50);
			setState(387); match(12);
			setState(389);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(388); space();
				}
			}

			setState(391); tupletnote();
			setState(393);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(392); space();
				}
			}

			setState(395); tupletnote();
			setState(397);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(396); space();
				}
			}

			setState(399); tupletnote();
			setState(401);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(400); space();
				}
			}

			setState(403); tupletnote();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupletnoteContext extends ParserRuleContext {
		public MultinoteContext multinote() {
			return getRuleContext(MultinoteContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public TupletnoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletnote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTupletnote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTupletnote(this);
		}
	}

	public final TupletnoteContext tupletnote() throws RecognitionException {
		TupletnoteContext _localctx = new TupletnoteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tupletnote);
		try {
			setState(407);
			switch (_input.LA(1)) {
			case 1:
			case 6:
			case 8:
			case 24:
			case 25:
			case 28:
			case 31:
			case 42:
			case 44:
			case 46:
			case 55:
			case 60:
			case 68:
			case 69:
			case 71:
			case 74:
			case 80:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); pitch();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); multinote();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BarlineContext extends ParserRuleContext {
		public BarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBarline(this);
		}
	}

	public final BarlineContext barline() throws RecognitionException {
		BarlineContext _localctx = new BarlineContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_barline);
		try {
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); match(4);
				setState(410); match(39);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); match(39);
				setState(412); match(45);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413); match(49);
				setState(414); match(39);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415); match(39);
				setState(416); match(49);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417); match(4);
				setState(418); match(38);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(419); match(4);
				setState(420); match(59);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(421); match(39);
				setState(422); match(39);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(423); match(39);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidtunefieldContext extends ParserRuleContext {
		public FieldvoiceContext fieldvoice() {
			return getRuleContext(FieldvoiceContext.class,0);
		}
		public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midtunefield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMidtunefield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMidtunefield(this);
		}
	}

	public final MidtunefieldContext midtunefield() throws RecognitionException {
		MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_midtunefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); fieldvoice();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricContext extends ParserRuleContext {
		public LyricunderscoreContext lyricunderscore(int i) {
			return getRuleContext(LyricunderscoreContext.class,i);
		}
		public List<LyricunderscoreContext> lyricunderscore() {
			return getRuleContexts(LyricunderscoreContext.class);
		}
		public List<LyricstarContext> lyricstar() {
			return getRuleContexts(LyricstarContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<LyricwordContext> lyricword() {
			return getRuleContexts(LyricwordContext.class);
		}
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public LyricbarContext lyricbar(int i) {
			return getRuleContext(LyricbarContext.class,i);
		}
		public LyricwordContext lyricword(int i) {
			return getRuleContext(LyricwordContext.class,i);
		}
		public List<LyricbarContext> lyricbar() {
			return getRuleContexts(LyricbarContext.class);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public LyricstarContext lyricstar(int i) {
			return getRuleContext(LyricstarContext.class,i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lyric);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(11);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(434);
					switch (_input.LA(1)) {
					case 25:
						{
						setState(429); lyricunderscore();
						}
						break;
					case 3:
						{
						setState(430); lyricstar();
						}
						break;
					case 39:
						{
						setState(431); lyricbar();
						}
						break;
					case 1:
					case 2:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 12:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 23:
					case 24:
					case 26:
					case 27:
					case 28:
					case 29:
					case 30:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 40:
					case 41:
					case 42:
					case 43:
					case 44:
					case 46:
					case 47:
					case 48:
					case 49:
					case 50:
					case 51:
					case 52:
					case 53:
					case 54:
					case 55:
					case 56:
					case 57:
					case 58:
					case 59:
					case 60:
					case 61:
					case 62:
					case 63:
					case 64:
					case 65:
					case 66:
					case 67:
					case 69:
					case 70:
					case 71:
					case 72:
					case 73:
					case 74:
					case 75:
					case 76:
					case 77:
					case 78:
					case 79:
					case 80:
					case 81:
					case 82:
					case 84:
					case 86:
						{
						setState(432); lyricword();
						}
						break;
					case WHITESPACE:
						{
						setState(433); space();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(439); endofline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricunderscoreContext extends ParserRuleContext {
		public LyricunderscoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyricunderscore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyricunderscore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyricunderscore(this);
		}
	}

	public final LyricunderscoreContext lyricunderscore() throws RecognitionException {
		LyricunderscoreContext _localctx = new LyricunderscoreContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lyricunderscore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricstarContext extends ParserRuleContext {
		public LyricstarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyricstar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyricstar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyricstar(this);
		}
	}

	public final LyricstarContext lyricstar() throws RecognitionException {
		LyricstarContext _localctx = new LyricstarContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lyricstar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricbarContext extends ParserRuleContext {
		public LyricbarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyricbar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyricbar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyricbar(this);
		}
	}

	public final LyricbarContext lyricbar() throws RecognitionException {
		LyricbarContext _localctx = new LyricbarContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_lyricbar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricwordContext extends ParserRuleContext {
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public PunctuationContext punctuation(int i) {
			return getRuleContext(PunctuationContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<PunctuationContext> punctuation() {
			return getRuleContexts(PunctuationContext.class);
		}
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public LyricwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyricword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyricword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyricword(this);
		}
	}

	public final LyricwordContext lyricword() throws RecognitionException {
		LyricwordContext _localctx = new LyricwordContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lyricword);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(450);
					switch (_input.LA(1)) {
					case 1:
					case 2:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 21:
					case 24:
					case 27:
					case 28:
					case 29:
					case 30:
					case 32:
					case 34:
					case 35:
					case 37:
					case 40:
					case 42:
					case 43:
					case 44:
					case 46:
					case 51:
					case 52:
					case 53:
					case 54:
					case 55:
					case 60:
					case 61:
					case 62:
					case 63:
					case 64:
					case 65:
					case 67:
					case 69:
					case 71:
					case 72:
					case 74:
					case 75:
					case 76:
					case 77:
					case 78:
					case 80:
					case 81:
					case 82:
					case 86:
						{
						setState(447); character();
						}
						break;
					case 5:
					case 12:
					case 20:
					case 26:
					case 33:
					case 38:
					case 56:
					case 59:
					case 66:
					case 79:
						{
						setState(448); number();
						}
						break;
					case 19:
					case 23:
					case 36:
					case 41:
					case 47:
					case 48:
					case 49:
					case 50:
					case 57:
					case 58:
					case 70:
					case 73:
					case 84:
						{
						setState(449); punctuation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public CommenttextContext commenttext() {
			return getRuleContext(CommenttextContext.class,0);
		}
		public TerminalNode LINEFEED() { return getToken(ABCMusicParser.LINEFEED, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(22);
			setState(455); commenttext();
			setState(456); match(LINEFEED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndoflineContext extends ParserRuleContext {
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode LINEFEED() { return getToken(ABCMusicParser.LINEFEED, 0); }
		public EndoflineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endofline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEndofline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEndofline(this);
		}
	}

	public final EndoflineContext endofline() throws RecognitionException {
		EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_endofline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(458); space();
				}
			}

			setState(463);
			switch (_input.LA(1)) {
			case 22:
				{
				setState(461); comment();
				}
				break;
			case LINEFEED:
				{
				setState(462); match(LINEFEED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(465); endofline();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommenttextContext extends ParserRuleContext {
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
		public CommenttextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commenttext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterCommenttext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitCommenttext(this);
		}
	}

	public final CommenttextContext commenttext() throws RecognitionException {
		CommenttextContext _localctx = new CommenttextContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_commenttext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (67 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (78 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (83 - 64)) | (1L << (84 - 64)) | (1L << (85 - 64)) | (1L << (86 - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(468);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==LINEFEED) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(474);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==22 || _la==LINEFEED) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(WHITESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasenoteContext extends ParserRuleContext {
		public BasenoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basenote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBasenote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBasenote(this);
		}
	}

	public final BasenoteContext basenote() throws RecognitionException {
		BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_basenote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 24) | (1L << 28) | (1L << 42) | (1L << 44) | (1L << 46) | (1L << 55) | (1L << 60))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (74 - 69)) | (1L << (80 - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 21) | (1L << 24) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 34) | (1L << 35) | (1L << 37) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 46) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (67 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (75 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (78 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (86 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PunctuationContext extends ParserRuleContext {
		public PunctuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punctuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPunctuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPunctuation(this);
		}
	}

	public final PunctuationContext punctuation() throws RecognitionException {
		PunctuationContext _localctx = new PunctuationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_punctuation);
		try {
			setState(500);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(486); match(19);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 2);
				{
				setState(487); match(58);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 3);
				{
				setState(488); match(57);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 4);
				{
				setState(489); match(41);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 5);
				{
				setState(490); match(47);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 6);
				{
				setState(491); match(73);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 7);
				{
				setState(492); match(49);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 8);
				{
				setState(493); match(70);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 9);
				{
				setState(494); match(50);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 10);
				{
				setState(495); match(23);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 11);
				{
				setState(496); match(48);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 12);
				{
				setState(497); match(36);
				setState(498); match(48);
				}
				break;
			case 84:
				enterOuterAlt(_localctx, 13);
				{
				setState(499); match(84);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 12) | (1L << 20) | (1L << 26) | (1L << 33) | (1L << 38) | (1L << 56) | (1L << 59))) != 0) || _la==66 || _la==79) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(504); digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(507); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3Z\u0200\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\3\2\3\2\3\2\3\2\3\3\5\3|\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\5\3\5\3\5\5\5\u0090\n\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u00a8\n\13\3\13\3\13\3\13\3\f\3\f\5\f\u00af\n\f\3"+
		"\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ba\n\r\3\r\3\r\3\r\3\16"+
		"\3\16\5\16\u00c1\n\16\3\16\3\16\5\16\u00c5\n\16\3\16\3\16\5\16\u00c9\n"+
		"\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17\3\17\5\17\u00d2\n\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u00d9\n\20\3\20\3\20\5\20\u00dd\n\20\3\20\3\20\5"+
		"\20\u00e1\n\20\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u00f3\n\23\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u00fa\n\24\3\24\5\24\u00fd\n\24\3\25\3\25\3\26\3\26\3\27\7\27\u0104"+
		"\n\27\f\27\16\27\u0107\13\27\3\30\3\30\5\30\u010b\n\30\3\31\6\31\u010e"+
		"\n\31\r\31\16\31\u010f\3\31\3\31\5\31\u0114\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u011c\n\32\3\33\5\33\u011f\n\33\3\33\3\33\5\33\u0123\n\33"+
		"\3\33\5\33\u0126\n\33\3\34\6\34\u0129\n\34\r\34\16\34\u012a\3\34\6\34"+
		"\u012e\n\34\r\34\16\34\u012f\5\34\u0132\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u013b\n\35\3\36\3\36\5\36\u013f\n\36\3\37\3\37\5\37\u0143"+
		"\n\37\3\37\3\37\3\37\7\37\u0148\n\37\f\37\16\37\u014b\13\37\3\37\3\37"+
		"\5\37\u014f\n\37\3 \3 \3 \3 \3 \5 \u0156\n \3!\3!\3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3&\3&\3&\5&\u0169\n&\3\'\3\'\3\'\5\'\u016e\n\'\3\'"+
		"\3\'\5\'\u0172\n\'\3\'\3\'\3(\3(\3(\5(\u0179\n(\3(\3(\5(\u017d\n(\3(\3"+
		"(\5(\u0181\n(\3(\3(\3)\3)\3)\5)\u0188\n)\3)\3)\5)\u018c\n)\3)\3)\5)\u0190"+
		"\n)\3)\3)\5)\u0194\n)\3)\3)\3*\3*\5*\u019a\n*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u01ab\n+\3,\3,\3-\3-\3-\3-\3-\3-\7-\u01b5\n-"+
		"\f-\16-\u01b8\13-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\6\61\u01c5"+
		"\n\61\r\61\16\61\u01c6\3\62\3\62\3\62\3\62\3\63\5\63\u01ce\n\63\3\63\3"+
		"\63\5\63\u01d2\n\63\3\63\5\63\u01d5\n\63\3\64\7\64\u01d8\n\64\f\64\16"+
		"\64\u01db\13\64\3\65\7\65\u01de\n\65\f\65\16\65\u01e1\13\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u01f7\n"+
		"9\3:\3:\3;\6;\u01fc\n;\r;\16;\u01fd\3;\2<\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\b\4."+
		".WW\3ZZ\4\30\30ZZ\20\3\3\b\b\n\n\32\32\36\36,,..\60\6099>>GGIILLRR\26"+
		"\3\4\b\f\17\24\27\27\32\32\35 \"\"$%\'\'**,.\60\60\659>CEEGGIJLPRTXX\f"+
		"\7\7\16\16\26\26\34\34##((::==DDQQ\u0225\2v\3\2\2\2\4{\3\2\2\2\6\u0089"+
		"\3\2\2\2\b\u008c\3\2\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16\u009b\3\2"+
		"\2\2\20\u009d\3\2\2\2\22\u00a2\3\2\2\2\24\u00a4\3\2\2\2\26\u00ac\3\2\2"+
		"\2\30\u00b6\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00d6\3\2\2\2"+
		" \u00e8\3\2\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00f7\3\2\2\2(\u00fe\3"+
		"\2\2\2*\u0100\3\2\2\2,\u0105\3\2\2\2.\u010a\3\2\2\2\60\u010d\3\2\2\2\62"+
		"\u011b\3\2\2\2\64\u011e\3\2\2\2\66\u0131\3\2\2\28\u013a\3\2\2\2:\u013c"+
		"\3\2\2\2<\u0140\3\2\2\2>\u0155\3\2\2\2@\u0157\3\2\2\2B\u015b\3\2\2\2D"+
		"\u015d\3\2\2\2F\u0160\3\2\2\2H\u0163\3\2\2\2J\u0168\3\2\2\2L\u016a\3\2"+
		"\2\2N\u0175\3\2\2\2P\u0184\3\2\2\2R\u0199\3\2\2\2T\u01aa\3\2\2\2V\u01ac"+
		"\3\2\2\2X\u01ae\3\2\2\2Z\u01bb\3\2\2\2\\\u01bd\3\2\2\2^\u01bf\3\2\2\2"+
		"`\u01c4\3\2\2\2b\u01c8\3\2\2\2d\u01cd\3\2\2\2f\u01d9\3\2\2\2h\u01df\3"+
		"\2\2\2j\u01e2\3\2\2\2l\u01e4\3\2\2\2n\u01e6\3\2\2\2p\u01f6\3\2\2\2r\u01f8"+
		"\3\2\2\2t\u01fb\3\2\2\2vw\5\4\3\2wx\5,\27\2xy\7\1\2\2y\3\3\2\2\2z|\5d"+
		"\63\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5\b\5\2~\177\5\f\7\2\177\u0080\5"+
		"\6\4\2\u0080\u0081\5$\23\2\u0081\5\3\2\2\2\u0082\u0088\5\20\t\2\u0083"+
		"\u0088\5\24\13\2\u0084\u0088\5\30\r\2\u0085\u0088\5\34\17\2\u0086\u0088"+
		"\5 \21\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\7\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\7\37\2\2\u008d\u008f\7\63\2\2\u008e\u0090\5j\66\2\u008f\u008e\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\n\6\2\u0092\u0093"+
		"\5d\63\2\u0093\t\3\2\2\2\u0094\u0095\5t;\2\u0095\13\3\2\2\2\u0096\u0097"+
		"\7*\2\2\u0097\u0098\7\63\2\2\u0098\u0099\5\16\b\2\u0099\u009a\5d\63\2"+
		"\u009a\r\3\2\2\2\u009b\u009c\5h\65\2\u009c\17\3\2\2\2\u009d\u009e\7\60"+
		"\2\2\u009e\u009f\7\63\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\5d\63\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a3\5h\65\2\u00a3\23\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5"+
		"\u00a7\7\63\2\2\u00a6\u00a8\5j\66\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\5d\63\2\u00ab"+
		"\25\3\2\2\2\u00ac\u00ae\5t;\2\u00ad\u00af\5j\66\2\u00ae\u00ad\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\7U\2\2\u00b1\u00b3"+
		"\5j\66\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\5t;\2\u00b5\27\3\2\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00b9\7\63\2"+
		"\2\u00b8\u00ba\5j\66\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd\5d\63\2\u00bd\31\3\2\2\2\u00be"+
		"\u00c0\7\60\2\2\u00bf\u00c1\7)\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00cd\3\2\2\2\u00c2\u00c4\5t;\2\u00c3\u00c5\5j\66\2\u00c4\u00c3"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7U\2\2\u00c7"+
		"\u00c9\5j\66\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\5t;\2\u00cb\u00cd\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00c2"+
		"\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d1\7\63\2\2\u00d0"+
		"\u00d2\5j\66\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\5d\63\2\u00d5\35\3\2\2\2\u00d6"+
		"\u00d8\5t;\2\u00d7\u00d9\5j\66\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7U\2\2\u00db\u00dd\5j\66\2\u00dc\u00db"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\5t;\2\u00df"+
		"\u00e1\5j\66\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\7!\2\2\u00e3\u00e5\5j\66\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5t;\2\u00e7\37\3\2\2\2"+
		"\u00e8\u00e9\7S\2\2\u00e9\u00ea\7\63\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec"+
		"\5d\63\2\u00ec!\3\2\2\2\u00ed\u00ee\5h\65\2\u00ee#\3\2\2\2\u00ef\u00f0"+
		"\7A\2\2\u00f0\u00f2\7\63\2\2\u00f1\u00f3\5j\66\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5&\24\2\u00f5\u00f6\5d"+
		"\63\2\u00f6%\3\2\2\2\u00f7\u00f9\5l\67\2\u00f8\u00fa\5(\25\2\u00f9\u00f8"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5*\26\2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\'\3\2\2\2\u00fe\u00ff\t\2\2\2"+
		"\u00ff)\3\2\2\2\u0100\u0101\7N\2\2\u0101+\3\2\2\2\u0102\u0104\5.\30\2"+
		"\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106-\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\5\60\31\2\u0109"+
		"\u010b\5V,\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b/\3\2\2\2\u010c"+
		"\u010e\5\62\32\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\5d\63\2\u0112"+
		"\u0114\5X-\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\61\3\2\2\2"+
		"\u0115\u011c\5\64\33\2\u0116\u011c\5:\36\2\u0117\u011c\5<\37\2\u0118\u011c"+
		"\5J&\2\u0119\u011c\5T+\2\u011a\u011c\5j\66\2\u011b\u0115\3\2\2\2\u011b"+
		"\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c\63\3\2\2\2\u011d\u011f\58\35\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\5l\67\2\u0121"+
		"\u0123\5\66\34\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3"+
		"\2\2\2\u0124\u0126\5> \2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\65\3\2\2\2\u0127\u0129\7<\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0132\3\2\2\2\u012c\u012e"+
		"\7\61\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012d"+
		"\3\2\2\2\u0132\67\3\2\2\2\u0133\u013b\7F\2\2\u0134\u0135\7F\2\2\u0135"+
		"\u013b\7F\2\2\u0136\u013b\7\33\2\2\u0137\u0138\7\33\2\2\u0138\u013b\7"+
		"\33\2\2\u0139\u013b\7!\2\2\u013a\u0133\3\2\2\2\u013a\u0134\3\2\2\2\u013a"+
		"\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0139\3\2\2\2\u013b9\3\2\2\2"+
		"\u013c\u013e\7P\2\2\u013d\u013f\5> \2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f;\3\2\2\2\u0140\u0142\7\6\2\2\u0141\u0143\5j\66\2\u0142"+
		"\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\5\64"+
		"\33\2\u0145\u0148\5j\66\2\u0146\u0148\5\64\33\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7/\2\2\u014d"+
		"\u014f\5> \2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f=\3\2\2\2\u0150"+
		"\u0156\5@!\2\u0151\u0156\5B\"\2\u0152\u0156\5D#\2\u0153\u0156\5F$\2\u0154"+
		"\u0156\5H%\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2"+
		"\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156?\3\2\2\2\u0157\u0158"+
		"\5t;\2\u0158\u0159\7U\2\2\u0159\u015a\5t;\2\u015aA\3\2\2\2\u015b\u015c"+
		"\5t;\2\u015cC\3\2\2\2\u015d\u015e\5t;\2\u015e\u015f\7U\2\2\u015fE\3\2"+
		"\2\2\u0160\u0161\7U\2\2\u0161\u0162\5t;\2\u0162G\3\2\2\2\u0163\u0164\7"+
		"U\2\2\u0164I\3\2\2\2\u0165\u0169\5L\'\2\u0166\u0169\5N(\2\u0167\u0169"+
		"\5P)\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"K\3\2\2\2\u016a\u016b\7\64\2\2\u016b\u016d\7=\2\2\u016c\u016e\5j\66\2"+
		"\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171"+
		"\5R*\2\u0170\u0172\5j\66\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\5R*\2\u0174M\3\2\2\2\u0175\u0176\7\64\2\2\u0176"+
		"\u0178\7Q\2\2\u0177\u0179\5j\66\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017c\5R*\2\u017b\u017d\5j\66\2\u017c\u017b"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\5R*\2\u017f"+
		"\u0181\5j\66\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\5R*\2\u0183O\3\2\2\2\u0184\u0185\7\64\2\2\u0185\u0187"+
		"\7\16\2\2\u0186\u0188\5j\66\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018b\5R*\2\u018a\u018c\5j\66\2\u018b\u018a"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\5R*\2\u018e"+
		"\u0190\5j\66\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0193\5R*\2\u0192\u0194\5j\66\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5R*\2\u0196Q\3\2\2\2\u0197\u019a"+
		"\5\64\33\2\u0198\u019a\5<\37\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2"+
		"\u019aS\3\2\2\2\u019b\u019c\7\6\2\2\u019c\u01ab\7)\2\2\u019d\u019e\7)"+
		"\2\2\u019e\u01ab\7/\2\2\u019f\u01a0\7\63\2\2\u01a0\u01ab\7)\2\2\u01a1"+
		"\u01a2\7)\2\2\u01a2\u01ab\7\63\2\2\u01a3\u01a4\7\6\2\2\u01a4\u01ab\7("+
		"\2\2\u01a5\u01a6\7\6\2\2\u01a6\u01ab\7=\2\2\u01a7\u01a8\7)\2\2\u01a8\u01ab"+
		"\7)\2\2\u01a9\u01ab\7)\2\2\u01aa\u019b\3\2\2\2\u01aa\u019d\3\2\2\2\u01aa"+
		"\u019f\3\2\2\2\u01aa\u01a1\3\2\2\2\u01aa\u01a3\3\2\2\2\u01aa\u01a5\3\2"+
		"\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a9\3\2\2\2\u01abU\3\2\2\2\u01ac\u01ad"+
		"\5 \21\2\u01adW\3\2\2\2\u01ae\u01b6\7\r\2\2\u01af\u01b5\5Z.\2\u01b0\u01b5"+
		"\5\\/\2\u01b1\u01b5\5^\60\2\u01b2\u01b5\5`\61\2\u01b3\u01b5\5j\66\2\u01b4"+
		"\u01af\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\5d"+
		"\63\2\u01baY\3\2\2\2\u01bb\u01bc\7\33\2\2\u01bc[\3\2\2\2\u01bd\u01be\7"+
		"\5\2\2\u01be]\3\2\2\2\u01bf\u01c0\7)\2\2\u01c0_\3\2\2\2\u01c1\u01c5\5"+
		"n8\2\u01c2\u01c5\5t;\2\u01c3\u01c5\5p9\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7a\3\2\2\2\u01c8\u01c9\7\30\2\2\u01c9\u01ca\5f\64\2"+
		"\u01ca\u01cb\7Z\2\2\u01cbc\3\2\2\2\u01cc\u01ce\5j\66\2\u01cd\u01cc\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01d2\5b\62\2\u01d0"+
		"\u01d2\7Z\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d4\3\2"+
		"\2\2\u01d3\u01d5\5d\63\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"e\3\2\2\2\u01d6\u01d8\n\3\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01dag\3\2\2\2\u01db\u01d9\3"+
		"\2\2\2\u01dc\u01de\n\4\2\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0i\3\2\2\2\u01e1\u01df\3\2\2\2"+
		"\u01e2\u01e3\7Y\2\2\u01e3k\3\2\2\2\u01e4\u01e5\t\5\2\2\u01e5m\3\2\2\2"+
		"\u01e6\u01e7\t\6\2\2\u01e7o\3\2\2\2\u01e8\u01f7\7\25\2\2\u01e9\u01f7\7"+
		"<\2\2\u01ea\u01f7\7;\2\2\u01eb\u01f7\7+\2\2\u01ec\u01f7\7\61\2\2\u01ed"+
		"\u01f7\7K\2\2\u01ee\u01f7\7\63\2\2\u01ef\u01f7\7H\2\2\u01f0\u01f7\7\64"+
		"\2\2\u01f1\u01f7\7\31\2\2\u01f2\u01f7\7\62\2\2\u01f3\u01f4\7&\2\2\u01f4"+
		"\u01f7\7\62\2\2\u01f5\u01f7\7V\2\2\u01f6\u01e8\3\2\2\2\u01f6\u01e9\3\2"+
		"\2\2\u01f6\u01ea\3\2\2\2\u01f6\u01eb\3\2\2\2\u01f6\u01ec\3\2\2\2\u01f6"+
		"\u01ed\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f6\u01f0\3\2"+
		"\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f6"+
		"\u01f5\3\2\2\2\u01f7q\3\2\2\2\u01f8\u01f9\t\7\2\2\u01f9s\3\2\2\2\u01fa"+
		"\u01fc\5r:\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2"+
		"\2\u01fd\u01fe\3\2\2\2\u01feu\3\2\2\2?{\u0087\u0089\u008f\u00a7\u00ae"+
		"\u00b2\u00b9\u00c0\u00c4\u00c8\u00cc\u00d1\u00d8\u00dc\u00e0\u00e4\u00f2"+
		"\u00f9\u00fc\u0105\u010a\u010f\u0113\u011b\u011e\u0122\u0125\u012a\u012f"+
		"\u0131\u013a\u013e\u0142\u0147\u0149\u014e\u0155\u0168\u016d\u0171\u0178"+
		"\u017c\u0180\u0187\u018b\u018f\u0193\u0199\u01aa\u01b4\u01b6\u01c4\u01c6"+
		"\u01cd\u01d1\u01d4\u01d9\u01df\u01f6\u01fd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}