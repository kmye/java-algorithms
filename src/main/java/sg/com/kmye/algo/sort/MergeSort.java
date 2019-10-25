package sg.com.kmye.algo.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> sort(List<Integer> unsortedList) {

        int listSize = unsortedList.size();

        if (listSize <= 1) {
            return unsortedList;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int middle = listSize / 2;

        for (int i = 0; i < middle; i++) {
            left.add(unsortedList.get(i));
        }
        for (int i = middle; i < listSize; i++) {
            right.add(unsortedList.get(i));
        }

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();

        while (left.size() > 0 || right.size() > 0) {

            boolean hasLeftElements = !left.isEmpty();
            boolean hasRightElements = !right.isEmpty();

            if (hasLeftElements && hasRightElements) {
                if (left.get(0) <= right.get(0)) {
                    result.add(left.remove(0));
                } else {
                    result.add(right.remove(0));
                }
            } else if (hasLeftElements) {
                result.add(left.remove(0));
            } else if (hasRightElements) {
                result.add(right.remove(0));
            }
        }

        return result;
    }

}
