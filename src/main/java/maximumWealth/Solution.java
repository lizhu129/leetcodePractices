package maximumWealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] c : accounts) {
            int w = 0;
            for (int n : c) {
                w += n;
            }
            max = Math.max(max, w);
        }
        return max;
    }
}
