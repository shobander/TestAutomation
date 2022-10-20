package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(name = "fromMonth")
    private WebElement departingMonthLocator;

    @FindBy(name = "fromDay")
    private WebElement departingDayLocator;

    @FindBy(name = "toPort")
    private WebElement arrivingInLocator;

    @FindBy(name = "toMonth")
    private WebElement arrivingMonthLocator;

    @FindBy(name = "toDay")
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

    @FindBy(xpath = "//font[contains(text(),'Details')]")
    private WebElement flightDetailsLocator;
    //////Methods to perform actions//////

    //    Methods
    public boolean IsFlightDetailsPageDisplayed() {
        return flightDetailsLocator.isDisplayed();
    }

    public boolean IsRoundTripSelectedByDefault() {
        boolean result = false;
        try {
            String value = roundTripLocator.getAttribute("checked");
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }

    public String GetDefaultDepartingMonth() {
        Select select = new Select(departingMonthLocator);
        WebElement a = select.getFirstSelectedOption();
        String b = a.getText();
        return b;
    }

    public String GetDefaultDepartingDay() {
        Select select = new Select(departingDayLocator);
        WebElement a = select.getFirstSelectedOption();
        String b = a.getText();
        return b;
    }

    public boolean IsEconomyClassSelecteByDefault(){
        return IsAttribuePresent("checked", economyClassLocator);
    }

    public boolean IsOneWaySelecteByDefault(){
        return IsAttribuePresent("checked", oneWayLocator);
    }


}
