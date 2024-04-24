package by.a1.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class LoginTest {

    @Test
    @DisplayName("GET: statusCode 200")
    public void testLogin1() {
        LoginPage loginPage = new LoginPage();
        given().
        when().
                get(loginPage.getEndPointForMethodGet()).
        then().
                statusCode(200);
    }

    @Test
    @DisplayName("POST: 401 Unauthorized status code")
    public void testLogin2() {
        LoginPage loginPage = new LoginPage();
        given().
                contentType("application/json").
                body(loginPage.getBodyWithEmailAndPassword()).
        when().
                post(loginPage.getEndPoint()).
        then().
                log().all().
                statusCode(401);
    }

    @Test
    @DisplayName("POST: 500 login with empty body")
    public void testLogin3() {
        LoginPage loginPage = new LoginPage();
        String body = "";
        given().
                contentType("application/json").
                body(body).
        when().
                post(loginPage.getEndPoint()).
        then().
                statusCode(500);
    }

    @Test
    @DisplayName("POST: 422 login with empty Email field")
    public void testLogin4() {
        LoginPage loginPage = new LoginPage();
        given().
                contentType("application/json").
                body(loginPage.getBodyWithEmptyEmail()).
        when().
                post(loginPage.getEndPoint()).
        then().
                statusCode(422);
    }

    @Test
    @DisplayName("POST: 422 login with empty password field")
    public void testLogin5() {
        LoginPage loginPage = new LoginPage();
        given().
                contentType("application/json").
                body(loginPage.getBodyWithEmptyPassword()).
        when().
                post(loginPage.getEndPoint()).
        then().
                statusCode(422);
    }

}
