package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegisterPage extends BasePage {

    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement userNameLocator;

    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;

    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPasswordLocator;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitFormLocator;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement countryNameLocator;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameLocator;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameLocator;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneLocator;
    @FindBy(id = "userName")
    private WebElement emailLocator;
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement addressLocator;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityLocator;
    @FindBy(xpath = "//input[@name='state']")
    private WebElement stateLocator;
    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCodeLocator;




    //    ////////---------------///////////
//    Methods
    public void enterUserName(String username) {
        userNameLocator.sendKeys(username);
    }
    public void enterPassword(String Password) {
        passwordLocator.sendKeys(Password);
    }
    public void enterConfirmPassword(String Password) {
        confirmPasswordLocator.clear();
        confirmPasswordLocator.sendKeys(Password);
    }
    public void submitForm(){
        submitFormLocator.click();
    }
    public void selectCountry(String countryName){
        Select select = new Select(countryNameLocator);
        select.selectByVisibleText(countryName);
    }
    public void enterFirstName(String firstname){
        firstNameLocator.sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        lastNameLocator.sendKeys(lastname);
    }
    public void enterPhone(String phone){
        phoneLocator.sendKeys(phone);
    }
    public void enterEmail(String email){
        emailLocator.sendKeys(email);
    }
    public void enterAddress(String address){
        addressLocator.sendKeys(address);
    }
    public void enterCity(String city){
        cityLocator.sendKeys(city);
    }
    public void enterState(String state){
        stateLocator.sendKeys(state);
    }
    public void enterPostalCode(String postalcode){
        postalCodeLocator.sendKeys(postalcode);
    }


}
