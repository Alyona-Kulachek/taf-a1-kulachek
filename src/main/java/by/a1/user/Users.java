package by.a1.user;

import com.github.javafaker.Faker;
public class Users {
    public static User getUser() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), faker.internet().password());
    }
}
