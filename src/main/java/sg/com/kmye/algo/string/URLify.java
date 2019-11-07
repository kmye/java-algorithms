package sg.com.kmye.algo.string;

public class URLify {

    public static String convert(String input) {
        char[] chars = input.toCharArray();

        int n = chars.length;

        for (int i = 0; i < n-2; ++i) {
            if (chars[i] == ' ') {



                for (int j = n - 1; j > i + 2; --j) {
                    chars[j] = chars[j - 2];
                }

                chars[i] = '%';
                chars[i + 1] = '2';
                chars[i + 2] = '0';

            }
        }

        return String.valueOf(chars);
    }
}
