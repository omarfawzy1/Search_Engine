package com.team2.search_engine;

import com.team2.search_engine.logic.ParsingService;
import com.team2.search_engine.logic.SearchField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class QueryParserTest {
    String validSearchQuery = "PO with Code = 20220001";
    String unValidTypeSearchQuery = "XO with Code = 20220001";

    @Test
    @DisplayName("should extract valid search type when you enter valid query")
    void shouldExtractValidSearchType() {
        //Arrange
        ParsingService parsingService = new ParsingService();
        //Act
        String validSearchQuery = "PO with Code = 20220001";
        SearchField searchField = parsingService.getSearchField(validSearchQuery);
        //Assert
        Assertions.assertEquals("PO",searchField.getType());
        //CleanUp
    }

    @Test
    @DisplayName("should throw exception when  invalid search type when you enter invalid query")
    void shouldThrowExceptionWhenInValidSearchType() {
        //Arrange
        //Act
        //assert
        //CleanUp
    }

    @Test
    @DisplayName("should extract valid search filter when you enter valid query")
    public void shouldExtractValidSearchBy() {
        //Arrange

        //Act

        //Assert

        //Clean Up
    }

    @Test
    @DisplayName("should extract valid search operator when you enter valid query")
    public void shouldExtractValidSearchOperator() {
        //Arrange
        //Act

        //Assert
        //Clean Up
    }

    @Test
    @DisplayName("should extract valid search code when you enter valid query")
    public void shouldExtractValidSearchCode() {
        //Arrange
        //Act
        //Assert
        //Clean Up
    }

    @Test
    @DisplayName("should extract all valid search fields when you enter valid query")
    public void shouldExtractAllValidFields() {
        //Arrange
        //Act
        //Assert
        //Clean Up
    }
    /*


        Searchf
        Search controller  ( quer )
        Search service query -----> parsing service
                        <----- serchf
        Data Layer
     */

}
