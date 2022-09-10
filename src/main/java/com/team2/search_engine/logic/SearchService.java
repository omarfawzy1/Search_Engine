package com.team2.search_engine.logic;

import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.model.SearchField;
import com.team2.search_engine.data.repository.SearchRepository;
import com.team2.search_engine.error.NotFoundException;
import com.team2.search_engine.error.ParsingException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
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
        SearchField searchField = null;
        try {
         searchField = parsingService.parseQuery(query);

        }catch (ParseCancellationException ex)
        {
            throw new ParsingException(ex.getMessage());
        }
        List<?> searchResult = searchRepository.find(searchField);
        if (searchResult.isEmpty())
            throw new NotFoundException("Sorry,This item was not found");
        return searchRepository.find(searchField);
    }
}
