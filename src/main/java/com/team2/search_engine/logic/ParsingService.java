package com.team2.search_engine.logic;

import com.team2.search_engine.data.repository.SearchRepository;
import org.springframework.stereotype.Service;

@Service
public class ParsingService {
    private SearchRepository searchRepository ;
    public ParsingService(SearchRepository searchRepository) {

        this.searchRepository = searchRepository;


    }

    public ParsingService() {
    }

    public SearchField getSearchField(String msg){

        SearchField searchField = new SearchField("PO", "Code", "=", "20220001");

        return searchField;
    }

}
