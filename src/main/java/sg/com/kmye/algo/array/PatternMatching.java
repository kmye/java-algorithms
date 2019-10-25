package sg.com.kmye.algo.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Find all matching pattern position in the array
 *
 *  int[] target = {1, 2, 3, 4, 1, 2, 1, 2, 3};
 *  int[] pattern = {1, 2, 3};
 *
 *  List<Integer> matchPosition = PatternMatching.getMatchPosition(target, pattern);
 */
public class PatternMatching {

    public static List<Integer> getMatchPosition(int[] inputArray, int[] pattern) {
        int inputSize = inputArray.length;
        int patternSize = pattern.length;

        int currentPos = 0;

        List<Integer> results = new ArrayList<>();

        do {
            boolean allMatched = true;
            for (int i = 0; i < patternSize; ++i) {
                if (pattern[i] != inputArray[currentPos + i]) {
                    allMatched = false;
                    break;
                }
            }

            if (allMatched) {
                results.add(currentPos);
                currentPos += patternSize;
            } else {
                ++currentPos;
            }
        } while (currentPos + patternSize <= inputSize);

        return results;
    }

}
