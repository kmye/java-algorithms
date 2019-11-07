package sg.com.kmye.algo.array;

public class IslandPerimeter {

    int cols, rows;

    public int islandPerimeter(int[][] grid) {

        rows = grid.length;
        cols = grid[0].length;

        int[] rowIdx = new int[]{-1, 0, 0, 1};
        int[] colIdx = new int[]{0, -1, 1, 0};

        int totalPerimeter = 0;
        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                if(grid[row][col] == 1) {
                    // visit neighbour node if not visited and is 1
                    for (int i = 0; i < 4; ++i) {
                        // check left, right, up, down whether there is neighour i can visit and the perimeter
                        // if is empty + 1 to perimeter
                        int nextR = row + rowIdx[i];
                        int nextC = col + colIdx[i];
                        if (!haveNeighour(grid, nextR, nextC)) {
                            totalPerimeter += 1;
                        }
                    }
                }
            }
        }

        return totalPerimeter;
    }


    private boolean haveNeighour(int[][] grid, int nextR, int nextC) {
        return (nextR >= 0) && (nextR < rows) && (nextC >= 0) && (nextC < cols) && grid[nextR][nextC] == 1;
    }
}
