package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    By fromCity = By.name("fromPort");
    By toCity = By.name("toPort");
    By findFlights = By.xpath("//input[@value='Find Flights']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDepartureCity(String city) throws InterruptedException {

        Select select = new Select(driver.findElement(fromCity));
        select.selectByVisibleText(city);

        Thread.sleep(1000);
    }

    public void selectDestinationCity(String city) throws InterruptedException {

        Select select = new Select(driver.findElement(toCity));
        select.selectByVisibleText(city);

        Thread.sleep(1000);
    }

    public void clickFindFlights() throws InterruptedException {

        driver.findElement(findFlights).click();

        Thread.sleep(1000);
    }
}