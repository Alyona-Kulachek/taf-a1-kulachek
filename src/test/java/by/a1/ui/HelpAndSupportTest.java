package by.a1.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.a1.ui.pages.HelpAndSupportPage;

public class HelpAndSupportTest extends BaseTest{

    @Test
    public void testHelpAndSupportSection() {
        HelpAndSupportPage helpAndSupportPage = new HelpAndSupportPage();
        helpAndSupportPage.getURL();
        helpAndSupportPage.clickHelpAndSupportBtn();
        helpAndSupportPage.clickContactSupportBtn();
        helpAndSupportPage.clickHowToContactSupportBtn();
        Assertions.assertEquals("Связаться с тех.поддержкой", helpAndSupportPage.getTextContactSupport());
    }
}
