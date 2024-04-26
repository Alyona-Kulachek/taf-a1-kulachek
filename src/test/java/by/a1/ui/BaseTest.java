package by.a1.ui;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;


public class BaseTest {

    WebDriver driver;

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
