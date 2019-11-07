package sg.com.kmye.algo.string;

public class ReverseWords {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");
        for(String word : words) {
            for(int i = word.length()-1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
