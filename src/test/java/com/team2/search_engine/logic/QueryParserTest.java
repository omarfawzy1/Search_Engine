package com.team2.search_engine.logic;

import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.model.SearchField;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class QueryParserTest {
    String validSearchQuery = "PO with Business Unit = 20220001";
    String unValidTypeSearchQuery = "XO with Code = 20220001";
    @Autowired
    private ParsingService parsingService;

    @TestConfiguration
    static class TodoServiceContextConfiguration {
        @Bean
        public ParsingService provideParsingService() {
            return new ParsingService();
        }
    }

    @Test
    @DisplayName("should extract valid search type when you enter valid query")
    void shouldExtractValidSearchType() {
        //Act
        SearchField searchField = parsingService.parseQuery(validSearchQuery);
        //Assert
        Assertions.assertEquals(PurchaseOrder.class, searchField.getType());
        Assertions.assertEquals("code", searchField.getField());
        //CleanUp
    }
    @Test
    @DisplayName("should extract valid business unit  when you enter valid query")
    void shouldExtractValidBusinessUnit() {
        //Act
        SearchField searchField = parsingService.parseQuery(validSearchQuery);
        //Assert
        Assertions.assertEquals("bs", searchField.getField());
        //CleanUp
    }
    @Test
    @DisplayName("should extract valid reference document  when you enter valid query")
    void shouldExtractValidReferenceDocument() {
        String query  = "Po with reference document = 555555";
        //Act
        SearchField searchField = parsingService.parseQuery(query);
        //Assert
        Assertions.assertEquals("rf", searchField.getField());
        //CleanUp
    }
    @Test
    @DisplayName("should throw exception when  invalid search type when you enter invalid query")
    void shouldThrowExceptionWhenInValidSearchType() {
        //Act && Assert
        Exception exception =assertThrows(ParseCancellationException.class, () -> parsingService.parseQuery(unValidTypeSearchQuery));
        //CleanUp
        System.out.println(exception.getMessage());

    }

    @Test
    @DisplayName("should extract valid search filter when you enter valid query")
    public void shouldExtractValidSearchBy() {
        //Act
        SearchField resultSearchField = parsingService.parseQuery(validSearchQuery);
        //assert
        Assertions.assertEquals("Code", resultSearchField.getField());
        //CleanUp
    }

    @Test
    @DisplayName("should extract valid search operator when you enter valid query")
    public void shouldExtractValidSearchOperator() {
        //Act
        SearchField resultSearchField = parsingService.parseQuery(validSearchQuery);
        //assert
        Assertions.assertEquals("=", resultSearchField.getOperator());
        //CleanUp
    }

    @Test
    @DisplayName("should extract valid search value when you enter valid query")
    public void shouldExtractValidSearchCode() {
        //Act
        SearchField resultSearchField = parsingService.parseQuery(validSearchQuery);
        //assert
        Assertions.assertEquals("20220001", resultSearchField.getValue());
        //CleanUp
    }


}
