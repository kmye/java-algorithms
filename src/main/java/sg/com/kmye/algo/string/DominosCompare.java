package sg.com.kmye.algo.string;

import java.util.ArrayList;
import java.util.List;

public class DominosCompare {


    public List<String> getLongestDominos(String input) {

        if (input == null || input.isEmpty() || !input.matches("(\\d\\-\\d)+(\\,\\d\\-\\d)+")) {
            return null;
        }

        String[] dominoPairs = input.split(",");

        if (dominoPairs.length == 0) {
            return null;
        }

        List<String> dominos = new ArrayList<>();

        String[] previousDomino = dominoPairs[0].split("-");

        StringBuilder sb = new StringBuilder();
        sb.append(dominoPairs[0]).append(",");

        for (int i = 1; i < dominoPairs.length; ++i) {
            String[] currentDomino = dominoPairs[i].split("-");

            if (currentDomino[0].equals(previousDomino[1])) {
                sb.append(dominoPairs[i]).append(",");
            } else {
                String result = sb.toString();
                dominos.add(result.substring(0, result.length() - 1));

                sb = new StringBuilder();
                sb.append(dominoPairs[i]).append(",");
            }

            previousDomino = currentDomino;
        }

        String result = sb.toString();
        if (!result.isEmpty()) {
            dominos.add(result.substring(0, result.length() - 1));
        }

        return dominos;
    }

    public String getLongestCommonSubstring(String input1, String input2) {
        int m = input1.length();
        int n = input2.length();

        int[][] LCSuff = new int[m + 1][n + 1];

        // To store length of the longest common substring
        int len = 0;

        // To store the index of the cell which contains the
        // maximum value. This cell's index helps in building
        // up the longest common substring from right to left.
        int row = 0, col = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    LCSuff[i][j] = 0;

                else if (input1.charAt(i - 1) == input2.charAt(j - 1)) {
                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
                    if (len < LCSuff[i][j]) {
                        len = LCSuff[i][j];
                        row = i;
                        col = j;
                    }
                }
                else
                    LCSuff[i][j] = 0;
            }
        }

        if (len == 0) {
            return null;
        }

        // allocate space for the longest common substring
        String resultStr = "";

        // traverse up diagonally form the (row, col) cell
        // until LCSuff[row][col] != 0
        while (LCSuff[row][col] != 0) {
            resultStr = input1.charAt(row - 1) + resultStr;
            --len;

            // move diagonally up to previous cell
            row--;
            col--;
        }

        return resultStr;
    }


}
