package com.team2.search_engine.logic.grammar;

import com.team2.search_engine.logic.SearchField;

import java.util.ArrayList;
import java.util.List;

public class SearchListener extends searchGrammarBaseListener {
    private static final int
            TYPE = 0, FIELD = 2, OPERATOR = 3, VALUE = 4;
    private SearchField currentSearchField;
    private List<SearchField> searchList = new ArrayList<>();

    @Override
    public void enterSearch(searchGrammarParser.SearchContext ctx) {
        super.enterSearch(ctx);
        currentSearchField = new SearchField(
                ctx.getChild(TYPE).getText(),
                ctx.getChild(FIELD).getText(),
                ctx.getChild(OPERATOR).getText(),
                ctx.getChild(VALUE).getText()
        );
    }

    @Override
    public void exitSearch(searchGrammarParser.SearchContext ctx) {
        super.exitSearch(ctx);
        searchList.add(currentSearchField);
    }

    public SearchField getCurrentSearchField() {
        return currentSearchField;
    }

    public void setCurrentSearch(SearchField currentSearch) {
        this.currentSearchField = currentSearch;
    }

    public List<SearchField> getSearchList() {
        return searchList;
    }

    public void setSearchList(List<SearchField> searchList) {
        this.searchList = searchList;
    }
}
