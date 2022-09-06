package com.team2.search_engine.service;

import com.team2.search_engine.logic.ParsingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    private ParsingService searchService;

    public SearchController(ParsingService searchService) {
        this.searchService = searchService;
    }
}
