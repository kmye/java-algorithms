package sg.com.kmye.algo.sort;

public class InsertionSort {

    public static int[] sort(int[] unsortedArray) {
        for (int i = 1; i < unsortedArray.length; i++) {

            int temp = unsortedArray[i];

            int j;

            for (j = i - 1; j >= 0 && temp < unsortedArray[j]; j--) {
                unsortedArray[j + 1] = unsortedArray[j];
            }

            unsortedArray[j + 1] = temp;
        }

        return unsortedArray;
    }
}
