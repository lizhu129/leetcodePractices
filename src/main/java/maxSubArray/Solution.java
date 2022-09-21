package maxSubArray;

public class Solution {
    /** Sub-problem f(i): find the largest sum of a substring when the right boundary is i
     *  f(i) = max(nums[i], f(i - 1) + nums[i])
     *  f(0) = nums[0] */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int currMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);
        }
        return max;
    }
}
