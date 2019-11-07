package sg.com.kmye.test.algo.recursion;

import org.junit.Test;
import sg.com.kmye.algo.recursion.SuperDigit;

import static org.junit.Assert.assertEquals;

public class SuperDigitTest {

    @Test
    public void test() {
        int i = SuperDigit.superDigit("123", 3);

        assertEquals(9, i);
    }
}
