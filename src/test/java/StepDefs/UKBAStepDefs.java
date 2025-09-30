package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.PropertyReaders;

import java.io.IOException;

import static StepDefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UKBAStepDefs {
    @Given("I am on UKba Website")
    public void i_am_on_u_kba_website() throws IOException {
        PropertyReaders propertyReaders = new PropertyReaders();
        driver.get(propertyReaders.getUKBA_Url());

    }
    @When("I click on Accept additional cookies")
    public void i_click_on_accept_additional_cookies() {
        try{
            WebElement clickOnCokies = driver.findElement(By.xpath("//button[@data-accept-cookies='true']"));
            if (clickOnCokies.isDisplayed()) {
                clickOnCokies.click();
                System.out.println("Cookies accepted.");
            }
        } catch (Exception e) {
            // Cookie popup not found or not displayed
            System.out.println("No cookie popup found. Continuing test...");
        }
    }

    @Then("I click on StartNow button")
    public void i_click_on_start_now_button() {
        WebElement clickOnStartNowBtn = driver.findElement(By.xpath("//a[@rel='nofollow']"));
        clickOnStartNowBtn.click();

    }
    @Then("the Check if you need a UK visa page is displayed")
    public void the_check_if_you_need_a_uk_visa_page_is_displayed() {
        WebElement CheckIfVisaNeededIsDisplayed = driver.findElement(By.xpath("//h1[contains(text(),' Check if you need a UK visa')]"));
        assertThat(CheckIfVisaNeededIsDisplayed.getText(),is(equalTo("Check if you need a UK visa")));

    }
    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        WebElement setNationality = driver.findElement(By.xpath("//select[@id='response']"));
        Select country = new Select(setNationality);
        country.selectByVisibleText(countryName);

    }
    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        WebElement clickOnContinueBtn = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
        clickOnContinueBtn.click();

    }
    @When("I select reason as {string}")
    public void i_select_reason_as(String string) {
        WebElement setReason = driver.findElement(By.id("response-2"));
        setReason.click();

    }
    @When("I state I intend to stay for more than {int} months")
    public void i_state_i_intend_to_stay_for_more_than_months(Integer int1) {
        WebElement clickLongerThan6Months = driver.findElement(By.id("response-1"));
        clickLongerThan6Months.click();

    }
    @Then("I should get a respond {string} as coming to UK")
    public void i_should_get_a_respond_as_coming_to_uk(String mssage) {
        WebElement getResponseMessage = driver.findElement(By.xpath("(//h2[@class='gem-c-heading__text govuk-heading-m'])[1]"));
        assertThat(getResponseMessage.getText(),is(equalTo(mssage)));

    }

    @And("I select the reason as {string}")
    public void iSelectTheReasonAs(String arg0) {
        WebElement setReasonForVisingUK = driver.findElement(By.id("response-0"));
        setReasonForVisingUK.click();

    }

    @And("I select {string} button for travelling with or visiting partner or family member")
    public void iSelectButtonForTravellingWithOrVisitingPartnerOrFamilyMember(String arg0) {
        WebElement setYes = driver.findElement(By.id("response-0"));
        setYes.click();

    }

    @Then("I should get a {string} as coming to UK")
    public void iShouldGetAAsComingToUK(String mssge) {
        WebElement getInformedMessage = driver.findElement(By.xpath("//h2[@class='gem-c-heading__text govuk-heading-m']"));
        assertThat(getInformedMessage.getText(),is(equalTo(mssge)));
    }

}
