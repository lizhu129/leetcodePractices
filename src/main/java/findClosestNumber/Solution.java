package findClosestNumber;

public class Solution {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int n : nums) {
            int diff = Math.abs(n);
            if (diff < min) {
                min = diff;
                res = n;
            }
            if (diff == min && n > res) {
                res = n;
            }
        }
        return res;
    }
}
