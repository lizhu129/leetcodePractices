package deleteAndEarn;

import java.util.TreeMap;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int prevSum = 0, currSum = 0, prevNum = -1;
        for (int n : map.keySet()) {
            int max = Math.max(prevSum, currSum);
            if (n - 1 != prevNum) {
                currSum = n * map.get(n) + max;
                prevSum = max;
            } else {
                currSum = n * map.get(n) + prevSum;
                prevSum = max;
            }
            prevNum = n;
        }
        return Math.max(prevSum, currSum);
    }

    public int deleteAEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            max = Math.max(n, max);
        }
        int[] count = new int[max + 1];
        for (int n : nums) {
            count[n] += n;
        }
        int[] dp = new int[max + 3];
        for (int i = max; i >= 0; i--) {
            dp[i] = Math.max(count[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }
}
