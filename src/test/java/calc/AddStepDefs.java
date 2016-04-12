package calc;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jim on 12/04/16.
 */
public class AddStepDefs {

    private Integer sum;
    private CommonStepDefs commonSteps;

    public AddStepDefs(CommonStepDefs common) {
        this.commonSteps = common;
    }

    @And("^I pass them to the add function$")
    public void iPassThemToTheAddFunction() throws Throwable {
        sum = commonSteps.getCalc().add(commonSteps.getA(), commonSteps.getB());
    }

    @Then("^I should get the sum of the two numbers (\\d+)$")
    public void iShouldGetTheSumOfTheTwoNumbersPositive(Integer expected) throws Throwable {
        assertThat(sum, is(expected));
    }

    @Then("^I should get the sum of the two numbers (-\\d+)$")
    public void iShouldGetTheSumOfTheTwoNumbersNegative(Integer expected) throws Throwable {
        assertThat(sum, is(expected));
    }
}
