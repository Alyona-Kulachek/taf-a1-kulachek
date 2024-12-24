package by.a1.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.a1.ui.pages.SearchProductPage;

public class SearchProductTest extends BaseTest{

    @Test
    public void testSearchProductAddToFavorite() {
        SearchProductPage searchProductPage = new SearchProductPage();
        searchProductPage.getURL();
        searchProductPage.clickSearchBtn();
        searchProductPage.searchInput();
        searchProductPage.clickFirstProduct();
        Assertions.assertEquals("Ноутбук", searchProductPage.getTextProduct());
    }
}
