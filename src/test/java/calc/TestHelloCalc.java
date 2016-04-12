package calc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jim on 12/04/16.
 */
public class TestHelloCalc {

    @Test
    public void testAdd() throws Exception {
        HelloCalc calc = new HelloCalc();
        Integer sum = calc.add(5, 2);
        assertThat(sum, is(7));
    }

    @Test
    public void testSub() throws Exception {
        HelloCalc calc = new HelloCalc();
        Integer sum = calc.sub(5, 2);
        assertThat(sum, is(3));
    }

    @Test
    public void testMul() throws Exception {
        HelloCalc calc = new HelloCalc();
        Integer product = calc.mul(5, 2);
        assertThat(product, is(10));
    }

    @Test
    public void testDiv() throws Exception {
        HelloCalc calc = new HelloCalc();
        Integer quotient = calc.div(26, 2);
        assertThat(quotient, is(13));
    }
}
