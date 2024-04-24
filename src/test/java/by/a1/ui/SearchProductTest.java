package by.a1.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.a1.ui.pages.SearchProductPage;

public class SearchProductTest extends BaseTest{

    @Test
    public void testSearchProductAddToFavorite() {
        SearchProductPage searchProductPage = new SearchProductPage();
        searchProductPage.selectSearchButton();
        searchProductPage.searchInput();
        searchProductPage.selectFirstProduct();
        Assertions.assertEquals("Ноутбук", searchProductPage.getTextProduct());
    }

}
