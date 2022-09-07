package com.team2.search_engine.logic.grammar;// Generated from D:/Work/search_engine_poc/src/main/antlr4\searchGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link searchGrammarParser}.
 */
public interface searchGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link searchGrammarParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(searchGrammarParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link searchGrammarParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(searchGrammarParser.SearchContext ctx);
}