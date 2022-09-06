package com.team2.search_engine.logic.grammar;// Generated from D:/Work/Search_Engine_Backend/src/main/antlr4\searchGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link searchGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface searchGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link searchGrammarParser#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(searchGrammarParser.SearchContext ctx);
}