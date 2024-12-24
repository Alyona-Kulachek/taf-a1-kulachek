package by.a1.ui;

import by.a1.ui.pages.LoginPage;
import by.a1.user.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    @Test
    public void testLoginOpen() {
        LoginPage loginPage = new LoginPage();
        loginPage.getURL();
        loginPage.clickLoginBtn();
        loginPage.clickLoginPA();
        loginPage.clickLoginPASecondStep();
        Assertions.assertEquals("Вход в аккаунт", loginPage.getTextLogin());
    }

    @Test
    public void testLoginWithIncorrectData() {
        LoginPage loginPage = new LoginPage();
        loginPage.getURL();
        loginPage.clickLoginWithEmail();
        loginPage.interEmail(Users.getUser().getEmail());
        loginPage.interPassword(Users.getUser().getPassword());
        loginPage.clickLoginBtnEmailPassword();
        Assertions.assertEquals("Ошибка! Пожалуйста, проверьте введенный Email", loginPage.getTextError());
    }
}
