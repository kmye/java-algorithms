package sg.com.kmye.test.algo.array;

import org.junit.Test;
import sg.com.kmye.algo.array.HourGlassSum;

import static org.junit.Assert.assertEquals;

public class HourClassSumTest {

    @Test
    public void checkSum() {

        {
            int[][] arr = {
                    {1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0},
            };

            int highestSum = HourGlassSum.getHighestSum(arr);

            assertEquals(7, highestSum);
        }

        {
            int[][] arr = {
                    {-9, -9, -9, 1, 1, 1},
                    {0, -9, 0, 4, 3, 2},
                    {-9, -9, -9, 1, 2, 3},
                    {0, 0, 8, 6, 6, 0},
                    {0, 0, 0, -2, 0, 0},
                    {0, 0, 1, 2, 4, 0}
            };

            int highestSum = HourGlassSum.getHighestSum(arr);

            assertEquals(28, highestSum);
        }
        {
            int[][] arr = {
                    {-1, -1, 0, -9, -2, -2,},
                    {-2, -1, -6, -8, -2, -5},
                    {-1, -1, -1, -2, -3, -4},
                    {-1, -9, -2, -4, -4, -5},
                    {-7, -3, -3, -2, -9, -9},
                    {-1, -3, -1, -2, -4, -5}
            };

            int highestSum = HourGlassSum.getHighestSum(arr);

            assertEquals(-6, highestSum);
        }
    }
}
