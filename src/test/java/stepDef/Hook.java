package stepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base = base;
    }

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
    }

//    base.driver = new FirefoxDriver();

    @After
    public void TearDown() throws IOException {
        takeScreenShot();
        base.driver.close();
        base.driver.quit();
    }

    private void takeScreenShot() throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) base.driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile,new File("target/screenshot" + System.currentTimeMillis() + ".png"));
    }
}
