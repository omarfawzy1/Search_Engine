package com.team2.search_engine.logic.grammar;

import com.team2.search_engine.logic.SearchField;

import java.util.ArrayList;
import java.util.List;

public class SearchListener extends searchGrammarBaseListener {
    private static final int
            TYPE = 0, FIELD = 2, OPERATOR = 3, VALUE = 4;
    private SearchField searchField;

    @Override
    public void enterSearch(searchGrammarParser.SearchContext ctx) {
        super.enterSearch(ctx);
        searchField = new SearchField(
                ctx.getChild(TYPE).getText(),
                ctx.getChild(FIELD).getText(),
                ctx.getChild(OPERATOR).getText(),
                ctx.getChild(VALUE).getText()
        );
    }

    @Override
    public void exitSearch(searchGrammarParser.SearchContext ctx) {
        super.exitSearch(ctx);
    }

    public SearchField getSearchField() {
        return searchField;
    }

    public void setCurrentSearch(SearchField currentSearch) {
        this.searchField = currentSearch;
    }
    
}
