package deleteGreatestValue;

import java.util.Arrays;

public class Solution {

    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        for (int i = n - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = m - 1; j >= 0; j--) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
        }
        return sum;
    }

}
