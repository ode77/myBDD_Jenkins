package datePickerClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker_4 {

    //    SELECTING FUTURE DATE
    static  void selectFutureDate(WebDriver driver, String year, String month, String date)
    {

        while (true)
        {
            String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // ACTUAL MONTH
            String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // ACTUAL YEAR

            if (currentMonth.equals(month) && currentYear.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //NEXT BUTTON ACTION

        }
         List<WebElement> allDates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt :allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;

            }

        }

    }


    //    SELECTING PAST DATE
    static  void selectPreviousDate(WebDriver driver, String year, String month, String date)
    {

        while (true)
        {
            String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // ACTUAL MONTH
            String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // ACTUAL YEAR

            if (currentMonth.equals(month) && currentYear.equals(year))
            {
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //PREVIOUS BUTTON ACTION

        }
        List<WebElement> allDates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt :allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;

            }

        }

    }

    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

//        SWITCH TO FRAME
        driver.switchTo().frame(0);


        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//        FUTURE DATE
//        String year = "2027";
//        String month = "June";
//        String date = "20";

//       PREVIOUS DATE
        String year = "2022";
        String month = "May";
        String date = "10";

//        selectFutureDate(driver, year, month, date);

        selectPreviousDate(driver, year, month, date);

    }

}

