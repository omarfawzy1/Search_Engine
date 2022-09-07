package com.team2.search_engine.logic;

import com.team2.search_engine.logic.grammar.ParsingErrorListener;
import com.team2.search_engine.logic.grammar.SearchListener;
import com.team2.search_engine.logic.grammar.searchGrammarLexer;
import com.team2.search_engine.logic.grammar.searchGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;

@Service
public class ParsingService {
    private CommonTokenStream token;
    private SearchListener searchListener;

    public SearchField parseQuery(String query) {
        initLaxer(query);
        initParser();
        return searchListener.getSearchField();
    }

    private void initLaxer(String searchQuery) {
        //Build Laxer
        searchGrammarLexer searchGrammarLexer = new searchGrammarLexer();
        searchGrammarLexer.setInputStream(CharStreams.fromString(searchQuery));
        //Get Tokens
        token = new CommonTokenStream(searchGrammarLexer);
    }

    private void initParser() {
        //Build Parser
        searchGrammarParser searchGrammarParser = new searchGrammarParser(token);
        searchGrammarParser.removeErrorListeners();
        searchGrammarParser.addErrorListener(ParsingErrorListener.INSTANCE);
        //Build Parse Tree
        ParseTreeWalker walker = new ParseTreeWalker();
        //Build Search Listener
        searchListener = new SearchListener();
        //start searching
        walker.walk(searchListener, searchGrammarParser.search());
    }

}
