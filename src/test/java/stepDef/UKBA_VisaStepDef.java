package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UKBA_VisaStepDef extends BaseUtil {
    private BaseUtil base;

    public UKBA_VisaStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the UKBA website")
    public void i_am_on_the_ukba_website() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gov.uk/check-uk-visa/y");
        base.driver.navigate();
        try {
            base.driver.findElement(By.xpath("//*[.='Accept additional cookies']")).click();
            base.driver.findElement(By.xpath("//button[.='Hide this message']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("This is an exception thrown" + e);
        }
    }

    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        // Write code here that turns the phrase above into concrete actions
        Select select = new Select(base.driver.findElement(By.id("response")));
        select.selectByVisibleText(countryName);
    }

    @When("I click on the Continue button")
    public void i_click_on_the_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement continueButton = base.driver.findElement(By.xpath("//*[.='Continue']"));
        continueButton.click();
//        base.driver.findElement(By.xpath("//*[.='Continue']")).click();
    }

    @When("I select the reason {string}")
    public void i_select_the_reason(String string) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.id("response-2")).click();
    }

    @When("I state I am intending to stay for more than {int} months")
    public void i_state_i_am_intending_to_stay_for_more_than_months(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.cssSelector("input[id='response-1']")).click();
    }

    @Then("I will be informed {string}")
    public void i_will_be_informed(String string) {
        // Write code here that turns the phrase above into concrete actions
//        assertThat(base.driver.findElement(By.xpath("//*[.='You’ll need a visa to study in the UK']")).getText(), equalTo(string));
        assertThat(base.driver.findElement(By.xpath("//*[.='" + string + "']")).getText(), equalTo(string));
    }

    //    Scenario 2
    @And("I select {string} as reason for coming to the UK")
    public void iSelectAsReasonForComingToTheUK(String arg0) {
        base.driver.findElement(By.id("response-0")).click();
//        base.driver.findElement(By.cssSelector("input#response-0")).click();
    }

//    Scenario 3

    @And("I state I am not travelling or visiting a partner or family")
    public void iStateIAmNotTravellingOrVisitingAPartnerOrFamily() {
        base.driver.findElement(By.id("response-1")).click();
    }
}
