package by.a1.ui.pages;

import by.a1.ui.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    private final String LOGIN_BTN = "//span[@class='icon icon--user-profile']";
    private final String LOGIN_P_A = "//a[@href='https://myaccount.a1.by']";
    private final String LOGIN_P_A_SECOND_STEP = "//a[@href='/login']";
    private final String TEXT_LOGIN = "//span[@class='MuiTypography-root MuiTypography-bold-32-24 css-ud862c']";
    private final String LOGIN_WITH_EMAIL = "//span[text()='Email']";
    private final String EMAIL_INPUT_FIELD = "//input[@class='MuiInputBase-input MuiFilledInput-input css-1sx8zkw']";
    private final String PASSWORD_INPUT_FIELD = "//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd css-m7pft5']";
    private final String LOGIN_BTN_EMAIL_PASSWORD = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-xl-6 MuiGrid-grid-xl-6 css-1p40sbt']";
    private final String TEXT_ERROR = "//span[@class='MuiTypography-root MuiTypography-regular-14-12-red css-qlsogc']";

    public void getURL() {
        driver.get("https://www.a1.by/ru/");
        driver.findElement(By.xpath("//button[@class='button button--primary button--fixed-width']")).click();
    }

    public void clickLoginBtn() {
        driver.findElement(By.xpath(LOGIN_BTN)).click();
    }

    public void clickLoginPA() {
        driver.findElement(By.xpath(LOGIN_P_A)).click();
    }

    public void clickLoginPASecondStep() {
        driver.findElement(By.xpath(LOGIN_P_A_SECOND_STEP)).click();
    }

    public String getTextLogin() {
        return driver.findElement(By.xpath(TEXT_LOGIN)).getText();
    }

    public void clickLoginWithEmail() {
        clickLoginBtn();
        clickLoginPA();
        clickLoginPASecondStep();
        driver.findElement(By.xpath(LOGIN_WITH_EMAIL)).click();
    }

    public void interEmail(String email) {
        WebElement interEmail = driver.findElement(By.xpath(EMAIL_INPUT_FIELD));
        interEmail.sendKeys(email);
    }

    public void interPassword(String password) {
        WebElement interPassword = driver.findElement(By.xpath(PASSWORD_INPUT_FIELD));
        interPassword.sendKeys(password);
    }

    public void clickLoginBtnEmailPassword() {
        driver.findElement(By.xpath(LOGIN_BTN_EMAIL_PASSWORD)).click();
    }

    public String getTextError() {
        return driver.findElement(By.xpath(TEXT_ERROR)).getText();
    }
}
