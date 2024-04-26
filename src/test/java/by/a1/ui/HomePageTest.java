package by.a1.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.a1.ui.pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void testHomePageTitleField() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getURL();
        Assertions.assertEquals("© 2024 Унитарное предприятие «А1». Все права защищены.", homePage.getTextTitle());
    }
}
