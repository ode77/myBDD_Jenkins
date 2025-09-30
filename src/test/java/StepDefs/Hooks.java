package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.DriverManager;

import java.io.File;
import java.io.IOException;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
    }


    @After
    public void tearDown() {
        try {
            takeScreenShot();
        } catch (IOException e) {
            e.printStackTrace();

        }
        DriverManager.quitDriver();


    }

    private void takeScreenShot() throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("target/screenshot" + System.currentTimeMillis() + ".png"));
    }
}
