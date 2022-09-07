package com.team2.search_engine.data.repository;

import com.team2.search_engine.data.model.SearchField;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomPurchaseOrderRepository{
    List<Object> find(SearchField searchField);

}
