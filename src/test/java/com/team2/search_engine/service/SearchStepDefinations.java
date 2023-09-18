package com.team2.search_engine.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team2.search_engine.data.entity.PurchaseOrder;
import com.team2.search_engine.data.repository.SearchRepository;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@ComponentScan({"com.team2.search_engine"})
@SpringBootTest
@CucumberContextConfiguration
@AutoConfigureMockMvc
public class SearchStepDefinations {

    @Autowired
    MockMvc mvc;

    @Autowired
    SearchRepository sr;

    MvcResult result;
    @DataTableType
    public PurchaseOrder authorEntry(Map<String, String> entry) {
        return new PurchaseOrder(
                entry.get("Code"),
                entry.get("Type"),
                entry.get("Vendor"),
                entry.get("Reference Document"),
                entry.get("Business Unit"),
                entry.get("State"));
    }

    @Given("Purchase Orders in the system are as follows:")
    public void purchaseOrdersInTheSystemAreAsFollows(List<PurchaseOrder> pos) {
        sr.saveAll(pos);
    }

    @When("Operator requests for purchase orders with {string} with query {string}")
    public void operatorRequestsForPurchaseOrdersWithCodeWithQuery(String type,String searchQuery) throws Exception {
        result = mvc.perform(get("/api/v1/search").param("query",searchQuery)).andReturn();
    }

    @Then("the System Results Will Show as follows:")
    public void the_system_results_will_show_as_follows(List<PurchaseOrder> pos) throws UnsupportedEncodingException, JsonProcessingException {
        String json = result.getResponse().getContentAsString();
        PurchaseOrder expectedPurchaseOrders[] = new PurchaseOrder[pos.size()];
        pos.toArray(expectedPurchaseOrders);
        PurchaseOrder inComingPurchaseOrders[] = new ObjectMapper().readValue(json, PurchaseOrder[].class);
        assertThat(expectedPurchaseOrders.length)
                .overridingErrorMessage(
                    String.format("Expected purchase orders count is (%d) but was (%d) %s \n "
                    ,expectedPurchaseOrders.length,inComingPurchaseOrders.length,Arrays.toString(inComingPurchaseOrders)))
                .isEqualTo(inComingPurchaseOrders.length);

        for(PurchaseOrder order : inComingPurchaseOrders){
            boolean found = false;
            for(PurchaseOrder expected : expectedPurchaseOrders){
                if(expected.equals(order)){
                    found = true;
                    break;
                }
            }
            assertThat(found).overridingErrorMessage(String.format("did not found the %s in the %s",order,Arrays.toString(expectedPurchaseOrders))).isTrue();

        }
    }


    @When("Operator searches for query {string}")
    public void operatorSearchesForQueryQuery(String searchQuery) throws Exception {
        result = mvc.perform(get("/api/v1/search").param("query",searchQuery)).andReturn();
    }

    @Then("Error message {string} returned")
    public void errorMessageAppear(String expectedErrorMessge) throws UnsupportedEncodingException {
        assertThat(result.getResponse().getContentAsString()).contains(expectedErrorMessge);
    }
}
