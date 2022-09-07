package com.team2.search_engine.service;

import com.team2.search_engine.logic.SearchService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }
}
