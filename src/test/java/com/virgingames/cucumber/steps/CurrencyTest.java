package com.virgingames.cucumber.steps;

import com.virgingames.currencydetails.CurrencySteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

public class CurrencyTest {
    static ValidatableResponse response;

    @Steps
    CurrencySteps currencySteps;

    @When("User sends a GET request to {string} endpoint")
    public void userSendsAGETRequestToEndpoint(String currency) {

        if (currency.equalsIgnoreCase("GBP"))
            response = currencySteps.getAllGBP();
        if (currency.equalsIgnoreCase("EUR"))
            response = currencySteps.getAllEUR();
        if (currency.equalsIgnoreCase("SEK"))
            response = currencySteps.getAllSEK();
    }

    @Then("User must get response with valid status code {int}")
    public void userMustGetResponseWithValidStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }
}
