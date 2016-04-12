package calc;

import codebeamer.CodeBeamerTestCase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jim on 11/04/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/subtraction"})
@CodeBeamerTestCase(testCaseId = "1031")
public class TestHelloCalcCukeSubtraction {

}
