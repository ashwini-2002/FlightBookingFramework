package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    WebDriver driver;

    By chooseFlight = By.xpath("(//input[@value='Choose This Flight'])[1]");            //html/body/div[2]/table/tbody/tr[1]/td[1]/input

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFlight() {
        driver.findElement(chooseFlight).click();
    }
}