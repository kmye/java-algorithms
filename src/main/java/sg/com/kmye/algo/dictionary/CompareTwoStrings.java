package sg.com.kmye.algo.dictionary;

public class CompareTwoStrings {

    static String twoStrings(String s1, String s2) {
        String result = "NO";

        for(int i = 0; i < s1.length()-1; i++) {
            String s = s1.substring(i, i+1);
            if(!s2.contains(s)) {
                result = "YES";
            }
        }


        return result;
    }
}
