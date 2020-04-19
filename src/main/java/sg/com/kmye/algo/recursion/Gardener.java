package sg.com.kmye.algo.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Gardener {

    private List<int[]> costs = new ArrayList<>();
    private int totalHouses;

    public Gardener(int totalHouses) {
        this.totalHouses = totalHouses;
    }

    private int minCost(int lastChoice, int currentLevel) {
        Integer minimumCost = null;

        int[] currentCost = costs.get(currentLevel);

        for (int i = 0; i < currentCost.length; ++i) {
            if (i == lastChoice) {
                continue;
            }

            int tmp = currentCost[i];

            if (currentLevel + 1 < totalHouses) {
                tmp += minCost(i, currentLevel + 1);
            }

            minimumCost = (minimumCost == null) ? tmp : Math.min(tmp, minimumCost);
        }

        return minimumCost;
    }

    public void addToCosts(String input) {
        costs.add(Stream.of(input.split(" "))
                .mapToInt(token -> Integer.parseInt(token))
                .toArray());
    }

    public int solve() {
        return minCost(-1, 0);
    }
}
