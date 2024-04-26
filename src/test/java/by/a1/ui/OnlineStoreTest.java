package by.a1.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.a1.ui.pages.OnlineStorePage;

public class OnlineStoreTest extends BaseTest{

    @Test
    public void testOnlineStore() {
        OnlineStorePage onlineStorePage = new OnlineStorePage();
        onlineStorePage.getURL();
        onlineStorePage.selectOnlineStoreButton();
        onlineStorePage.selectSmartphoneButton();
        Assertions.assertEquals("Смартфоны", onlineStorePage.getTextSmartphoneField());
    }

}
