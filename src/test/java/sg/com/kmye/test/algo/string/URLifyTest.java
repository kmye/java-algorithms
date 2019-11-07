package sg.com.kmye.test.algo.string;

import org.junit.Assert;
import org.junit.Test;
import sg.com.kmye.algo.string.URLify;

public class URLifyTest {

    @Test
    public void TestUrl() {
        Assert.assertEquals("Mr%20John%20Smith", URLify.convert("Mr John Smith    "));
    }
}
