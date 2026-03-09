package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.FlightsPage;
import pages.PurchasePage;
import pages.ConfirmationPage;

public class FlightBookingTest extends BaseTest {

    @Test
    public void testFlightBooking() throws InterruptedException {

        driver.get("https://blazedemo.com");

        HomePage home = new HomePage(driver);

        home.selectDepartureCity("Boston");
        home.selectDestinationCity("New York");
        home.clickFindFlights();

        FlightsPage flights = new FlightsPage(driver);
        flights.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);

        purchase.completePurchase();   // fills form + click purchase

        // AFTER purchase → go to confirmation page
        ConfirmationPage confirm = new ConfirmationPage(driver);

        String message = confirm.getConfirmationMessage();

        System.out.println("Booking Status: " + message);
    }
}