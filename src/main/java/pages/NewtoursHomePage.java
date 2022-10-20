package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage {

    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }

    //////Locators
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnLinkLocator;
    @FindBy(linkText = "REGISTER")
    private WebElement registerLinkLocator;
    @FindBy(linkText = "SUPPORT")
    private WebElement supportLinkLocator;
    @FindBy(linkText = "CONTACT")
    private WebElement contactLinkLocator;
    @FindBy(linkText = "Home")
    private WebElement homeLinkLocator;
    @FindBy(linkText = "Flights")
    private WebElement flightsLinkLocator;
    @FindBy(linkText = "Hotels")
    private WebElement hotelsLinkLocator;
    @FindBy(linkText = "Car Rentals")
    private WebElement carRentalsLinkLocator;
    /*@FindBy(linkText = "SIGN-ON")
    private WebElement singOnLinkLocator;
    @FindBy(linkText = "SIGN-ON")
    private WebElement singOnLinkLocator;
    @FindBy(linkText = "SIGN-ON")
    private WebElement singOnLinkLocator;
    @FindBy(linkText = "SIGN-ON")
    private WebElement singOnLinkLocator;*/

    //////Methods to perform actions on the elements/locators

    public void ClickonflightsLink() {

        flightsLinkLocator.click();
    }

    public void ClickonSignOnLinkLocator() {

        signOnLinkLocator.click();
    }

    public void ClickonRegisterLinkLocator() {

        registerLinkLocator.click();
    }

    public void ClickonSupportLinkLocator() {

        supportLinkLocator.click();
    }

    public void ClickonContactLinkLocator() {

        contactLinkLocator.click();
    }

    public void ClickonHomeLinkLocator() {

        homeLinkLocator.click();
    }

    public void ClickonHotelsLinkLocator() {

        hotelsLinkLocator.click();
    }

    public void CliclonCarRentalsLinkLocator() {

        carRentalsLinkLocator.click();
    }
}
