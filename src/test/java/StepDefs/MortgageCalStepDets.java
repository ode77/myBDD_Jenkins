package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageLoanBreakdownPage;
import pages.MortgageRepaymentPage;
import utilities.PropertyReaders;

import java.io.IOException;
import java.util.List;

import static StepDefs.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MortgageCalStepDets {
    MortgageLoanBreakdownPage mortgageLoanBreakdownPage = new MortgageLoanBreakdownPage(driver);
    MortgageRepaymentPage mortgageRepaymentPage = new MortgageRepaymentPage(driver);
    @Given("I am on the Mortgage calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws IOException {
        PropertyReaders proReader = new PropertyReaders();
        driver.get(proReader.getMortgageCal_Url());


    }
    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        mortgageLoanBreakdownPage.setHomeValue(dataTable.get(1).get(1));
        mortgageLoanBreakdownPage.setDownPayment(dataTable.get(2).get(1));
        mortgageLoanBreakdownPage.setInterestRate(dataTable.get(3).get(1));
        mortgageLoanBreakdownPage.setLoanTerm(dataTable.get(4).get(1));
        mortgageLoanBreakdownPage.selectStartMonth(dataTable.get(5).get(1));
        mortgageLoanBreakdownPage.setStartYear(dataTable.get(6).get(1));



    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {

    }
    @When("I click on calculate link")
    public void i_click_on_calculate_link() {
        mortgageLoanBreakdownPage.clickCalculate();
    }

    @Then("I should get mortgage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String toMonPmt, String dPmt, String dPmtPer, String lPayoff, String tIntPd, String mTaxpd) {
        assertThat(mortgageRepaymentPage.getTotalMonthlyPayment(), is(equalTo(toMonPmt)));
        System.out.println(toMonPmt);
        assertThat(mortgageRepaymentPage.getDownPaymentAmount(), is(equalTo(dPmt)));
        System.out.println(dPmt);
        assertThat(mortgageRepaymentPage.getDownPaymentPercentage(), is(equalTo(dPmtPer)));
        System.out.println(dPmtPer);
        assertThat(mortgageRepaymentPage.getLoanPayoffDate(), is(equalTo(lPayoff)));
        System.out.println(lPayoff);
        assertThat(mortgageRepaymentPage.getTotalIntrestPaid(), is(equalTo(tIntPd)));
        System.out.println(tIntPd);
        assertThat(mortgageRepaymentPage.getMonthlyTaxPaid(), is(equalTo(mTaxpd)));
        System.out.println(mTaxpd);

    }
    @When("I enter the following data")
    public void i_enter_the_following_data(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        mortgageLoanBreakdownPage.setPropertyTax(dataTable.get(1).get(1));
        mortgageLoanBreakdownPage.setPMI(dataTable.get(2).get(1));
        mortgageLoanBreakdownPage.setHomeInsurance(dataTable.get(3).get(1));
        mortgageLoanBreakdownPage.setMonthlyHOA(dataTable.get(4).get(1));
        mortgageLoanBreakdownPage.selectLoanType(dataTable.get(5).get(1));

    }
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String totalTaxPaid, String monthlyHomeInsurance, String totalHomeInsurance, String annualPaymentAmount, String totalof360Payments) {
        assertThat(mortgageRepaymentPage.getTotalTaxPaid(),is(equalTo(totalTaxPaid)));
        System.out.println(totalTaxPaid);
        assertThat(mortgageRepaymentPage.getMonthlyHomeInsurance(),is(equalTo(monthlyHomeInsurance)));
        System.out.println(monthlyHomeInsurance);
        assertThat(mortgageRepaymentPage.getTotalHomeInsurance(),is(equalTo(totalHomeInsurance)));
        System.out.println(totalHomeInsurance);
        assertThat(mortgageRepaymentPage.getAnnualPaymentAmount(),is(equalTo(annualPaymentAmount)));
        System.out.println(annualPaymentAmount);
        assertThat(mortgageRepaymentPage.getTotalOf360Pmt(),is(equalTo(totalof360Payments)));
        System.out.println(totalof360Payments);

    }
}
