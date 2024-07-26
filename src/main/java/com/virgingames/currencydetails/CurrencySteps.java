package com.virgingames.currencydetails;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class CurrencySteps {

    @Step("Getting all data with currency GBP")
    public ValidatableResponse getAllGBP() {
        return SerenityRest.given()
                .queryParam("Currency", "GBP")
                .when()
                .get(EndPoints.GET_INFO)
                .then();
    }

    @Step("Getting all data with currency EUR")
    public ValidatableResponse getAllEUR() {
        return SerenityRest.given()
                .queryParam("currency", "EUR")
                .when()
                .get(EndPoints.GET_INFO)
                .then();
    }

    @Step("Getting all data with currency SEK")
    public ValidatableResponse getAllSEK() {
        return SerenityRest.given()
                .queryParam("currency", "SEK")
                .when()
                .get(EndPoints.GET_INFO)
                .then();
    }
}
