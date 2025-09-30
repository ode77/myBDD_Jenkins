package datePickerClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class DatePicker_6 {

    //    CREATING NEW USER DEFINE FUNCTION/METHOD FOR CONVERTING MONTHS  FROM STRING -----> MONTHS OBJECT
    static Month converMonth(String month) {
        HashMap <String, Month> monthMap = new HashMap<String, Month>();

        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month vmonth = monthMap.get(month);

        if (vmonth == null) {
            System.out.println("Invalid Month...");

        }
        return vmonth;

    }
    static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate){
        //        SELECT YEAR
        WebElement yearDropDown = driver.findElement(By.xpath(""));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);


//        SELECT MONTH
        while (true)
        {
            String displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

//        CONVERT REQUIREDMONTH & DISPLAYEDMONTH INTO MONTH OBJECTS
            Month expectedMonth = converMonth(requiredMonth);
            Month currentMonth = converMonth(displayedMonth);

//        COMPARE
            int result = expectedMonth.compareTo(currentMonth);
//        0 months are equal
//        >0 future month
//        <0 past month

            if (result < 0) {
                driver.findElement(By.xpath("")).click(); // past month

            } else if (result > 0) {
                driver.findElement(By.xpath("")).click(); // future month

            } else
            {
                break;
            }
        }
//        DATE SELECTION
        List<WebElement> allDates = driver.findElements(By.xpath(""));

        for (WebElement dt: allDates){
            if (dt.getText().equals(requiredDate)){
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


//        INPUT
        //        FUTURE DATE
        String requiredYear = "2021";
        String requiredMonth = "June";
        String requiredDate = "20";

        driver.switchTo().frame("frame-one.797656169");
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        selectDate(driver, requiredYear,requiredMonth, requiredDate );


    }
}


//        https://dummy-tickets.com/buyticket
//        https://www.dummyticket.com/dummy-ticket-for-visa-application/

