package smallestRangeI;

import java.util.Arrays;

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int a = nums[len - 1] - k, b = nums[0] + k;
        return Math.max(0, a - b);
    }
}
