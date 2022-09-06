package com.team2.search_engine.logic;

import com.team2.search_engine.data.repository.SearchRepository;
import com.team2.search_engine.logic.grammar.SearchListener;
import com.team2.search_engine.logic.grammar.searchGrammarLexer;
import com.team2.search_engine.logic.grammar.searchGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;

@Service
public class ParsingService {
    private SearchRepository searchRepository ;
    public ParsingService(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    public ParsingService() {
    }

    public SearchField getSearchField(String query){
//       validSearchQuery = "PO with Code = 20220001";
        //Lexer
        searchGrammarLexer  searchGrammarLexer  = new searchGrammarLexer(CharStreams.fromString(query));
        // Po,with,Code,20220001
        CommonTokenStream tokenStream = new CommonTokenStream(searchGrammarLexer);
        //Build Parser
        searchGrammarParser searchGrammarParser = new searchGrammarParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        SearchListener searchListener = new SearchListener();
        walker.walk(searchListener,searchGrammarParser.search());
        return searchListener.getCurrentSearchField();
    }

}
