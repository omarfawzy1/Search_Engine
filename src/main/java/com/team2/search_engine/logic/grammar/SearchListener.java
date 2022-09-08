package com.team2.search_engine.logic.grammar;

import com.team2.search_engine.data.model.SearchField;

public class SearchListener extends searchGrammarBaseListener {
    private static final int
            TYPE = 0, FIELD = 2, OPERATOR = 3, VALUE = 4;
    private SearchField searchField;

    @Override
    public void enterSearch(searchGrammarParser.SearchContext ctx) {
        super.enterSearch(ctx);
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < ctx.CODE().size(); i++) {
            value
                    .append(ctx.CODE(i).getText())
                    .append(" ")
            ;
        }
        value.setLength(value.length() - 1);
        searchField = new SearchField(
                ctx.getChild(TYPE).getText().toLowerCase(),
                ctx.getChild(FIELD).getText().toLowerCase(),
                ctx.getChild(OPERATOR).getText().toLowerCase(),
                value.toString()
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
