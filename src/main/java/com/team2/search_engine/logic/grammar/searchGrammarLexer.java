package com.team2.search_engine.logic.grammar;// Generated from D:/Work/Search_Engine_Backend/src/test/resources/design\searchGrammar.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class searchGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, WITH=2, SEARCH_BY=3, SEARCH_OPERATOR=4, CODE=5, BusinessUnit=6, 
		ReferenceDocument=7, CRLF=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "WITH", "SEARCH_BY", "SEARCH_OPERATOR", "CODE", "BusinessUnit", 
			"ReferenceDocument", "CRLF", "WS"
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
			null, "TYPE", "WITH", "SEARCH_BY", "SEARCH_OPERATOR", "CODE", "BusinessUnit", 
			"ReferenceDocument", "CRLF", "WS"
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
		"\u0004\u0000\t`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00021\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u00046\b\u0004\u000b\u0004\f\u00047\u0001\u0004\u0004\u0004"+
		";\b\u0004\u000b\u0004\f\u0004<\u0003\u0004?\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005C\b\u0005\n\u0005\f\u0005F\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006L\b\u0006\n\u0006\f\u0006O\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007T\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007X\b\u0007\u0001\b\u0004\b[\b\b\u000b\b\f"+
		"\b\\\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0015"+
		"\u0002\u0000PPpp\u0002\u0000OOoo\u0002\u0000WWww\u0002\u0000IIii\u0002"+
		"\u0000TTtt\u0002\u0000HHhh\u0002\u0000CCcc\u0002\u0000DDdd\u0002\u0000"+
		"EEee\u0002\u0000VVvv\u0002\u0000NNnn\u0002\u0000RRrr\u0002\u0000SSss\u0002"+
		"\u0000AAaa\u0002\u0000YYyy\u0002\u0000==~~\u0005\u0000--09AZ__az\u0002"+
		"\u0000AZaz\u0002\u0000BBbb\u0003\u0000  AZaz\u0003\u0000\t\n\r\r  l\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u0016"+
		"\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00072\u0001\u0000"+
		"\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000"+
		"\rI\u0001\u0000\u0000\u0000\u000fW\u0001\u0000\u0000\u0000\u0011Z\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0007\u0000\u0000\u0000\u0014\u0015\u0007"+
		"\u0001\u0000\u0000\u0015\u0002\u0001\u0000\u0000\u0000\u0016\u0017\u0007"+
		"\u0002\u0000\u0000\u0017\u0018\u0007\u0003\u0000\u0000\u0018\u0019\u0007"+
		"\u0004\u0000\u0000\u0019\u001a\u0007\u0005\u0000\u0000\u001a\u0004\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0007\u0006\u0000\u0000\u001c\u001d\u0007"+
		"\u0001\u0000\u0000\u001d\u001e\u0007\u0007\u0000\u0000\u001e1\u0007\b"+
		"\u0000\u0000\u001f \u0007\t\u0000\u0000 !\u0007\b\u0000\u0000!\"\u0007"+
		"\n\u0000\u0000\"#\u0007\u0007\u0000\u0000#$\u0007\u0001\u0000\u0000$1"+
		"\u0007\u000b\u0000\u0000%&\u0007\f\u0000\u0000&\'\u0007\u0004\u0000\u0000"+
		"\'(\u0007\r\u0000\u0000()\u0007\u0004\u0000\u0000)1\u0007\b\u0000\u0000"+
		"*+\u0007\u0004\u0000\u0000+,\u0007\u000e\u0000\u0000,-\u0007\u0000\u0000"+
		"\u0000-1\u0007\b\u0000\u0000.1\u0003\u000b\u0005\u0000/1\u0003\r\u0006"+
		"\u00000\u001b\u0001\u0000\u0000\u00000\u001f\u0001\u0000\u0000\u00000"+
		"%\u0001\u0000\u0000\u00000*\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0007"+
		"\u000f\u0000\u00003\b\u0001\u0000\u0000\u000046\u0007\u0010\u0000\u0000"+
		"54\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008?\u0001\u0000\u0000\u00009;\u0007\u0011"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000"+
		">5\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?\n\u0001\u0000\u0000"+
		"\u0000@D\u0007\u0012\u0000\u0000AC\u0007\u0013\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"GH\u0007\u0004\u0000\u0000H\f\u0001\u0000\u0000\u0000IM\u0007\u000b\u0000"+
		"\u0000JL\u0007\u0013\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0007\u0004\u0000\u0000"+
		"Q\u000e\u0001\u0000\u0000\u0000RT\u0005\r\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UX\u0005\n\u0000"+
		"\u0000VX\u0005\r\u0000\u0000WS\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\u0010\u0001\u0000\u0000\u0000Y[\u0007\u0014\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\b\u0000"+
		"\u0000_\u0012\u0001\u0000\u0000\u0000\n\u000007<>DMSW\\\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}