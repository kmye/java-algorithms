package sg.com.kmye.test.algo.string;

import org.junit.Assert;
import org.junit.Test;
import sg.com.kmye.algo.string.GetDayOfWeek;

public class GetDayOfWeekTest {


    @Test
    public void testDay() {
        GetDayOfWeek dow = new GetDayOfWeek();

        Assert.assertEquals("Saturday", dow.dayOfTheWeek(31,8, 2019));
    }

}
