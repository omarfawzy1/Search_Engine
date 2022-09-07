package com.team2.search_engine.logic;

import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.model.SearchField;
import com.team2.search_engine.data.repository.SearchRepository;
import com.team2.search_engine.service.SearchController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class SearchServiceTest {
    @Autowired
    private SearchService searchService;
    @MockBean
    private SearchRepository searchRepository;
    @MockBean
    private ParsingService parsingService;
    private List<PurchaseOrder> purchaseOrderList;

    @TestConfiguration
    static class SearchServiceTestContextConfiguration {
        @Bean
        public SearchService provideSearchService() {
            return new SearchService();
        }
    }

//    @BeforeAll
//    public void TestSetUp() {
//        purchaseOrderList = new ArrayList<>();
//        purchaseOrderList.add(new PurchaseOrder("2020000048", "Local Purchase Order", "000002 - Zhejiang", null, "Signmedia", "Shipped"));
//        purchaseOrderList.add(new PurchaseOrder("2020000047", "Service Purchase Order", "000002 - Zhejiang", "Local Purchase Order - 2018000017", "Signmedia", "Confirmed"));
//        purchaseOrderList.add(new PurchaseOrder("2021000001", "Service Purchase Order", "000001 - Zhejiang", "Local Purchase Order - 2018000017", "Signmedia", "Draft"));
//    }

    @Test
    public void shouldReturnPurchaseOrderWithSpecificCode() {
        //Arrange
        SearchField searchField = new SearchField("po","code","=","2020000048");
        List<PurchaseOrder> purchaseOrderResults = new ArrayList<>();
        purchaseOrderResults.add(new PurchaseOrder("2020000048", "Local Purchase Order", "000002 - Zhejiang", null, "Signmedia", "Shipped"));
        //Act;
        given(parsingService.parseQuery("po with code = 2020000048")).willReturn(searchField);
        given((List<PurchaseOrder>)(Object)searchRepository.find(searchField)).willReturn(purchaseOrderResults);
        List<PurchaseOrder> purchaseOrder = (List<PurchaseOrder>) searchService.find("po with code = 2020000048");
        //Assert
        Assertions.assertSame(purchaseOrder,purchaseOrderResults);
        //Clean Up
    }
}
