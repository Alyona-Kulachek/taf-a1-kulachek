package by.a1.api;

import by.a1.user.Users;

public class LoginPage {

    private String endPoint = "https://asmp.a1.by/communityrest/checkRegistration/email";
    private String body = "{\n" +
            "    \"email\": \"test@test.ru\",\n" +
            "    \"realm\": \"email.a1.by\"\n" +
            "}";
    private String contentType = "application/json";

    public String getEndPoint() {
        return endPoint;
    }

    public String getContentType() {
        return contentType;
    }

    public String getBodyInvalid() {
        return body;
    }

    public String generateEmail() {
        return Users.getUser().getEmail();
    }

    public String generatePassword() {
        return Users.getUser().getPassword();
    }

    public String getBodyWithGenerateEmailAndPassword() {
        String email = generateEmail();
        String password = generatePassword();
        String body = "{email: \"" + email + "\", realm: \"" + password + "\"}";
        return body;
    }

    public String getBodyWithGenerateEmail() {
        String email = generateEmail();
        String body = "{email: \"" + email + "\", realm: \"email.a1.by\"\"}";
        return body;
    }

}
