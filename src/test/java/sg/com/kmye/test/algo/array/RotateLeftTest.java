package sg.com.kmye.test.algo.array;

import org.junit.Test;
import sg.com.kmye.algo.array.RotateLeft;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RotateLeftTest {

    @Test
    public void Test() {
        int[] result = RotateLeft.rotate(new int[] {1, 2, 3, 4, 5}, 2);

        assertEquals("[3, 4, 5, 1, 2]", Arrays.toString(result));
    }
}
