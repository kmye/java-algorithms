package sg.com.kmye.algo.dictionary;

import java.util.Arrays;
import java.util.HashSet;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        String[] jewels = J.split("");
        HashSet<String> dictionary = new HashSet<>(Arrays.asList(jewels));

        int count = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (dictionary.contains(String.valueOf(S.charAt(i)))) {
                ++count;
            }
        }

        return count;
    }
}
