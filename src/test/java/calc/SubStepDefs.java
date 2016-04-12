package calc;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jim on 12/04/16.
 */
public class SubStepDefs {

    private Integer difference;
    private CommonStepDefs commonSteps;

    public SubStepDefs(CommonStepDefs common) {
        this.commonSteps = common;
    }

    @And("^I pass them to the sub function$")
    public void iPassThemToTheSubFunction() throws Throwable {
        difference = commonSteps.getCalc().sub(commonSteps.getA(), commonSteps.getB());
    }

    @Then("^I should get the difference of the two numbers (\\d+)$")
    public void iShouldGetTheDifferenceOfTheTwoNumbersPositive(Integer expected) throws Throwable {
        assertThat(difference, is(expected));
    }

    @Then("^I should get the difference of the two numbers (-\\d+)$")
    public void iShouldGetTheDifferenceOfTheTwoNumbersNegative(Integer expected) throws Throwable {
        assertThat(difference, is(expected));
    }

}
