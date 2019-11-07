package sg.com.kmye.test.algo.string;

import org.junit.Assert;
import org.junit.Test;
import sg.com.kmye.algo.string.ReverseWords;

public class ReverseWordsTest {

    @Test
    public void TestReverse() {
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWords.reverse("Let's take LeetCode contest"));
    }
}
