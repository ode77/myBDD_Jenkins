package datePickerClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// SENDKEYS APPROACH HANDLING DATE PICKERS
public class DatePicker_1 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

//        SWITCH TO FRAME
        driver.switchTo().frame(0);

//        SENDKEYS METHODS
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/03/2025");
    }

}

