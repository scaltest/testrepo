import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by jim on 11/04/16.
 */
public class TestHelloCalc {

    @Test
    public void testAdd() throws Exception {
        HelloCalc hc = new HelloCalc();
        assertEquals(new Integer(10), hc.add(5, 5));
    }

    @Test
    public void testSub() throws Exception {
        HelloCalc hc = new HelloCalc();
        assertEquals(new Integer(-4), hc.sub(2, 6));
    }


}
