package com.team2.search_engine.logic;

import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.model.SearchField;
import com.team2.search_engine.data.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private ParsingService parsingService;
    @Autowired
    private SearchRepository searchRepository;

    public List<?> find(String query) {
        SearchField searchField = parsingService.parseQuery(query);
        return searchRepository.find(searchField);
    }
}
