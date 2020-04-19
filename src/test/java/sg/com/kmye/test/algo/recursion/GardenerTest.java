package sg.com.kmye.test.algo.recursion;

import org.junit.Test;
import sg.com.kmye.algo.recursion.Gardener;

public class GardenerTest {
    @Test
    public void test() {
        Gardener g = new Gardener(2);
        g.addToCosts("1 2 3");
        g.addToCosts("3 10 12");

        System.out.println(g.solve());
    }
}
