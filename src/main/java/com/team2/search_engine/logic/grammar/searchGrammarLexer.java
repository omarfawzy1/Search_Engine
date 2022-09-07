package com.team2.search_engine.logic.grammar;// Generated from D:/Work/search_engine_poc/src/main/antlr4\searchGrammar.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class searchGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, WITH=2, SEARCH_BY=3, SEARCH_OPERATOR=4, CODE=5, CRLF=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "WITH", "SEARCH_BY", "SEARCH_OPERATOR", "CODE", "CRLF", "WS"
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


	public searchGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public searchGrammarLexer() {
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);

	}

	@Override
	public String getGrammarFileName() { return "searchGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007A\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0004\u00040\b\u0004\u000b\u0004\f\u00041\u0001\u0005\u0003"+
		"\u00055\b\u0005\u0001\u0005\u0001\u0005\u0003\u00059\b\u0005\u0001\u0006"+
		"\u0004\u0006<\b\u0006\u000b\u0006\f\u0006=\u0001\u0006\u0001\u0006\u0000"+
		"\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u0001\u0000\u0012\u0002\u0000PPpp\u0002\u0000OOoo\u0002"+
		"\u0000WWww\u0002\u0000IIii\u0002\u0000TTtt\u0002\u0000HHhh\u0002\u0000"+
		"CCcc\u0002\u0000DDdd\u0002\u0000EEee\u0002\u0000VVvv\u0002\u0000NNnn\u0002"+
		"\u0000RRrr\u0002\u0000SSss\u0002\u0000AAaa\u0002\u0000YYyy\u0002\u0000"+
		"==~~\u0005\u0000--09AZ__az\u0003\u0000\t\n\r\r  G\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0001\u000f\u0001\u0000\u0000\u0000\u0003\u0012\u0001\u0000\u0000\u0000"+
		"\u0005*\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t/\u0001"+
		"\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0007\u0000\u0000\u0000\u0010\u0011\u0007\u0001\u0000"+
		"\u0000\u0011\u0002\u0001\u0000\u0000\u0000\u0012\u0013\u0007\u0002\u0000"+
		"\u0000\u0013\u0014\u0007\u0003\u0000\u0000\u0014\u0015\u0007\u0004\u0000"+
		"\u0000\u0015\u0016\u0007\u0005\u0000\u0000\u0016\u0004\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0007\u0006\u0000\u0000\u0018\u0019\u0007\u0001\u0000"+
		"\u0000\u0019\u001a\u0007\u0007\u0000\u0000\u001a+\u0007\b\u0000\u0000"+
		"\u001b\u001c\u0007\t\u0000\u0000\u001c\u001d\u0007\b\u0000\u0000\u001d"+
		"\u001e\u0007\n\u0000\u0000\u001e\u001f\u0007\u0007\u0000\u0000\u001f "+
		"\u0007\u0001\u0000\u0000 +\u0007\u000b\u0000\u0000!\"\u0007\f\u0000\u0000"+
		"\"#\u0007\u0004\u0000\u0000#$\u0007\r\u0000\u0000$%\u0007\u0004\u0000"+
		"\u0000%+\u0007\b\u0000\u0000&\'\u0007\u0004\u0000\u0000\'(\u0007\u000e"+
		"\u0000\u0000()\u0007\u0000\u0000\u0000)+\u0007\b\u0000\u0000*\u0017\u0001"+
		"\u0000\u0000\u0000*\u001b\u0001\u0000\u0000\u0000*!\u0001\u0000\u0000"+
		"\u0000*&\u0001\u0000\u0000\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0007"+
		"\u000f\u0000\u0000-\b\u0001\u0000\u0000\u0000.0\u0007\u0010\u0000\u0000"+
		"/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u00002\n\u0001\u0000\u0000\u000035\u0005\r"+
		"\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000069\u0005\n\u0000\u000079\u0005\r\u0000\u000084\u0001"+
		"\u0000\u0000\u000087\u0001\u0000\u0000\u00009\f\u0001\u0000\u0000\u0000"+
		":<\u0007\u0011\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0006\u0006\u0000\u0000@\u000e\u0001\u0000\u0000\u0000"+
		"\u0006\u0000*148=\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}