package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    WebDriver driver;

    By confirmationMessage = By.xpath("//h1");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationMessage() throws InterruptedException {

        Thread.sleep(1000);

        return driver.findElement(confirmationMessage).getText();
        
    }
}