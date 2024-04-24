package by.a1.ui.pages;

import by.a1.ui.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    private final String TITLE_FIELD = "//div/div[@class='content']";

    public String getTextTitle() throws InterruptedException {
        Thread.sleep(4000);
        return driver.findElement(By.xpath(TITLE_FIELD)).getText();
    }
}
