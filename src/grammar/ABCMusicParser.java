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
		RULE_element = 22, RULE_noteelement = 23, RULE_note = 24, RULE_noteorrest = 25, 
		RULE_pitch = 26, RULE_octave = 27, RULE_notelength = 28, RULE_notelengthstrict = 29, 
		RULE_accidental = 30, RULE_basenote = 31, RULE_rest = 32, RULE_tupletelement = 33, 
		RULE_tupletspec = 34, RULE_multinote = 35, RULE_barline = 36, RULE_nthrepeat = 37, 
		RULE_midtunefield = 38, RULE_comment = 39, RULE_endofline = 40, RULE_lyric = 41, 
		RULE_lyrical_element = 42, RULE_text = 43, RULE_lyric_text = 44, RULE_space = 45;
	public static final String[] ruleNames = {
		"abctune", "abcheader", "fieldnumber", "fieldtitle", "fieldtitletext", 
		"otherfields", "fieldcomposer", "composername", "fielddefaultlength", 
		"fieldmeter", "fieldtempo", "fieldvoice", "fieldkey", "key", "keynote", 
		"keyaccidental", "modeminor", "meter", "meterfraction", "tempo", "abcmusic", 
		"abcline", "element", "noteelement", "note", "noteorrest", "pitch", "octave", 
		"notelength", "notelengthstrict", "accidental", "basenote", "rest", "tupletelement", 
		"tupletspec", "multinote", "barline", "nthrepeat", "midtunefield", "comment", 
		"endofline", "lyric", "lyrical_element", "text", "lyric_text", "space"
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
			setState(92); abcheader();
			setState(93); abcmusic();
			setState(94); match(EOF);
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
			setState(96); fieldnumber();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13) {
				{
				{
				setState(97); comment();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); fieldtitle();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 13) | (1L << 26) | (1L << 39) | (1L << 43))) != 0)) {
				{
				{
				setState(104); otherfields();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); fieldkey();
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
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(5);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(119);
				switch (_input.LA(1)) {
				case 33:
					{
					setState(114); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(113); match(33);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(116); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=-1 );
					}
					break;
				case DIGIT:
					{
					setState(118); match(DIGIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==33 || _la==DIGIT );
			setState(123); endofline();
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
			setState(125); match(7);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(126); match(33);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(132); fieldtitletext();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(133); match(33);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); endofline();
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
			setState(161); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(142); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(141); match(33);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(144); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 2:
						{
						setState(146); text();
						}
						break;

					case 3:
						{
						setState(147); match(DIGIT);
						}
						break;

					case 4:
						{
						{
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(148); space();
							}
							}
							setState(153);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(154); match(DIGIT);
						setState(158);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(155); space();
								}
								} 
							}
							setState(160);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
				setState(163); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(171);
			switch (_input.LA(1)) {
			case 26:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); fieldcomposer();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); fielddefaultlength();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); fieldmeter();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 4);
				{
				setState(168); fieldtempo();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 5);
				{
				setState(169); fieldvoice();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 6);
				{
				setState(170); comment();
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
			setState(173); match(26);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(174); match(33);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(180); composername();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(181); match(33);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); endofline();
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
			setState(195); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(195);
					switch (_input.LA(1)) {
					case 33:
						{
						setState(190); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(189); match(33);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(192); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					case WHITESPACE:
					case WORD:
						{
						setState(194); text();
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
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(199); match(39);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(200); match(33);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); notelengthstrict();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(207); match(33);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); endofline();
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
			setState(215); match(11);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(216); match(33);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222); meter();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(223); match(33);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229); endofline();
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
			setState(231); match(8);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(232); match(33);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); tempo();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(239); match(33);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); endofline();
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
			setState(247); match(43);
			setState(248); text();
			setState(249); endofline();
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
			setState(251); match(48);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(252); match(33);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258); key();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(259); match(33);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265); endofline();
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
			setState(267); keynote();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46) {
				{
				{
				setState(268); modeminor();
				}
				}
				setState(273);
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
			setState(274); basenote();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23 || _la==52) {
				{
				{
				setState(275); keyaccidental();
				}
				}
				setState(280);
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
			setState(281);
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
			setState(283); match(46);
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
			setState(288);
			switch (_input.LA(1)) {
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); match(25);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(21);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(287); meterfraction();
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
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290); match(DIGIT);
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(295); match(50);
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296); match(DIGIT);
				}
				}
				setState(299); 
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
			setState(301); meterfraction();
			setState(302); match(17);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303); match(DIGIT);
				}
				}
				setState(306); 
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
			setState(309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(308); abcline();
				}
				}
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49))) != 0) );
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<LyricContext> lyric() {
			return getRuleContexts(LyricContext.class);
		}
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
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
			setState(333);
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
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313); element();
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 29) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49))) != 0) );
				setState(318); match(LINEFEED);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(319); lyric();
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINEFEED) {
						{
						{
						setState(320); match(LINEFEED);
						}
						}
						setState(325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); midtunefield();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(332); comment();
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
		enterRule(_localctx, 44, RULE_element);
		try {
			setState(340);
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
				setState(335); noteelement();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); tupletelement();
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
				setState(337); barline();
				}
				break;
			case 19:
			case 35:
				enterOuterAlt(_localctx, 4);
				{
				setState(338); nthrepeat();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 5);
				{
				setState(339); match(33);
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
		enterRule(_localctx, 46, RULE_noteelement);
		try {
			setState(344);
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
				setState(342); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); multinote();
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
		enterRule(_localctx, 48, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); noteorrest();
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(347); notelength();
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
		enterRule(_localctx, 50, RULE_noteorrest);
		try {
			setState(352);
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
				setState(350); pitch();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 2);
				{
				setState(351); rest();
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
		enterRule(_localctx, 52, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 14) | (1L << 17) | (1L << 37) | (1L << 40))) != 0)) {
				{
				{
				setState(354); accidental();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360); basenote();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27 || _la==31) {
				{
				{
				setState(361); octave();
				}
				}
				setState(366);
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
		enterRule(_localctx, 54, RULE_octave);
		try {
			int _alt;
			setState(377);
			switch (_input.LA(1)) {
			case 31:
				enterOuterAlt(_localctx, 1);
				{
				setState(368); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(367); match(31);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(370); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(372); match(27);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(375); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 56, RULE_notelength);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(379); match(DIGIT);
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(386);
			_la = _input.LA(1);
			if (_la==50) {
				{
				setState(385); match(50);
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(388); match(DIGIT);
				}
				}
				setState(393);
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
		enterRule(_localctx, 58, RULE_notelengthstrict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394); match(DIGIT);
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(399); match(50);
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400); match(DIGIT);
				}
				}
				setState(403); 
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
		enterRule(_localctx, 60, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 62, RULE_basenote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 64, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(47);
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
		enterRule(_localctx, 66, RULE_tupletelement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411); tupletspec();
			setState(418);
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
				setState(413); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(412); noteelement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(415); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case WORD:
				{
				setState(417); match(WORD);
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
		enterRule(_localctx, 68, RULE_tupletspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(29);
			setState(421); match(DIGIT);
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
		enterRule(_localctx, 70, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(2);
			setState(425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424); note();
				}
				}
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 30) | (1L << 34) | (1L << 37) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 44) | (1L << 47) | (1L << 49))) != 0) );
			setState(429); match(24);
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
		enterRule(_localctx, 72, RULE_barline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 74, RULE_nthrepeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 76, RULE_midtunefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); fieldvoice();
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
		enterRule(_localctx, 78, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(13);
			setState(438); text();
			setState(439); match(LINEFEED);
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
		enterRule(_localctx, 80, RULE_endofline);
		try {
			setState(443);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(441); comment();
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(442); match(LINEFEED);
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
		enterRule(_localctx, 82, RULE_lyric);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(9);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(446); lyrical_element();
					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		enterRule(_localctx, 84, RULE_lyrical_element);
		try {
			int _alt;
			setState(466);
			switch (_input.LA(1)) {
			case 33:
				enterOuterAlt(_localctx, 1);
				{
				setState(453); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(452); match(33);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(455); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 2);
				{
				setState(457); match(28);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(458); match(14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 4);
				{
				setState(459); match(3);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 5);
				{
				setState(460); match(51);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 6);
				{
				setState(461); match(10);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 7);
				{
				setState(462); match(20);
				}
				break;
			case WHITESPACE:
			case WORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(463); lyric_text();
				}
				break;
			case 1:
			case 4:
			case 6:
			case 15:
			case 16:
			case 22:
			case 23:
			case 25:
			case 30:
			case 34:
			case 38:
			case 41:
			case 44:
			case 49:
				enterOuterAlt(_localctx, 9);
				{
				setState(464); basenote();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 10);
				{
				setState(465); rest();
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ABCMusicParser.WORD, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 86, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(468); match(WHITESPACE);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474); match(WORD);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(475); match(WHITESPACE);
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ABCMusicParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 88, RULE_lyric_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(481); match(WHITESPACE);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487); match(WORD);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(488); match(WHITESPACE);
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 90, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494); match(WHITESPACE);
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
		"\2\3:\u01f3\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\7\3e"+
		"\n\3\f\3\16\3h\13\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\3\4\3\4\6"+
		"\4u\n\4\r\4\16\4v\3\4\6\4z\n\4\r\4\16\4{\3\4\3\4\3\5\3\5\7\5\u0082\n\5"+
		"\f\5\16\5\u0085\13\5\3\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5"+
		"\3\6\6\6\u0091\n\6\r\6\16\6\u0092\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b"+
		"\13\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\6\6\u00a4\n\6\r\6\16\6"+
		"\u00a5\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\b\3\b\7\b\u00b2\n\b\f\b"+
		"\16\b\u00b5\13\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\b\3\b\3\t"+
		"\6\t\u00c1\n\t\r\t\16\t\u00c2\3\t\6\t\u00c6\n\t\r\t\16\t\u00c7\3\n\3\n"+
		"\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\7\n\u00d3\n\n\f\n\16\n\u00d6"+
		"\13\n\3\n\3\n\3\13\3\13\7\13\u00dc\n\13\f\13\16\13\u00df\13\13\3\13\3"+
		"\13\7\13\u00e3\n\13\f\13\16\13\u00e6\13\13\3\13\3\13\3\f\3\f\7\f\u00ec"+
		"\n\f\f\f\16\f\u00ef\13\f\3\f\3\f\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\7\16\u0100\n\16\f\16\16\16\u0103\13\16"+
		"\3\16\3\16\7\16\u0107\n\16\f\16\16\16\u010a\13\16\3\16\3\16\3\17\3\17"+
		"\7\17\u0110\n\17\f\17\16\17\u0113\13\17\3\20\3\20\7\20\u0117\n\20\f\20"+
		"\16\20\u011a\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u0123\n\23"+
		"\3\24\6\24\u0126\n\24\r\24\16\24\u0127\3\24\3\24\6\24\u012c\n\24\r\24"+
		"\16\24\u012d\3\25\3\25\3\25\6\25\u0133\n\25\r\25\16\25\u0134\3\26\6\26"+
		"\u0138\n\26\r\26\16\26\u0139\3\27\6\27\u013d\n\27\r\27\16\27\u013e\3\27"+
		"\3\27\3\27\7\27\u0144\n\27\f\27\16\27\u0147\13\27\7\27\u0149\n\27\f\27"+
		"\16\27\u014c\13\27\3\27\3\27\5\27\u0150\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0157\n\30\3\31\3\31\5\31\u015b\n\31\3\32\3\32\5\32\u015f\n\32\3"+
		"\33\3\33\5\33\u0163\n\33\3\34\7\34\u0166\n\34\f\34\16\34\u0169\13\34\3"+
		"\34\3\34\7\34\u016d\n\34\f\34\16\34\u0170\13\34\3\35\6\35\u0173\n\35\r"+
		"\35\16\35\u0174\3\35\6\35\u0178\n\35\r\35\16\35\u0179\5\35\u017c\n\35"+
		"\3\36\7\36\u017f\n\36\f\36\16\36\u0182\13\36\3\36\5\36\u0185\n\36\3\36"+
		"\7\36\u0188\n\36\f\36\16\36\u018b\13\36\3\37\6\37\u018e\n\37\r\37\16\37"+
		"\u018f\3\37\3\37\6\37\u0194\n\37\r\37\16\37\u0195\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\6#\u01a0\n#\r#\16#\u01a1\3#\5#\u01a5\n#\3$\3$\3$\3%\3%\6%\u01ac"+
		"\n%\r%\16%\u01ad\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\5*\u01be"+
		"\n*\3+\3+\7+\u01c2\n+\f+\16+\u01c5\13+\3,\6,\u01c8\n,\r,\16,\u01c9\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01d5\n,\3-\7-\u01d8\n-\f-\16-\u01db\13-\3"+
		"-\3-\7-\u01df\n-\f-\16-\u01e2\13-\3.\7.\u01e5\n.\f.\16.\u01e8\13.\3.\3"+
		".\7.\u01ec\n.\f.\16.\u01ef\13.\3/\3/\3/\2\60\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\7\4\31\31\66\66"+
		"\7\16\16\20\20\23\23\'\'**\16\3\3\6\6\b\b\21\22\30\31\33\33  $$((++.."+
		"\63\63\b\24\24\26\26\"\"&&,,//\4\25\25%%\u0215\2^\3\2\2\2\4b\3\2\2\2\6"+
		"r\3\2\2\2\b\177\3\2\2\2\n\u00a3\3\2\2\2\f\u00ad\3\2\2\2\16\u00af\3\2\2"+
		"\2\20\u00c5\3\2\2\2\22\u00c9\3\2\2\2\24\u00d9\3\2\2\2\26\u00e9\3\2\2\2"+
		"\30\u00f9\3\2\2\2\32\u00fd\3\2\2\2\34\u010d\3\2\2\2\36\u0114\3\2\2\2 "+
		"\u011b\3\2\2\2\"\u011d\3\2\2\2$\u0122\3\2\2\2&\u0125\3\2\2\2(\u012f\3"+
		"\2\2\2*\u0137\3\2\2\2,\u014f\3\2\2\2.\u0156\3\2\2\2\60\u015a\3\2\2\2\62"+
		"\u015c\3\2\2\2\64\u0162\3\2\2\2\66\u0167\3\2\2\28\u017b\3\2\2\2:\u0180"+
		"\3\2\2\2<\u018d\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u019b\3\2\2\2D"+
		"\u019d\3\2\2\2F\u01a6\3\2\2\2H\u01a9\3\2\2\2J\u01b1\3\2\2\2L\u01b3\3\2"+
		"\2\2N\u01b5\3\2\2\2P\u01b7\3\2\2\2R\u01bd\3\2\2\2T\u01bf\3\2\2\2V\u01d4"+
		"\3\2\2\2X\u01d9\3\2\2\2Z\u01e6\3\2\2\2\\\u01f0\3\2\2\2^_\5\4\3\2_`\5*"+
		"\26\2`a\7\1\2\2a\3\3\2\2\2bf\5\6\4\2ce\5P)\2dc\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2im\5\b\5\2jl\5\f\7\2kj\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\5\32\16\2q\5\3\2\2\2ry"+
		"\7\7\2\2su\7#\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xz"+
		"\78\2\2yt\3\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~"+
		"\5R*\2~\7\3\2\2\2\177\u0083\7\t\2\2\u0080\u0082\7#\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008a\5\n\6\2\u0087\u0089\7#"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\5R"+
		"*\2\u008e\t\3\2\2\2\u008f\u0091\7#\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a4\3\2\2\2\u0094"+
		"\u00a4\5X-\2\u0095\u00a4\78\2\2\u0096\u0098\5\\/\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\78\2\2\u009d\u009f\5\\/\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u0090\3\2\2\2\u00a3"+
		"\u0094\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u0099\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00ae"+
		"\5\16\b\2\u00a8\u00ae\5\22\n\2\u00a9\u00ae\5\24\13\2\u00aa\u00ae\5\26"+
		"\f\2\u00ab\u00ae\5\30\r\2\u00ac\u00ae\5P)\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\r\3\2\2\2\u00af\u00b3\7\34\2\2\u00b0\u00b2"+
		"\7#\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba\5\20"+
		"\t\2\u00b7\u00b9\7#\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\5R*\2\u00be\17\3\2\2\2\u00bf\u00c1\7#\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c6\5X-\2\u00c5\u00c0\3\2\2\2\u00c5\u00c4\3\2\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\21"+
		"\3\2\2\2\u00c9\u00cd\7)\2\2\u00ca\u00cc\7#\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4\5<\37\2\u00d1\u00d3\7#\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5R*\2\u00d8\23"+
		"\3\2\2\2\u00d9\u00dd\7\r\2\2\u00da\u00dc\7#\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e4\5$\23\2\u00e1\u00e3\7#\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5R*\2\u00e8\25"+
		"\3\2\2\2\u00e9\u00ed\7\n\2\2\u00ea\u00ec\7#\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f4\5(\25\2\u00f1\u00f3\7#\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5R*\2\u00f8\27"+
		"\3\2\2\2\u00f9\u00fa\7-\2\2\u00fa\u00fb\5X-\2\u00fb\u00fc\5R*\2\u00fc"+
		"\31\3\2\2\2\u00fd\u0101\7\62\2\2\u00fe\u0100\7#\2\2\u00ff\u00fe\3\2\2"+
		"\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0108\5\34\17\2\u0105\u0107\7#\2\2"+
		"\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\5R*\2\u010c"+
		"\33\3\2\2\2\u010d\u0111\5\36\20\2\u010e\u0110\5\"\22\2\u010f\u010e\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\35\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0118\5@!\2\u0115\u0117\5 \21\2"+
		"\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\37\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\2\2\2\u011c"+
		"!\3\2\2\2\u011d\u011e\7\60\2\2\u011e#\3\2\2\2\u011f\u0123\7\33\2\2\u0120"+
		"\u0123\7\27\2\2\u0121\u0123\5&\24\2\u0122\u011f\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0122\u0121\3\2\2\2\u0123%\3\2\2\2\u0124\u0126\78\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\7\64\2\2\u012a\u012c\78\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\'\3\2\2\2\u012f\u0130\5&\24\2\u0130\u0132\7\23\2\2\u0131\u0133\78\2\2"+
		"\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135)\3\2\2\2\u0136\u0138\5,\27\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a+\3\2\2\2"+
		"\u013b\u013d\5.\30\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u014a\7:\2\2\u0141"+
		"\u0145\5T+\2\u0142\u0144\7:\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2"+
		"\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u0141\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0150\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0150\5N"+
		"(\2\u014e\u0150\5P)\2\u014f\u013c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e"+
		"\3\2\2\2\u0150-\3\2\2\2\u0151\u0157\5\60\31\2\u0152\u0157\5D#\2\u0153"+
		"\u0157\5J&\2\u0154\u0157\5L\'\2\u0155\u0157\7#\2\2\u0156\u0151\3\2\2\2"+
		"\u0156\u0152\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155"+
		"\3\2\2\2\u0157/\3\2\2\2\u0158\u015b\5\62\32\2\u0159\u015b\5H%\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\61\3\2\2\2\u015c\u015e\5\64\33"+
		"\2\u015d\u015f\5:\36\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\63"+
		"\3\2\2\2\u0160\u0163\5\66\34\2\u0161\u0163\5B\"\2\u0162\u0160\3\2\2\2"+
		"\u0162\u0161\3\2\2\2\u0163\65\3\2\2\2\u0164\u0166\5> \2\u0165\u0164\3"+
		"\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\5@!\2\u016b\u016d\58\35"+
		"\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\67\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\7!\2\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u017c\3\2\2\2\u0176\u0178\7\35\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0172\3\2\2\2\u017b\u0177\3\2\2\2\u017c9\3\2\2\2\u017d\u017f"+
		"\78\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7\64"+
		"\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186"+
		"\u0188\78\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a;\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e"+
		"\78\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\7\64\2\2\u0192\u0194\7"+
		"8\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196=\3\2\2\2\u0197\u0198\t\3\2\2\u0198?\3\2\2\2\u0199"+
		"\u019a\t\4\2\2\u019aA\3\2\2\2\u019b\u019c\7\61\2\2\u019cC\3\2\2\2\u019d"+
		"\u01a4\5F$\2\u019e\u01a0\5\60\31\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a5\79\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5E\3\2\2\2\u01a6"+
		"\u01a7\7\37\2\2\u01a7\u01a8\78\2\2\u01a8G\3\2\2\2\u01a9\u01ab\7\4\2\2"+
		"\u01aa\u01ac\5\62\32\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\32\2\2"+
		"\u01b0I\3\2\2\2\u01b1\u01b2\t\5\2\2\u01b2K\3\2\2\2\u01b3\u01b4\t\6\2\2"+
		"\u01b4M\3\2\2\2\u01b5\u01b6\5\30\r\2\u01b6O\3\2\2\2\u01b7\u01b8\7\17\2"+
		"\2\u01b8\u01b9\5X-\2\u01b9\u01ba\7:\2\2\u01baQ\3\2\2\2\u01bb\u01be\5P"+
		")\2\u01bc\u01be\7:\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01beS"+
		"\3\2\2\2\u01bf\u01c3\7\13\2\2\u01c0\u01c2\5V,\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4U\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c6\u01c8\7#\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01d5\3\2\2\2\u01cb"+
		"\u01d5\7\36\2\2\u01cc\u01d5\7\20\2\2\u01cd\u01d5\7\5\2\2\u01ce\u01d5\7"+
		"\65\2\2\u01cf\u01d5\7\f\2\2\u01d0\u01d5\7\26\2\2\u01d1\u01d5\5Z.\2\u01d2"+
		"\u01d5\5@!\2\u01d3\u01d5\5B\"\2\u01d4\u01c7\3\2\2\2\u01d4\u01cb\3\2\2"+
		"\2\u01d4\u01cc\3\2\2\2\u01d4\u01cd\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01cf"+
		"\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5W\3\2\2\2\u01d6\u01d8\7\67\2\2\u01d7\u01d6\3\2\2\2"+
		"\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01e0\79\2\2\u01dd\u01df\7\67\2\2\u01de"+
		"\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1Y\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\7\67\2\2\u01e4\u01e3"+
		"\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ed\79\2\2\u01ea\u01ec\7\67"+
		"\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee[\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\7\67\2\2"+
		"\u01f1]\3\2\2\2@fmvy{\u0083\u008a\u0092\u0099\u00a0\u00a3\u00a5\u00ad"+
		"\u00b3\u00ba\u00c2\u00c5\u00c7\u00cd\u00d4\u00dd\u00e4\u00ed\u00f4\u0101"+
		"\u0108\u0111\u0118\u0122\u0127\u012d\u0134\u0139\u013e\u0145\u014a\u014f"+
		"\u0156\u015a\u015e\u0162\u0167\u016e\u0174\u0179\u017b\u0180\u0184\u0189"+
		"\u018f\u0195\u01a1\u01a4\u01ad\u01bd\u01c3\u01c9\u01d4\u01d9\u01e0\u01e6"+
		"\u01ed";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}