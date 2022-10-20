package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public boolean IsAttribuePresent(String attributeName, WebElement ele) {
        boolean result = false;
        try {
            String value = ele.getAttribute(attributeName);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }
}


