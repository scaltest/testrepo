package calc;

import cucumber.api.java.en.Given;

/**
 * Created by jim on 12/04/16.
 */
public class CommonStepDefs {

    private Integer a;
    private Integer b;
    private HelloCalc calc = new HelloCalc();

    protected Integer getA() {
        return a;
    }

    protected void setA(Integer a) {
        this.a = a;
    }

    protected Integer getB() {
        return b;
    }

    protected void setB(Integer b) {
        this.b = b;
    }

    protected HelloCalc getCalc() {
        return calc;
    }

    @Given("^I have two positive numbers (\\d+) and (\\d+)$")
    public void iHaveTwoPositiveNumbers(Integer first, Integer second) throws Throwable {
        setA(first);
        setB(second);
    }

    @Given("^I have two negative numbers (-\\d+) and (-\\d+)$")
    public void iHaveTwoNegativeNumbers(Integer first, Integer second) throws Throwable {
        setA(first);
        setB(second);
    }
}
