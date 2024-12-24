package by.a1.api;

import by.a1.user.Users;

public class LoginPage {

    private final String endPoint = "https://asmp.a1.by/communityrest/checkRegistration/email";
    private final String body = "{\n" +
            "    \"email\": \"test@test.ru\",\n" +
            "    \"realm\": \"email.a1.by\"\n" +
            "}";
    private final String contentType = "application/json";

    public String getEndPoint() {
        return endPoint;
    }

    public String getContentType() {
        return contentType;
    }

    public String getBodyInvalid() {
        return body;
    }

    private String generateEmail() {
        return Users.getUser().getEmail();
    }

    private String generatePassword() {
        return Users.getUser().getPassword();
    }

    public String getBodyWithEmailAndPassword() {
        String email = generateEmail();
        String password = generatePassword();
        return "{email: \"" + email + "\", realm: \"" + password + "\"}";
    }

    public String getBodyWithEmail() {
        String email = generateEmail();
        return "{email: \"" + email + "\", realm: \"email.a1.by\"\"}";
    }

}