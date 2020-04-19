package sg.com.kmye.test.algo.string;

import org.junit.Assert;
import org.junit.Test;
import sg.com.kmye.algo.string.DominosCompare;

import java.util.Arrays;
import java.util.List;

public class DominosCompareTest {

    @Test
    public void test() {

        DominosCompare compare = new DominosCompare();

        List<String> longestDominos = compare.getLongestDominos("6-1,1-2,2-3,1-2,2-3,3-6,6-7");

        Assert.assertEquals(Arrays.asList("6-1,1-2,2-3", "1-2,2-3,3-6,6-7"), longestDominos);

        compare.getLongestCommonDominos()
    }
}
