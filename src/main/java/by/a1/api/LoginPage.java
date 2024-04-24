package by.a1.api;

import by.a1.user.Users;

public class LoginPage {
    private String endPointForMethodGet = "https://www.a1.by/ru/";
    private String endPointForMethodPost = "https://asmp.a1.by/communityrest/checkRegistration/email";

    public String getEndPointForMethodGet() {
        return endPointForMethodGet;
    }

    public String getEndPoint() {
        return endPointForMethodPost;
    }

    public String generateEmail() {
        return Users.getUser().getEmail();
    }

    public String generatePassword() {
        return Users.getUser().getPassword();
    }

    public String getBodyWithEmailAndPassword() {
        String email = generateEmail();
        String password = generatePassword();
        String body = "{email: \"" + email + "\", password: \"" + password + "\"}";
        return body;
    }

    public String getBodyWithEmptyEmail() {
        String email = "";
        String password = generatePassword();
        String body = "{email: \"" + email + "\", password: \"" + password + "\"}";
        return body;
    }

    public String getBodyWithEmptyPassword() {
        String email = generateEmail();
        String password = "";
        String body = "{email: \"" + email + "\", password: \"" + password + "\"}";
        return body;
    }

}
