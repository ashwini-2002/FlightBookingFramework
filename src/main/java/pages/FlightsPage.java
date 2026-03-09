package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    WebDriver driver;

    By chooseFlight = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFlight() {
        driver.findElement(chooseFlight).click();
    }
}