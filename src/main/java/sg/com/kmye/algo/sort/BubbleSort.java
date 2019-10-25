package sg.com.kmye.algo.sort;

public class BubbleSort {

    public static int[] sort(int[] inputArray) {

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i + 1] < inputArray[i]) {
                    int temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return inputArray;
    }
}
