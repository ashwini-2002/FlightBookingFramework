package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    // Constructor
    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zipCode = By.id("zipCode");
    By cardType = By.id("cardType");
    By creditCardNumber = By.id("creditCardNumber");
    By creditCardMonth = By.id("creditCardMonth");
    By creditCardYear = By.id("creditCardYear");
    By nameOnCard = By.id("nameOnCard");
    By rememberMe = By.id("rememberMe");
    By purchaseFlightBtn = By.cssSelector("input[type='submit']");

    // Method to fill purchase form
    public void completePurchase() throws InterruptedException {

        driver.findElement(name).sendKeys("Ashwini");
        Thread.sleep(1000);

        driver.findElement(address).sendKeys("123 Balaji Layout");
        Thread.sleep(1000);

        driver.findElement(city).sendKeys("Ballari");
        Thread.sleep(1000);

        driver.findElement(state).sendKeys("Karnataka");
        Thread.sleep(1000);

        driver.findElement(zipCode).sendKeys("583101");
        Thread.sleep(1000);

        driver.findElement(cardType).sendKeys("Visa");
        Thread.sleep(1000);

        driver.findElement(creditCardNumber).sendKeys("1234567898765432");
        Thread.sleep(1000);

        driver.findElement(creditCardMonth).clear();
        driver.findElement(creditCardMonth).sendKeys("12");
        Thread.sleep(1000);

        driver.findElement(creditCardYear).clear();
        driver.findElement(creditCardYear).sendKeys("2026");
        Thread.sleep(1000);

        driver.findElement(nameOnCard).sendKeys("Ashwini");
        Thread.sleep(1000);

        // Remember Me checkbox
        driver.findElement(rememberMe).click();
        Thread.sleep(1000);

        // Purchase Flight button
        driver.findElement(purchaseFlightBtn).click();
        Thread.sleep(1000);
    }
}