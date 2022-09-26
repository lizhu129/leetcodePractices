package maxAreaOfIsland;

public class Solution {
    private int maxArea, area;

    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    area = 0;
                    dfs(grid, i, j);
                }
            }
        }
        return maxArea;
    }

    private void dfs(int[][]grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length
        || grid[r][c] == 0) {
            return;
        }
        grid[r][c] = 0;
        maxArea = Math.max(maxArea, ++area);
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
