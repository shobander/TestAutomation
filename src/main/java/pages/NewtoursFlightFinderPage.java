package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursFlightFinderPage extends BasePage {
    public NewtoursFlightFinderPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(xpath = "//input[@value='roundtrip']")
    private WebElement roundTripLocator;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement oneWayLocator;

    @FindBy(name = "passCount")
    private WebElement passengersLocator;

    @FindBy(name = "fromPort")
    private WebElement departingFromLocator;

    @FindBy(name= "fromMonth")
    private WebElement departingMonthLocator;

    @FindBy(name = "fromDay")
    private WebElement departingDayLocator;

    @FindBy(name="toPort")
    private WebElement arrivingInLocator;

    @FindBy(name = "toMonth")
    private WebElement arrivingMonthLocator;

    @FindBy(name="toDay")
    private WebElement arrivingDayLocator;

    @FindBy(xpath = "//input[@value='Coach']")
    private WebElement economyClassLocator;

    @FindBy(xpath = "//input[@value='Business']")
    private WebElement businessClassLocator;

    @FindBy(css = "input[value='First']")
    private WebElement firstClassLocator;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement airlinePreferenceLocator;

    @FindBy(css = "input[name='findFlights']")
    private WebElement continueButtonLocator;


    //////Methods to perform actions//////


}
