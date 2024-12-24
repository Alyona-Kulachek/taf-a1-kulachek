package by.a1.ui.pages;

import by.a1.ui.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HelpAndSupportPage {
    WebDriver driver;

    public HelpAndSupportPage() {
        this.driver = Driver.getDriver();
    }

    private final String HELP_AND_SUPPORT_BTN = "(//li[@class='yCmsComponent header-top-item'])[4]";

    private final String CONTACT_SUPPORT_BTN = "(//a[@href='/chastnym-klientam/svjazatsya-s-tekh-podderzhkoy/'])[3]";
    private final String HOW_TO_CONTACT_SUPPORT_BTN = "//div[@class='tiles__item tiles__item--row']";
    private final String TEXT_CONTACT_SUPPORT = "//h1[@class='h2 page-title__value']";

    public void getURL() {
        driver.get("https://www.a1.by/ru/");
        driver.findElement(By.xpath("//button[@class='button button--primary button--fixed-width']")).click();
    }

    public void clickHelpAndSupportBtn() {
        driver.findElement(By.xpath(HELP_AND_SUPPORT_BTN)).click();
    }

    public void clickContactSupportBtn() {
        driver.findElement(By.xpath(CONTACT_SUPPORT_BTN)).click();
    }

    public void clickHowToContactSupportBtn() {
        driver.findElement(By.xpath(HOW_TO_CONTACT_SUPPORT_BTN)).click();
    }

    public String getTextContactSupport() {
       return driver.findElement(By.xpath(TEXT_CONTACT_SUPPORT)).getText();
    }

}
