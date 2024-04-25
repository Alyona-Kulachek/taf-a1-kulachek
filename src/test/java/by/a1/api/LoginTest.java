package by.a1.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class LoginTest {

    @Test
    @DisplayName("POST: No header Content-Type")
    public void testLogin1() {
        LoginPage loginPage = new LoginPage();
        given().
                body(loginPage.getBodyWithGenerateEmailAndPassword()).
        when().
                post(loginPage.getEndPoint()).
        then().
                statusCode(415).
                body("error", equalTo("Unsupported Media Type"));
    }

    @Test
    @DisplayName("POST: Invalid data")
    public void testLogin2() {
        LoginPage loginPage = new LoginPage();
        given().
                contentType(loginPage.getContentType()).
                body(loginPage.getBodyInvalid()).
        when().
                post(loginPage.getEndPoint()).
        then().
                statusCode(404).
                body("Status", equalTo("User not registered"));
    }

    @Test
    @DisplayName("GET: Invalid method")
    public void testLogin3() {
        LoginPage loginPage = new LoginPage();
        given().
        when().
                get(loginPage.getEndPoint()).
        then().
                statusCode(405).
                body("error", equalTo("Method Not Allowed"));
    }

    @Test
    @DisplayName("POST: 400 ") //name
    public void testLogin4() {
        LoginPage loginPage = new LoginPage();
        given().
                contentType(loginPage.getContentType()).
                body(loginPage.getBodyWithGenerateEmail()).
        when().
                post(loginPage.getEndPoint()).
        then().
                statusCode(400);
    }

}
