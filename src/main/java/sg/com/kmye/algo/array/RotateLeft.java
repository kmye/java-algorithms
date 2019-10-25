package sg.com.kmye.algo.array;

public class RotateLeft {

    public static int[] rotate(int[] a, int d) {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[((i + d) % (a.length))];
        }

        return result;
    }
}
