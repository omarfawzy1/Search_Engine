package com.team2.search_engine.service;

import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.repository.SearchRepository;
import com.team2.search_engine.logic.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @Autowired
    private SearchRepository cor;



    @GetMapping("/man")
    public String getBook(String searchInput) {
        System.err.println("get book called with" + searchInput);
        return null;
    }

    @GetMapping("/SearchForPOwithExact")
    public List<PurchaseOrder> getPOwithExact(@RequestParam(name = "type") String type, @RequestParam(name = "value") String value){
        return cor.findPOExact(type,value);
    }

    @GetMapping("/SearchForPOwithLike")
    public List<PurchaseOrder> getPOwithLike(@RequestParam(name = "type") String type, @RequestParam(name = "value") String value){
        return cor.findPOLike(type,value);
    }

    @GetMapping("")
    public String max(){
        return "hi";
    }

    @GetMapping("/test")
    public String getTest(){
        System.err.println("get test called");
        return "2002020202";
    }
}
