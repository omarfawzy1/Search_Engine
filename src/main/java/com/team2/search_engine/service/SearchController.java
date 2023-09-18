package com.team2.search_engine.service;

import com.team2.search_engine.logic.SearchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/search")
public class SearchController {
    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }
    @GetMapping("")
    public ResponseEntity<List<?>> findResults(@RequestParam String query) {
        List<?> results = searchService.find(query);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

}
