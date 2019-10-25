package sg.com.kmye.algo.array;

public class HourGlassSum {

    public static int getHighestSum(int[][] arr) {

        int xSize = arr.length;
        int ySize = arr[0].length;

        int x = 0;
        int y = 0;

        Integer highestSum = null;

        do {

            int sum = arr[y][x] + arr[y][x + 1] + arr[y][x + 2]
                    + arr[y + 1][x + 1]
                    + arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2];

            if (highestSum == null || highestSum < sum) {
                highestSum = sum;
            }

            ++x;

            if (x + 2 >= xSize) {
                x = 0;
                ++y;
            }

        } while (y + 2 < ySize);

        return highestSum;
    }
}
