package smallestEqual;

public class Solution {
    public int smallestEqual(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int a = i % 10;
            if (a == nums[i]) {
                res = Math.min(i, res);
            }
        }
        if (res < nums.length) {
            return res;
        }
        return -1;
    }
}
