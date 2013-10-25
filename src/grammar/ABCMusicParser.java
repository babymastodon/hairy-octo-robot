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
		T__51=1, T__50=2, T__49=3, T__48=4, T__47=5, T__46=6, T__45=7, T__44=8, 
		T__43=9, T__42=10, T__41=11, T__40=12, T__39=13, T__38=14, T__37=15, T__36=16, 
		T__35=17, T__34=18, T__33=19, T__32=20, T__31=21, T__30=22, T__29=23, 
		T__28=24, T__27=25, T__26=26, T__25=27, T__24=28, T__23=29, T__22=30, 
		T__21=31, T__20=32, T__19=33, T__18=34, T__17=35, T__16=36, T__15=37, 
		T__14=38, T__13=39, T__12=40, T__11=41, T__10=42, T__9=43, T__8=44, T__7=45, 
		T__6=46, T__5=47, T__4=48, T__3=49, T__2=50, T__1=51, T__0=52, WHITESPACE=53, 
		DIGIT=54, WORD=55, LINEFEED=56;
	public static final String[] tokenNames = {
		"<INVALID>", "'E'", "'['", "'*'", "'A'", "'X:'", "'d'", "'T:'", "'Q:'", 
		"'w:'", "'-'", "'M:'", "'^^'", "'%'", "'_'", "'D'", "'c'", "'='", "'[|'", 
		"'[1'", "'|'", "'C|'", "'g'", "'b'", "']'", "'C'", "'C:'", "','", "'-'", 
		"'('", "'f'", "'''", "'|]'", "' '", "'G'", "'[2'", "'|:'", "'^'", "'a'", 
		"'L:'", "'__'", "'B'", "':|'", "'V:'", "'e'", "'||'", "'m'", "'z'", "'K:'", 
		"'F'", "'/'", "'~'", "'#'", "WHITESPACE", "DIGIT", "WORD", "LINEFEED"
	};
	public static final int
		RULE_abctune = 0, RULE_abcheader = 1, RULE_fieldnumber = 2, RULE_fieldtitle = 3, 
		RULE_fieldtitletext = 4, RULE_otherfields = 5, RULE_fieldcomposer = 6, 
		RULE_composername = 7, RULE_fielddefaultlength = 8, RULE_fieldmeter = 9, 
		RULE_fieldtempo = 10, RULE_fieldvoice = 11, RULE_fieldkey = 12, RULE_key = 13, 
		RULE_keynote = 14, RULE_keyaccidental = 15, RULE_modeminor = 16, RULE_meter = 17, 
		RULE_meterfraction = 18, RULE_tempo = 19, RULE_abcmusic = 20, RULE_abcline = 21, 
		RULE_notesline = 22, RULE_element = 23, RULE_noteelement = 24, RULE_note = 25, 
		RULE_noteorrest = 26, RULE_pitch = 27, RULE_octave = 28, RULE_notelength = 29, 
		RULE_notelengthstrict = 30, RULE_accidental = 31, RULE_basenote = 32, 
		RULE_rest = 33, RULE_tupletelement = 34, RULE_tupletspec = 35, RULE_multinote = 36, 
		RULE_barline = 37, RULE_nthrepeat = 38, RULE_midtunefield = 39, RULE_comment = 40, 
		RULE_endofline = 41, RULE_lyric = 42, RULE_lyrical_element = 43, RULE_text = 44, 
		RULE_lyric_text = 45, RULE_space = 46;
	public static final String[] ruleNames = {
		"abctune", "abcheader", "fieldnumber", "fieldtitle", "fieldtitletext", 
		"otherfields", "fieldcomposer", "composername", "fielddefaultlength", 
		"fieldmeter", "fieldtempo", "fieldvoice", "fieldkey", "key", "keynote", 
		"keyaccidental", "modeminor", "meter", "meterfraction", "tempo", "abcmusic", 
		"abcline", "notesline", "element", "noteelement", "note", "noteorrest", 
		"pitch", "octave", "notelength", "notelengthstrict", "accidental", "basenote", 
		"rest", "tupletelement", "tupletspec", "multinote", "barline", "nthrepeat", 
		"midtunefield", "comment", "endofline", "lyric", "lyrical_element", "text", 
		"lyric_text", "space"
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
			setState(94); abcheader();
			setState(95); abcmusic();
			setState(96); match(EOF);
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
		public OtherfieldsContext otherfields(int i) {
			return getRuleContext(OtherfieldsContext.class,i);
		}
		public List<OtherfieldsContext> otherfields() {
			return getRuleContexts(OtherfieldsContext.class);
		}
		public FieldkeyContext fieldkey() {
			return getRuleContext(FieldkeyContext.class,0);
		}
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public FieldtitleContext fieldtitle() {
			return getRuleContext(FieldtitleContext.class,0);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public FieldnumberContext fieldnumber() {
			return getRuleContext(FieldnumberContext.class,0);
		}
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINEFEED) {
				{
				{
				setState(98); match(LINEFEED);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); fieldnumber();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(105); match(LINEFEED);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13) {
				{
				{
				setState(111); comment();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINEFEED) {
				{
				{
				setState(117); match(LINEFEED);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); fieldtitle();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(124); match(LINEFEED);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(130); otherfields();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINEFEED) {
				{
				{
				setState(136); match(LINEFEED);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); fieldkey();
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(143); match(LINEFEED);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
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
		enterRule(_localctx, 4, RULE_fieldnumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(5);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(150); match(33);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156); match(DIGIT);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(157); match(33);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); endofline();
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
		public FieldtitletextContext fieldtitletext() {
			return getRuleContext(FieldtitletextContext.class,0);
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
		enterRule(_localctx, 6, RULE_fieldtitle);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(7);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(166); match(33);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(172); fieldtitletext();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(173); match(33);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179); endofline();
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

	public static class FieldtitletextContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public FieldtitletextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldtitletext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldtitletext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldtitletext(this);
		}
	}

	public final FieldtitletextContext fieldtitletext() throws RecognitionException {
		FieldtitletextContext _localctx = new FieldtitletextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldtitletext);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(201);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(182); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(181); match(33);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(184); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 2:
						{
						setState(186); text();
						}
						break;

					case 3:
						{
						setState(187); match(DIGIT);
						}
						break;

					case 4:
						{
						{
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(188); space();
							}
							}
							setState(193);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(194); match(DIGIT);
						setState(198);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(195); space();
								}
								} 
							}
							setState(200);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						}
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class OtherfieldsContext extends ParserRuleContext {
		public FieldvoiceContext fieldvoice() {
			return getRuleContext(FieldvoiceContext.class,0);
		}
		public FieldmeterContext fieldmeter() {
			return getRuleContext(FieldmeterContext.class,0);
		}
		public FielddefaultlengthContext fielddefaultlength() {
			return getRuleContext(FielddefaultlengthContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public FieldtempoContext fieldtempo() {
			return getRuleContext(FieldtempoContext.class,0);
		}
		public TerminalNode LINEFEED() { return getToken(ABCMusicParser.LINEFEED, 0); }
		public FieldcomposerContext fieldcomposer() {
			return getRuleContext(FieldcomposerContext.class,0);
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
		enterRule(_localctx, 10, RULE_otherfields);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case 26:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); fieldcomposer();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); fielddefaultlength();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); fieldmeter();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 4);
				{
				setState(208); fieldtempo();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 5);
				{
				setState(209); fieldvoice();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 6);
				{
				setState(210); comment();
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 7);
				{
				setState(211); match(LINEFEED);
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

	public static class FieldcomposerContext extends ParserRuleContext {
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public ComposernameContext composername() {
			return getRuleContext(ComposernameContext.class,0);
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
		enterRule(_localctx, 12, RULE_fieldcomposer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(26);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(215); match(33);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(221); composername();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(222); match(33);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228); endofline();
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

	public static class ComposernameContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public ComposernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composername; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComposername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComposername(this);
		}
	}

	public final ComposernameContext composername() throws RecognitionException {
		ComposernameContext _localctx = new ComposernameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_composername);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(231); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(230); match(33);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(233); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 2:
						{
						setState(235); text();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(238); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class FielddefaultlengthContext extends ParserRuleContext {
		public EndoflineContext endofline() {
			return getRuleContext(EndoflineContext.class,0);
		}
		public NotelengthstrictContext notelengthstrict() {
			return getRuleContext(NotelengthstrictContext.class,0);
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
		enterRule(_localctx, 16, RULE_fielddefaultlength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(39);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(241); match(33);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247); notelengthstrict();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(248); match(33);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254); endofline();
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
		enterRule(_localctx, 18, RULE_fieldmeter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(11);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(257); match(33);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); meter();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(264); match(33);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270); endofline();
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
		enterRule(_localctx, 20, RULE_fieldtempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(8);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(273); match(33);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279); tempo();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(280); match(33);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286); endofline();
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
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
		enterRule(_localctx, 22, RULE_fieldvoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(43);
			setState(289); text();
			setState(290); endofline();
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
		enterRule(_localctx, 24, RULE_fieldkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(48);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(293); match(33);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299); key();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(300); match(33);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); endofline();
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
		public List<ModeminorContext> modeminor() {
			return getRuleContexts(ModeminorContext.class);
		}
		public ModeminorContext modeminor(int i) {
			return getRuleContext(ModeminorContext.class,i);
		}
		public KeynoteContext keynote() {
			return getRuleContext(KeynoteContext.class,0);
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
		enterRule(_localctx, 26, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); keynote();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46) {
				{
				{
				setState(309); modeminor();
				}
				}
				setState(314);
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

	public static class KeynoteContext extends ParserRuleContext {
		public List<KeyaccidentalContext> keyaccidental() {
			return getRuleContexts(KeyaccidentalContext.class);
		}
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public KeyaccidentalContext keyaccidental(int i) {
			return getRuleContext(KeyaccidentalContext.class,i);
		}
		public KeynoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keynote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKeynote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKeynote(this);
		}
	}

	public final KeynoteContext keynote() throws RecognitionException {
		KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keynote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); basenote();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23 || _la==52) {
				{
				{
				setState(316); keyaccidental();
				}
				}
				setState(321);
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
		enterRule(_localctx, 30, RULE_keyaccidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==23 || _la==52) ) {
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
		enterRule(_localctx, 32, RULE_modeminor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(46);
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
		public MeterfractionContext meterfraction() {
			return getRuleContext(MeterfractionContext.class,0);
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
		enterRule(_localctx, 34, RULE_meter);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); match(25);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(21);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); meterfraction();
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

	public static class MeterfractionContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public MeterfractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meterfraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeterfraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeterfraction(this);
		}
	}

	public final MeterfractionContext meterfraction() throws RecognitionException {
		MeterfractionContext _localctx = new MeterfractionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_meterfraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331); match(DIGIT);
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(336); match(50);
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(337); match(DIGIT);
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public MeterfractionContext meterfraction() {
			return getRuleContext(MeterfractionContext.class,0);
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
		enterRule(_localctx, 38, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); meterfraction();
			setState(343); match(17);
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344); match(DIGIT);
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		enterRule(_localctx, 40, RULE_abcmusic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(349); abcline();
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << LINEFEED))) != 0) );
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
		public List<LyricContext> lyric() {
			return getRuleContexts(LyricContext.class);
		}
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public MidtunefieldContext midtunefield() {
			return getRuleContext(MidtunefieldContext.class,0);
		}
		public LyricContext lyric(int i) {
			return getRuleContext(LyricContext.class,i);
		}
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
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
		enterRule(_localctx, 42, RULE_abcline);
		int _la;
		try {
			int _alt;
			setState(370);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 4:
			case 6:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 22:
			case 23:
			case 25:
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
			case 44:
			case 45:
			case 47:
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(354); notesline();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(355); lyric();
					setState(359);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(356); match(LINEFEED);
							}
							} 
						}
						setState(361);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
					}
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 2);
				{
				setState(367); midtunefield();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(368); comment();
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 4);
				{
				setState(369); match(LINEFEED);
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
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode LINEFEED() { return getToken(ABCMusicParser.LINEFEED, 0); }
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
		enterRule(_localctx, 44, RULE_notesline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(372); element();
				}
				}
				setState(375); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49))) != 0) );
			setState(377); match(LINEFEED);
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
		public NthrepeatContext nthrepeat() {
			return getRuleContext(NthrepeatContext.class,0);
		}
		public TupletelementContext tupletelement() {
			return getRuleContext(TupletelementContext.class,0);
		}
		public NoteelementContext noteelement() {
			return getRuleContext(NoteelementContext.class,0);
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
		enterRule(_localctx, 46, RULE_element);
		try {
			setState(384);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 4:
			case 6:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 22:
			case 23:
			case 25:
			case 30:
			case 34:
			case 37:
			case 38:
			case 40:
			case 41:
			case 44:
			case 47:
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(379); noteelement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 2);
				{
				setState(380); tupletelement();
				}
				break;
			case 18:
			case 20:
			case 32:
			case 36:
			case 42:
			case 45:
				enterOuterAlt(_localctx, 3);
				{
				setState(381); barline();
				}
				break;
			case 19:
			case 35:
				enterOuterAlt(_localctx, 4);
				{
				setState(382); nthrepeat();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 5);
				{
				setState(383); match(33);
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

	public static class NoteelementContext extends ParserRuleContext {
		public MultinoteContext multinote() {
			return getRuleContext(MultinoteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public NoteelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNoteelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNoteelement(this);
		}
	}

	public final NoteelementContext noteelement() throws RecognitionException {
		NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_noteelement);
		try {
			setState(388);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 6:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 22:
			case 23:
			case 25:
			case 30:
			case 34:
			case 37:
			case 38:
			case 40:
			case 41:
			case 44:
			case 47:
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); multinote();
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

	public static class NoteContext extends ParserRuleContext {
		public NoteorrestContext noteorrest() {
			return getRuleContext(NoteorrestContext.class,0);
		}
		public NotelengthContext notelength() {
			return getRuleContext(NotelengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); noteorrest();
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(391); notelength();
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

	public static class NoteorrestContext extends ParserRuleContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public NoteorrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteorrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNoteorrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNoteorrest(this);
		}
	}

	public final NoteorrestContext noteorrest() throws RecognitionException {
		NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_noteorrest);
		try {
			setState(396);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 6:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 22:
			case 23:
			case 25:
			case 30:
			case 34:
			case 37:
			case 38:
			case 40:
			case 41:
			case 44:
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(394); pitch();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 2);
				{
				setState(395); rest();
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

	public static class PitchContext extends ParserRuleContext {
		public List<OctaveContext> octave() {
			return getRuleContexts(OctaveContext.class);
		}
		public AccidentalContext accidental(int i) {
			return getRuleContext(AccidentalContext.class,i);
		}
		public OctaveContext octave(int i) {
			return getRuleContext(OctaveContext.class,i);
		}
		public List<AccidentalContext> accidental() {
			return getRuleContexts(AccidentalContext.class);
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
		enterRule(_localctx, 54, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 14) | (1L << 17) | (1L << 37) | (1L << 40))) != 0)) {
				{
				{
				setState(398); accidental();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404); basenote();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27 || _la==31) {
				{
				{
				setState(405); octave();
				}
				}
				setState(410);
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
		enterRule(_localctx, 56, RULE_octave);
		try {
			int _alt;
			setState(421);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(412); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(411); match(31);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(414); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 2);
				{
				setState(417); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(416); match(27);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(419); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class NotelengthContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
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
		enterRule(_localctx, 58, RULE_notelength);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(423); match(DIGIT);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(430);
			_la = _input.LA(1);
			if (_la==50) {
				{
				setState(429); match(50);
				}
			}

			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(432); match(DIGIT);
				}
				}
				setState(437);
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

	public static class NotelengthstrictContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthstrict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthstrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthstrict(this);
		}
	}

	public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
		NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_notelengthstrict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438); match(DIGIT);
				}
				}
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(443); match(50);
			setState(445); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(444); match(DIGIT);
				}
				}
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		enterRule(_localctx, 62, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 14) | (1L << 17) | (1L << 37) | (1L << 40))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_basenote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 15) | (1L << 16) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 30) | (1L << 34) | (1L << 38) | (1L << 41) | (1L << 44) | (1L << 49))) != 0)) ) {
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

	public static class RestContext extends ParserRuleContext {
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
		enterRule(_localctx, 66, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(47);
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

	public static class TupletelementContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ABCMusicParser.WORD, 0); }
		public TupletspecContext tupletspec() {
			return getRuleContext(TupletspecContext.class,0);
		}
		public NoteelementContext noteelement() {
			return getRuleContext(NoteelementContext.class,0);
		}
		public TupletelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTupletelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTupletelement(this);
		}
	}

	public final TupletelementContext tupletelement() throws RecognitionException {
		TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tupletelement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455); tupletspec();
			setState(462);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 4:
			case 6:
			case 12:
			case 14:
			case 15:
			case 16:
			case 17:
			case 22:
			case 23:
			case 25:
			case 30:
			case 34:
			case 37:
			case 38:
			case 40:
			case 41:
			case 44:
			case 47:
			case 49:
				{
				setState(457); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(456); noteelement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(459); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case WORD:
				{
				setState(461); match(WORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TupletspecContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public TupletspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTupletspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTupletspec(this);
		}
	}

	public final TupletspecContext tupletspec() throws RecognitionException {
		TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tupletspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(29);
			setState(465); match(DIGIT);
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
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
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
		enterRule(_localctx, 72, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(2);
			setState(469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(468); note();
				}
				}
				setState(471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 30) | (1L << 34) | (1L << 37) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 44) | (1L << 47) | (1L << 49))) != 0) );
			setState(473); match(24);
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
		enterRule(_localctx, 74, RULE_barline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 18) | (1L << 20) | (1L << 32) | (1L << 36) | (1L << 42) | (1L << 45))) != 0)) ) {
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

	public static class NthrepeatContext extends ParserRuleContext {
		public NthrepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nthrepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNthrepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNthrepeat(this);
		}
	}

	public final NthrepeatContext nthrepeat() throws RecognitionException {
		NthrepeatContext _localctx = new NthrepeatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nthrepeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==19 || _la==35) ) {
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
		enterRule(_localctx, 78, RULE_midtunefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); fieldvoice();
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
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
		enterRule(_localctx, 80, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); match(13);
			setState(482); text();
			setState(483); match(LINEFEED);
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
		enterRule(_localctx, 82, RULE_endofline);
		try {
			setState(487);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(485); comment();
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(486); match(LINEFEED);
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

	public static class LyricContext extends ParserRuleContext {
		public List<Lyrical_elementContext> lyrical_element() {
			return getRuleContexts(Lyrical_elementContext.class);
		}
		public Lyrical_elementContext lyrical_element(int i) {
			return getRuleContext(Lyrical_elementContext.class,i);
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
		enterRule(_localctx, 84, RULE_lyric);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(9);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(490); lyrical_element();
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class Lyrical_elementContext extends ParserRuleContext {
		public Lyric_textContext lyric_text() {
			return getRuleContext(Lyric_textContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public Lyrical_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrical_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyrical_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyrical_element(this);
		}
	}

	public final Lyrical_elementContext lyrical_element() throws RecognitionException {
		Lyrical_elementContext _localctx = new Lyrical_elementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lyrical_element);
		try {
			int _alt;
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(496); match(33);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(499); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501); match(28);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502); match(14);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(503); match(3);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504); match(51);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505); match(10);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(506); match(20);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(507); lyric_text();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(508); basenote();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(509); rest();
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ABCMusicParser.WORD, 0); }
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
		enterRule(_localctx, 88, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(512); match(33);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518); match(WORD);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(519); match(33);
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Lyric_textContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ABCMusicParser.WORD, 0); }
		public Lyric_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric_text(this);
		}
	}

	public final Lyric_textContext lyric_text() throws RecognitionException {
		Lyric_textContext _localctx = new Lyric_textContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lyric_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(525); match(33);
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531); match(WORD);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(532); match(33);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 92, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); match(WHITESPACE);
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
		"\2\3:\u021f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\3"+
		"\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\7\3s\n\3"+
		"\f\3\16\3v\13\3\3\3\7\3y\n\3\f\3\16\3|\13\3\3\3\3\3\7\3\u0080\n\3\f\3"+
		"\16\3\u0083\13\3\3\3\7\3\u0086\n\3\f\3\16\3\u0089\13\3\3\3\7\3\u008c\n"+
		"\3\f\3\16\3\u008f\13\3\3\3\3\3\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\4\3"+
		"\4\7\4\u009a\n\4\f\4\16\4\u009d\13\4\3\4\3\4\7\4\u00a1\n\4\f\4\16\4\u00a4"+
		"\13\4\3\4\3\4\3\5\3\5\7\5\u00aa\n\5\f\5\16\5\u00ad\13\5\3\5\3\5\7\5\u00b1"+
		"\n\5\f\5\16\5\u00b4\13\5\3\5\3\5\3\6\6\6\u00b9\n\6\r\6\16\6\u00ba\3\6"+
		"\3\6\3\6\7\6\u00c0\n\6\f\6\16\6\u00c3\13\6\3\6\3\6\7\6\u00c7\n\6\f\6\16"+
		"\6\u00ca\13\6\6\6\u00cc\n\6\r\6\16\6\u00cd\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00d7\n\7\3\b\3\b\7\b\u00db\n\b\f\b\16\b\u00de\13\b\3\b\3\b\7\b\u00e2"+
		"\n\b\f\b\16\b\u00e5\13\b\3\b\3\b\3\t\6\t\u00ea\n\t\r\t\16\t\u00eb\3\t"+
		"\6\t\u00ef\n\t\r\t\16\t\u00f0\3\n\3\n\7\n\u00f5\n\n\f\n\16\n\u00f8\13"+
		"\n\3\n\3\n\7\n\u00fc\n\n\f\n\16\n\u00ff\13\n\3\n\3\n\3\13\3\13\7\13\u0105"+
		"\n\13\f\13\16\13\u0108\13\13\3\13\3\13\7\13\u010c\n\13\f\13\16\13\u010f"+
		"\13\13\3\13\3\13\3\f\3\f\7\f\u0115\n\f\f\f\16\f\u0118\13\f\3\f\3\f\7\f"+
		"\u011c\n\f\f\f\16\f\u011f\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\7\16"+
		"\u0129\n\16\f\16\16\16\u012c\13\16\3\16\3\16\7\16\u0130\n\16\f\16\16\16"+
		"\u0133\13\16\3\16\3\16\3\17\3\17\7\17\u0139\n\17\f\17\16\17\u013c\13\17"+
		"\3\20\3\20\7\20\u0140\n\20\f\20\16\20\u0143\13\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u014c\n\23\3\24\6\24\u014f\n\24\r\24\16\24\u0150"+
		"\3\24\3\24\6\24\u0155\n\24\r\24\16\24\u0156\3\25\3\25\3\25\6\25\u015c"+
		"\n\25\r\25\16\25\u015d\3\26\6\26\u0161\n\26\r\26\16\26\u0162\3\27\3\27"+
		"\3\27\7\27\u0168\n\27\f\27\16\27\u016b\13\27\7\27\u016d\n\27\f\27\16\27"+
		"\u0170\13\27\3\27\3\27\3\27\5\27\u0175\n\27\3\30\6\30\u0178\n\30\r\30"+
		"\16\30\u0179\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0183\n\31\3\32\3"+
		"\32\5\32\u0187\n\32\3\33\3\33\5\33\u018b\n\33\3\34\3\34\5\34\u018f\n\34"+
		"\3\35\7\35\u0192\n\35\f\35\16\35\u0195\13\35\3\35\3\35\7\35\u0199\n\35"+
		"\f\35\16\35\u019c\13\35\3\36\6\36\u019f\n\36\r\36\16\36\u01a0\3\36\6\36"+
		"\u01a4\n\36\r\36\16\36\u01a5\5\36\u01a8\n\36\3\37\7\37\u01ab\n\37\f\37"+
		"\16\37\u01ae\13\37\3\37\5\37\u01b1\n\37\3\37\7\37\u01b4\n\37\f\37\16\37"+
		"\u01b7\13\37\3 \6 \u01ba\n \r \16 \u01bb\3 \3 \6 \u01c0\n \r \16 \u01c1"+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\6$\u01cc\n$\r$\16$\u01cd\3$\5$\u01d1\n$\3%"+
		"\3%\3%\3&\3&\6&\u01d8\n&\r&\16&\u01d9\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3*\3*\3+\3+\5+\u01ea\n+\3,\3,\7,\u01ee\n,\f,\16,\u01f1\13,\3-\6-\u01f4"+
		"\n-\r-\16-\u01f5\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0201\n-\3.\7.\u0204\n"+
		".\f.\16.\u0207\13.\3.\3.\7.\u020b\n.\f.\16.\u020e\13.\3/\7/\u0211\n/\f"+
		"/\16/\u0214\13/\3/\3/\7/\u0218\n/\f/\16/\u021b\13/\3\60\3\60\3\60\2\61"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^\2\7\4\31\31\66\66\7\16\16\20\20\23\23\'\'**\16\3\3\6\6\b"+
		"\b\21\22\30\31\33\33  $$((++..\63\63\b\24\24\26\26\"\"&&,,//\4\25\25%"+
		"%\u0247\2`\3\2\2\2\4g\3\2\2\2\6\u0097\3\2\2\2\b\u00a7\3\2\2\2\n\u00cb"+
		"\3\2\2\2\f\u00d6\3\2\2\2\16\u00d8\3\2\2\2\20\u00ee\3\2\2\2\22\u00f2\3"+
		"\2\2\2\24\u0102\3\2\2\2\26\u0112\3\2\2\2\30\u0122\3\2\2\2\32\u0126\3\2"+
		"\2\2\34\u0136\3\2\2\2\36\u013d\3\2\2\2 \u0144\3\2\2\2\"\u0146\3\2\2\2"+
		"$\u014b\3\2\2\2&\u014e\3\2\2\2(\u0158\3\2\2\2*\u0160\3\2\2\2,\u0174\3"+
		"\2\2\2.\u0177\3\2\2\2\60\u0182\3\2\2\2\62\u0186\3\2\2\2\64\u0188\3\2\2"+
		"\2\66\u018e\3\2\2\28\u0193\3\2\2\2:\u01a7\3\2\2\2<\u01ac\3\2\2\2>\u01b9"+
		"\3\2\2\2@\u01c3\3\2\2\2B\u01c5\3\2\2\2D\u01c7\3\2\2\2F\u01c9\3\2\2\2H"+
		"\u01d2\3\2\2\2J\u01d5\3\2\2\2L\u01dd\3\2\2\2N\u01df\3\2\2\2P\u01e1\3\2"+
		"\2\2R\u01e3\3\2\2\2T\u01e9\3\2\2\2V\u01eb\3\2\2\2X\u0200\3\2\2\2Z\u0205"+
		"\3\2\2\2\\\u0212\3\2\2\2^\u021c\3\2\2\2`a\5\4\3\2ab\5*\26\2bc\7\1\2\2"+
		"c\3\3\2\2\2df\7:\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ig\3\2\2\2jn\5\6\4\2km\7:\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"ot\3\2\2\2pn\3\2\2\2qs\5R*\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u"+
		"z\3\2\2\2vt\3\2\2\2wy\7:\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{"+
		"}\3\2\2\2|z\3\2\2\2}\u0081\5\b\5\2~\u0080\7:\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0086\5\f\7\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\7:\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0094\5\32\16\2\u0091\u0093\7:\2\2\u0092\u0091\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\5\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\7\7\2\2\u0098\u009a\7#\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a2\78\2\2\u009f"+
		"\u00a1\7#\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\5T+\2\u00a6\7\3\2\2\2\u00a7\u00ab\7\t\2\2\u00a8\u00aa\7#\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\5\n\6\2\u00af"+
		"\u00b1\7#\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\5T+\2\u00b6\t\3\2\2\2\u00b7\u00b9\7#\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00cc\3\2"+
		"\2\2\u00bc\u00cc\5Z.\2\u00bd\u00cc\78\2\2\u00be\u00c0\5^\60\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\78\2\2\u00c5\u00c7\5^\60"+
		"\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00b8\3\2\2\2\u00cb"+
		"\u00bc\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\13\3\2\2\2\u00cf\u00d7"+
		"\5\16\b\2\u00d0\u00d7\5\22\n\2\u00d1\u00d7\5\24\13\2\u00d2\u00d7\5\26"+
		"\f\2\u00d3\u00d7\5\30\r\2\u00d4\u00d7\5R*\2\u00d5\u00d7\7:\2\2\u00d6\u00cf"+
		"\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\r\3\2\2\2"+
		"\u00d8\u00dc\7\34\2\2\u00d9\u00db\7#\2\2\u00da\u00d9\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e3\5\20\t\2\u00e0\u00e2\7#\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5T+\2\u00e7\17\3\2\2\2"+
		"\u00e8\u00ea\7#\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\5Z.\2\u00ee"+
		"\u00e9\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\21\3\2\2\2\u00f2\u00f6\7)\2\2\u00f3\u00f5"+
		"\7#\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\5>"+
		" \2\u00fa\u00fc\7#\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\5T+\2\u0101\23\3\2\2\2\u0102\u0106\7\r\2\2\u0103\u0105\7#\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010d\5$\23\2\u010a"+
		"\u010c\7#\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\5T+\2\u0111\25\3\2\2\2\u0112\u0116\7\n\2\2\u0113\u0115\7#\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011d\5(\25\2\u011a"+
		"\u011c\7#\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\5T+\2\u0121\27\3\2\2\2\u0122\u0123\7-\2\2\u0123\u0124\5Z.\2\u0124"+
		"\u0125\5T+\2\u0125\31\3\2\2\2\u0126\u012a\7\62\2\2\u0127\u0129\7#\2\2"+
		"\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0131\5\34\17\2"+
		"\u012e\u0130\7#\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\5T+\2\u0135\33\3\2\2\2\u0136\u013a\5\36\20\2\u0137\u0139\5\"\22"+
		"\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\35\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0141\5B\"\2\u013e"+
		"\u0140\5 \21\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\37\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145"+
		"\t\2\2\2\u0145!\3\2\2\2\u0146\u0147\7\60\2\2\u0147#\3\2\2\2\u0148\u014c"+
		"\7\33\2\2\u0149\u014c\7\27\2\2\u014a\u014c\5&\24\2\u014b\u0148\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c%\3\2\2\2\u014d\u014f\7"+
		"8\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\7\64\2\2\u0153\u0155\7"+
		"8\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\'\3\2\2\2\u0158\u0159\5&\24\2\u0159\u015b\7\23\2"+
		"\2\u015a\u015c\78\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e)\3\2\2\2\u015f\u0161\5,\27\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163+\3\2\2\2\u0164\u016e\5.\30\2\u0165\u0169\5V,\2\u0166\u0168"+
		"\7:\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0165\3\2"+
		"\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0175\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0175\5P)\2\u0172\u0175\5R*\2"+
		"\u0173\u0175\7:\2\2\u0174\u0164\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0173\3\2\2\2\u0175-\3\2\2\2\u0176\u0178\5\60\31\2\u0177"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7:\2\2\u017c/\3\2\2\2\u017d\u0183"+
		"\5\62\32\2\u017e\u0183\5F$\2\u017f\u0183\5L\'\2\u0180\u0183\5N(\2\u0181"+
		"\u0183\7#\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0182\u017f\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\61\3\2\2\2\u0184\u0187"+
		"\5\64\33\2\u0185\u0187\5J&\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\63\3\2\2\2\u0188\u018a\5\66\34\2\u0189\u018b\5<\37\2\u018a\u0189\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\65\3\2\2\2\u018c\u018f\58\35\2\u018d\u018f"+
		"\5D#\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\67\3\2\2\2\u0190"+
		"\u0192\5@!\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019a"+
		"\5B\"\2\u0197\u0199\5:\36\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b9\3\2\2\2\u019c\u019a\3\2\2\2"+
		"\u019d\u019f\7!\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a8\3\2\2\2\u01a2\u01a4\7\35\2\2"+
		"\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u019e\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8"+
		";\3\2\2\2\u01a9\u01ab\78\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01af\u01b1\7\64\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b5\3\2\2\2\u01b2\u01b4\78\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6=\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01ba\78\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7\64"+
		"\2\2\u01be\u01c0\78\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2?\3\2\2\2\u01c3\u01c4\t\3\2\2"+
		"\u01c4A\3\2\2\2\u01c5\u01c6\t\4\2\2\u01c6C\3\2\2\2\u01c7\u01c8\7\61\2"+
		"\2\u01c8E\3\2\2\2\u01c9\u01d0\5H%\2\u01ca\u01cc\5\62\32\2\u01cb\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01d1\79\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1G\3\2\2\2\u01d2\u01d3\7\37\2\2\u01d3\u01d4\78\2\2\u01d4I\3\2"+
		"\2\2\u01d5\u01d7\7\4\2\2\u01d6\u01d8\5\64\33\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\7\32\2\2\u01dcK\3\2\2\2\u01dd\u01de\t\5\2\2\u01deM\3"+
		"\2\2\2\u01df\u01e0\t\6\2\2\u01e0O\3\2\2\2\u01e1\u01e2\5\30\r\2\u01e2Q"+
		"\3\2\2\2\u01e3\u01e4\7\17\2\2\u01e4\u01e5\5Z.\2\u01e5\u01e6\7:\2\2\u01e6"+
		"S\3\2\2\2\u01e7\u01ea\5R*\2\u01e8\u01ea\7:\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01eaU\3\2\2\2\u01eb\u01ef\7\13\2\2\u01ec\u01ee\5X-\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0W\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f4\7#\2\2\u01f3\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u0201\3\2\2\2\u01f7\u0201\7\36\2\2\u01f8\u0201\7\20\2\2\u01f9\u0201\7"+
		"\5\2\2\u01fa\u0201\7\65\2\2\u01fb\u0201\7\f\2\2\u01fc\u0201\7\26\2\2\u01fd"+
		"\u0201\5\\/\2\u01fe\u0201\5B\"\2\u01ff\u0201\5D#\2\u0200\u01f3\3\2\2\2"+
		"\u0200\u01f7\3\2\2\2\u0200\u01f8\3\2\2\2\u0200\u01f9\3\2\2\2\u0200\u01fa"+
		"\3\2\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201Y\3\2\2\2\u0202\u0204\7#\2\2\u0203"+
		"\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020c\79\2\2\u0209"+
		"\u020b\7#\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d[\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211"+
		"\7#\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0219\79"+
		"\2\2\u0216\u0218\7#\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a]\3\2\2\2\u021b\u0219\3\2\2\2"+
		"\u021c\u021d\7\67\2\2\u021d_\3\2\2\2Egntz\u0081\u0087\u008d\u0094\u009b"+
		"\u00a2\u00ab\u00b2\u00ba\u00c1\u00c8\u00cb\u00cd\u00d6\u00dc\u00e3\u00eb"+
		"\u00ee\u00f0\u00f6\u00fd\u0106\u010d\u0116\u011d\u012a\u0131\u013a\u0141"+
		"\u014b\u0150\u0156\u015d\u0162\u0169\u016e\u0174\u0179\u0182\u0186\u018a"+
		"\u018e\u0193\u019a\u01a0\u01a5\u01a7\u01ac\u01b0\u01b5\u01bb\u01c1\u01cd"+
		"\u01d0\u01d9\u01e9\u01ef\u01f5\u0200\u0205\u020c\u0212\u0219";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}