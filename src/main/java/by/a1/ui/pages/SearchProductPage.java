package by.a1.ui.pages;

import by.a1.ui.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductPage {

    WebDriver driver;

    public SearchProductPage() {
        this.driver = Driver.getDriver();
    }

    private final String SEARCH_BTN = "//div[@class='search backdrop-push header-action']";
    private final String SEARCH_INPUT_FIELD = "//input[@class='form-input form-input--with-icon global-search-input ui-autocomplete-input']";
    private final String FIRST_PRODUCT = "//div[@class='product-listing-item product-listing-search-result observable-element']";
    private final String TEXT_PRODUCT = "//h1[@class='h h--1 pdp-header-heading']";

    public void getURL() {
        driver.get("https://www.a1.by/ru/");
        driver.findElement(By.xpath("//button[@class='button button--primary button--fixed-width']")).click();
    }

    public void clickSearchBtn() {
        driver.findElement(By.xpath(SEARCH_BTN)).click();
    }

    public void searchInput() {
        WebElement search = driver.findElement(By.xpath(SEARCH_INPUT_FIELD));
        search.click();
        search.sendKeys("Ноутбук", Keys.ENTER);
    }

    public void clickFirstProduct() {
        driver.findElement(By.xpath(FIRST_PRODUCT)).click();
    }

    public String getTextProduct() {
        WebElement element = driver.findElement(By.xpath(TEXT_PRODUCT));
        String name = element.getText();
        return name.split(" ")[0];
    }

}
