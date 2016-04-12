package calc;

import calc.HelloCalc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jim on 12/04/16.
 */
public class AddStepDefs {

    private Integer a;
    private Integer b;
    private Integer sum;
    private HelloCalc calc = new HelloCalc();

    @Given("^I have two positive numbers (\\d+) and (\\d+)$")
    public void iHaveTwoPositiveNumbers(Integer first, Integer second) throws Throwable {
        a = first;
        b = second;
    }

    @Given("^I have two negative numbers -(\\d+) and -(\\d+)$")
    public void iHaveTwoNegativeNumbers(Integer first, Integer second) throws Throwable {
        a = first;
        b = second;
    }

    @And("^I pass them to the add function$")
    public void iPassThemToTheAddFunction() throws Throwable {
        sum = calc.add(a, b);
    }

    @Then("^I should get the sum of the two numbers (\\d+)$")
    public void iShouldGetTheSumOfTheTwoNumbersPositive(Integer expected) throws Throwable {
        assertThat(sum, is(expected));
    }

    @Then("^I should get the sum of the two numbers -(\\d+)$")
    public void iShouldGetTheSumOfTheTwoNumbersNegative(Integer expected) throws Throwable {
        assertThat(sum, is(expected));
    }
}
