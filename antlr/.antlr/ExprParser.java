// Generated from c:\Users\micha\OneDrive\Desktop\University\Semestrul IV\PBL\ELSD_team5\antlr\Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, STRING=24, 
		NEWLINE=25, INT=26, CHR=27, WS=28;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_query_invocation = 2, RULE_term = 3, 
		RULE_variable = 4, RULE_variable_declaration = 5, RULE_method_invocation = 6, 
		RULE_method_atributes = 7, RULE_method_name = 8, RULE_assignment_statement = 9, 
		RULE_method_declaration = 10, RULE_comments = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "query_invocation", "term", "variable", "variable_declaration", 
			"method_invocation", "method_atributes", "method_name", "assignment_statement", 
			"method_declaration", "comments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func process()'", "'{'", "'}'", "'func compose()'", "'='", "'('", 
			"')'", "','", "'-'", "'load'", "'delay'", "'setreverb'", "'setgain'", 
			"'changepitch'", "'fadein'", "'fadeout'", "'play'", "'splice'", "'repeat'", 
			"'layer'", "'cut'", "'func '", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "NEWLINE", "INT", "CHR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(T__1);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE) | (1L << CHR))) != 0)) {
				{
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(26);
					match(NEWLINE);
					}
				}

				setState(29);
				statement();
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(30);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__2);
			setState(39);
			match(NEWLINE);
			setState(40);
			match(T__3);
			setState(41);
			match(T__1);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE) | (1L << CHR))) != 0)) {
				{
				{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(42);
					match(NEWLINE);
					}
				}

				setState(45);
				statement();
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(46);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__2);
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

	public static class StatementContext extends ParserRuleContext {
		public Query_invocationContext query_invocation() {
			return getRuleContext(Query_invocationContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case CHR:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				query_invocation();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				comments();
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

	public static class Query_invocationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Method_invocationContext method_invocation() {
			return getRuleContext(Method_invocationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Query_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_invocation; }
	}

	public final Query_invocationContext query_invocation() throws RecognitionException {
		Query_invocationContext _localctx = new Query_invocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query_invocation);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				method_invocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				assignment_statement();
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

	public static class TermContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				variable();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(INT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(ExprParser.CHR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(CHR);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public List<TerminalNode> CHR() { return getTokens(ExprParser.CHR); }
		public TerminalNode CHR(int i) {
			return getToken(ExprParser.CHR, i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public Method_invocationContext method_invocation() {
			return getRuleContext(Method_invocationContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CHR);
			setState(73);
			match(T__4);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(74);
				match(INT);
				}
				break;
			case CHR:
				{
				setState(75);
				match(CHR);
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(76);
				method_invocation();
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

	public static class Method_invocationContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Method_atributesContext method_atributes() {
			return getRuleContext(Method_atributesContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			method_name();
			setState(80);
			match(T__5);
			setState(81);
			method_atributes(0);
			setState(82);
			match(T__6);
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

	public static class Method_atributesContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public List<TerminalNode> CHR() { return getTokens(ExprParser.CHR); }
		public TerminalNode CHR(int i) {
			return getToken(ExprParser.CHR, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<Method_atributesContext> method_atributes() {
			return getRuleContexts(Method_atributesContext.class);
		}
		public Method_atributesContext method_atributes(int i) {
			return getRuleContext(Method_atributesContext.class,i);
		}
		public Method_atributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_atributes; }
	}

	public final Method_atributesContext method_atributes() throws RecognitionException {
		return method_atributes(0);
	}

	private Method_atributesContext method_atributes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Method_atributesContext _localctx = new Method_atributesContext(_ctx, _parentState);
		Method_atributesContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_method_atributes, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(85);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << CHR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(91);
				match(T__8);
				setState(92);
				method_atributes(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Method_atributesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_method_atributes);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					match(T__7);
					setState(97);
					method_atributes(3);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public List<TerminalNode> CHR() { return getTokens(ExprParser.CHR); }
		public TerminalNode CHR(int i) {
			return getToken(ExprParser.CHR, i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CHR);
			setState(106);
			match(T__4);
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Method_declarationContext extends ParserRuleContext {
		public List<TerminalNode> CHR() { return getTokens(ExprParser.CHR); }
		public TerminalNode CHR(int i) {
			return getToken(ExprParser.CHR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__21);
			setState(110);
			match(CHR);
			setState(111);
			match(T__5);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHR) {
				{
				{
				setState(112);
				match(CHR);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(118);
					match(T__7);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(124);
			match(T__6);
			setState(125);
			match(T__1);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE) | (1L << CHR))) != 0)) {
				{
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(126);
					match(NEWLINE);
					}
				}

				setState(129);
				statement();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(130);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__2);
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

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__22);
			setState(141);
			match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return method_atributes_sempred((Method_atributesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean method_atributes_sempred(Method_atributesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\36\n\2\3\2\3\2\5\2\"\n\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\5\2\62\n\2\7\2"+
		"\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\5\4"+
		"C\n\4\3\5\3\5\5\5G\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\t\3\t\5\t`\n\t\3\t\3\t\3"+
		"\t\7\te\n\t\f\t\16\th\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\7\ft\n\f\f\f\16\fw\13\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\3\f\5\f\u0082"+
		"\n\f\3\f\3\f\5\f\u0086\n\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\4Z{\3\20\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\4\2\32\32"+
		"\34\35\3\2\f\27\3\2\34\35\2\u009a\2\32\3\2\2\2\4<\3\2\2\2\6B\3\2\2\2\b"+
		"F\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16Q\3\2\2\2\20_\3\2\2\2\22i\3\2\2\2\24"+
		"k\3\2\2\2\26o\3\2\2\2\30\u008e\3\2\2\2\32\33\7\3\2\2\33%\7\4\2\2\34\36"+
		"\7\33\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37!\5\4\3\2 \"\7\33"+
		"\2\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#\35\3\2\2\2$\'\3\2\2\2%#\3\2\2\2"+
		"%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\5\2\2)*\7\33\2\2*+\7\6\2\2+\65\7\4"+
		"\2\2,.\7\33\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\61\5\4\3\2\60\62\7\33\2"+
		"\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63-\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\5\2\29\3\3"+
		"\2\2\2:=\5\6\4\2;=\5\30\r\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>C\5\f\7\2?"+
		"C\5\16\b\2@C\5\26\f\2AC\5\24\13\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2"+
		"\2\2C\7\3\2\2\2DG\5\n\6\2EG\7\34\2\2FD\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI"+
		"\7\35\2\2I\13\3\2\2\2JK\7\35\2\2KO\7\7\2\2LP\7\34\2\2MP\7\35\2\2NP\5\16"+
		"\b\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\r\3\2\2\2QR\5\22\n\2RS\7\b\2\2ST\5"+
		"\20\t\2TU\7\t\2\2U\17\3\2\2\2VZ\b\t\1\2WY\t\2\2\2XW\3\2\2\2Y\\\3\2\2\2"+
		"Z[\3\2\2\2ZX\3\2\2\2[`\3\2\2\2\\Z\3\2\2\2]^\7\13\2\2^`\5\20\t\3_V\3\2"+
		"\2\2_]\3\2\2\2`f\3\2\2\2ab\f\4\2\2bc\7\n\2\2ce\5\20\t\5da\3\2\2\2eh\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ij\t\3\2\2j\23\3\2\2\2"+
		"kl\7\35\2\2lm\7\7\2\2mn\t\4\2\2n\25\3\2\2\2op\7\30\2\2pq\7\35\2\2qu\7"+
		"\b\2\2rt\7\35\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v{\3\2\2\2wu"+
		"\3\2\2\2xz\7\n\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}"+
		"{\3\2\2\2~\177\7\t\2\2\177\u0089\7\4\2\2\u0080\u0082\7\33\2\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\5\4\3\2\u0084"+
		"\u0086\7\33\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3"+
		"\2\2\2\u0087\u0081\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\5"+
		"\2\2\u008d\27\3\2\2\2\u008e\u008f\7\31\2\2\u008f\u0090\7\32\2\2\u0090"+
		"\31\3\2\2\2\24\35!%-\61\65<BFOZ_fu{\u0081\u0085\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}