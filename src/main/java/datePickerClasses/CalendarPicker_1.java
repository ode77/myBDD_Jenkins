package datePickerClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class CalendarPicker_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


        //   BY SENDKEYS FORMAT

//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/20/2027");

        // BY WHILE LOOP FORMAT
        String month = "07";
        String date = "29";
        String year = "2027";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        while (true)
        {
            String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // ACTUAL MONTH
            String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // ACTUAL YEAR

            if (currentMonth.equals(month) && currentYear.equals(year))
            {
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

//            driver.findElement(By.xpath(" //span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            Thread.sleep(2000);



//        DATE SELECTION
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

            for (WebElement dt: allDates){
                if (dt.getText().equals(date)){
                    dt.click();
                    break;
                }
            }
        }


    }
}
