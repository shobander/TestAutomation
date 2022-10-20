package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewtoursFlightFinderPage;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDef extends BaseUtil {
    private BaseUtil base;

    public NewtoursStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Newtours homepage")
    public void i_am_on_the_newtours_homepage() {
        base.driver.manage().window().maximize();
        base.driver.get("https://demo.guru99.com/selenium/newtours");
    }

    @When("I click on Flights link from the Left side menus on the Home page")
    public void i_click_on_flights_link_from_the_left_side_menus_on_the_home_page() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.ClickonflightsLink();
    }

    @Then("the Flight finder page should be displayed")
    public void the_flight_finder_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.IsFlightDetailsPageDisplayed(), equalTo(true));
    }

    @Then("the default Flight details type selected should be “One way”")
    public void the_default_flight_details_type_selected_should_be_one_way() {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.IsRoundTripSelectedByDefault(), equalTo(true));
    }

    @Then("the default On date and Returning date should be “January {int}”")
    public void the_default_on_date_and_returning_date_should_be_january(int int1) {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.GetDefaultDepartingMonth(), equalTo("July"));
        assertThat(newtoursFlightFinderPage.GetDefaultDepartingDay(), equalTo("12"));
    }

    @Then("the default service class should be “Economy Class”")
    public void the_default_service_class_should_be_economy_class() {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.IsEconomyClassSelecteByDefault(), equalTo(true));
    }

    //    //////////-----Scenario outline----/////
//    @Given("I am on the Newtours Website")
//    public void i_am_on_the_newtours_website() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @When("I click on the Register Link")
    public void i_click_on_the_register_link() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.ClickonRegisterLinkLocator();
    }

    @When("I enter {string}, password and confirm as {string}")
    public void i_enter_password_and_confirm_as(String username, String password) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUserName(username);
        newtoursRegisterPage.enterPassword(password);
        newtoursRegisterPage.enterConfirmPassword(password);
    }

    @When("enter {string}")
    public void enter(String countryName) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.selectCountry(countryName);
    }

    @When("I click submit button")
    public void i_click_submit_button() {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.submitForm();
    }

    @Then("confirmation page is displayed with my {string}")
    public void confirmation_page_is_displayed_with_my(String username) {
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
        System.out.println(newtoursRegisterConfirmationPage.verifyUsername());
        assertThat(newtoursRegisterConfirmationPage.verifyUsername().contains(username), equalTo(true));
    }

    @When("I enter the Contact information of {string}, {string}, {string} and {string}")
    public void iEnterTheContactInformationOfAnd(String arg0, String arg1, String arg2, String arg3) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterFirstName(arg0);
        newtoursRegisterPage.enterLastName(arg1);
        newtoursRegisterPage.enterPhone(arg2);
        newtoursRegisterPage.enterEmail(arg3);
    }

    @And("I enter mailing Information of {string},{string}, {string}, {string}")
    public void iEnterMailingInformationOfAnd(String arg0, String arg1, String arg2, String arg3) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterAddress(arg0);
        newtoursRegisterPage.enterCity(arg1);
        newtoursRegisterPage.enterState(arg2);
        newtoursRegisterPage.enterPostalCode(arg3);
    }
}
