package datePickerClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


// CLICKING APPROACH HANDLING DATE PICKERS FOR ONLY ONE DATE.


public class DatePicker_2 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

//        SWITCH TO FRAME
        driver.switchTo().frame(0);

//        CLICK INPUT BOX METHODS [NOTE DATA PASS IN APPLICATION MUST BE IN STRING FORMAT]
        String year = "2027";
        String month = "June";
        String date = "20";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

//        SELECT MONTH AND YESR
        while (true){
            String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // ACTUAL MONTH
            String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // ACTUAL YEAR

            if (currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //NEXT BUTTON ACTION

//            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //PREVIOUS BUTTON ACTION

        }
//        SELECT AND LOCATE THE DATE ELEMENT
        List<WebElement> allDates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt :allDates){
            if( dt.getText().equals(date))
            {
                dt.click();
                break;

            }

        }
    }
}
