package com.team2.search_engine.data.repository;

import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.model.SearchField;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomPurchaseOrderRepositoryImplTest {
    @Autowired
    CustomPurchaseOrderRepositoryImpl sr;

    @Test
    void find() {
        SearchField sf = new SearchField(
                "po",
                "me",
                "~",
                "2020"
        );
        sr.find(sf);
    }
}