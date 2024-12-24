package by.a1.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class SearchTest {
    @Test
    @DisplayName("GET: Successful search")
    public void testSuccessfulSearch() {
        SearchPage searchPage = new SearchPage();
        given().
                param(searchPage.getHeaderKey(), searchPage.getHeaderValue()).
        when().
                get(searchPage.getEndPoint()).
        then().
                statusCode(200).
                contentType(searchPage.getContentTypeValue());
    }

    @Test
    @DisplayName("GET: Empty search")
    public void testEmptySearch() {
        SearchPage searchPage = new SearchPage();
        given().
        when().
                get(searchPage.getEndPoint()).
        then().
                statusCode(200);
    }

    @Test
    @DisplayName("GET: Search with result limit")
    public void testSearchWithResultLimit() {
        SearchPage searchPage = new SearchPage();
        given().
                param(searchPage.getHeaderKey(), searchPage.getHeaderValue()).
                param(searchPage.getHeaderLimit(), searchPage.generateNumber()).
        when().
                get(searchPage.getEndPoint()).
        then().
                statusCode(200);
    }

    @Test
    @DisplayName("GET: Search with empty result")
    public void testSearchWithEmptyResult() {
        SearchPage searchPage = new SearchPage();
        String nonexistentKeyword = "nonexistent";
        given().
                param(searchPage.getHeaderKey(), nonexistentKeyword).
        when().
                get(searchPage.getEndPoint()).
        then().
                statusCode(200).
                contentType(searchPage.getContentTypeValue());
    }

}
