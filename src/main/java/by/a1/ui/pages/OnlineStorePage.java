package by.a1.ui.pages;

import by.a1.ui.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineStorePage {
    WebDriver driver;

    public OnlineStorePage() {
        this.driver = Driver.getDriver();
    }

    private final String ONLINE_STORE_BUTTON = "//a[@href='/ru/c/shop']";
    private final String SMARTPHONE_BUTTON = "//a[@href='/ru/c/smartphones']";
    private final String TEXT_SMARTPHONE = "//div[@class='row row--full-width row--page-heading']";

    public void getURL() {
        driver.get("https://www.a1.by/ru/");
        driver.findElement(By.xpath("//button[@class='button button--primary button--fixed-width']")).click();
    }

    public void selectOnlineStoreButton() {
        driver.findElement(By.xpath(ONLINE_STORE_BUTTON)).click();
    }

    public void selectSmartphoneButton() {
        driver.findElement(By.xpath(SMARTPHONE_BUTTON)).click();
    }

    public String getTextSmartphoneField() {
        return driver.findElement(By.xpath(TEXT_SMARTPHONE)).getText();
    }
}
