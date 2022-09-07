package com.team2.search_engine.logic.grammar;// Generated from D:/Work/search_engine_poc/src/main/antlr4\searchGrammar.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class searchGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, WITH=2, SEARCH_BY=3, SEARCH_OPERATOR=4, CODE=5, CRLF=6, WS=7;
	public static final int
		RULE_search = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"search"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "WITH", "SEARCH_BY", "SEARCH_OPERATOR", "CODE", "CRLF", 
			"WS"
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
	public String getGrammarFileName() { return "searchGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public searchGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SearchContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(searchGrammarParser.TYPE, 0); }
		public TerminalNode WITH() { return getToken(searchGrammarParser.WITH, 0); }
		public TerminalNode SEARCH_BY() { return getToken(searchGrammarParser.SEARCH_BY, 0); }
		public TerminalNode SEARCH_OPERATOR() { return getToken(searchGrammarParser.SEARCH_OPERATOR, 0); }
		public List<TerminalNode> CODE() { return getTokens(searchGrammarParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(searchGrammarParser.CODE, i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof searchGrammarListener ) ((searchGrammarListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof searchGrammarListener ) ((searchGrammarListener)listener).exitSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof searchGrammarVisitor ) return ((searchGrammarVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(TYPE);
			setState(3);
			match(WITH);
			setState(4);
			match(SEARCH_BY);
			setState(5);
			match(SEARCH_OPERATOR);
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CODE) {
				{
				{
				setState(6);
				match(CODE);
				}
				}
				setState(11);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007\r\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000\u0002"+
		"\u0001\u0000\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003\u0004"+
		"\u0005\u0002\u0000\u0000\u0004\u0005\u0005\u0003\u0000\u0000\u0005\t\u0005"+
		"\u0004\u0000\u0000\u0006\b\u0005\u0005\u0000\u0000\u0007\u0006\u0001\u0000"+
		"\u0000\u0000\b\u000b\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000"+
		"\u0000\t\n\u0001\u0000\u0000\u0000\n\u0001\u0001\u0000\u0000\u0000\u000b"+
		"\t\u0001\u0000\u0000\u0000\u0001\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}