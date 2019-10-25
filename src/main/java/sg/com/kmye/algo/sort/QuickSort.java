package sg.com.kmye.algo.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<Integer> sort(List<Integer> unsortedList) {
        int size = unsortedList.size();

        if (size <= 1) {
            return unsortedList;
        }

        int mid = (int) Math.floor(size / 2);

        Integer pivot = unsortedList.get(mid);

        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (Integer element : unsortedList) {
            if (element < pivot) {
                less.add(element);
            } else if (element == pivot) {
                equal.add(element);
            } else {
                greater.add(element);
            }
        }

        less = sort(less);
        greater = sort(greater);

        List<Integer> result = new ArrayList<>();

        result.addAll(less);
        result.addAll(equal);
        result.addAll(greater);

        return result;
    }
}
