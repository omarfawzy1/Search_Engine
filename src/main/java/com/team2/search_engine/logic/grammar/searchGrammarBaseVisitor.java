package com.team2.search_engine.logic.grammar;// Generated from D:/Work/search_engine_poc/src/main/antlr4\searchGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link searchGrammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class searchGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements searchGrammarVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSearch(searchGrammarParser.SearchContext ctx) { return visitChildren(ctx); }
}