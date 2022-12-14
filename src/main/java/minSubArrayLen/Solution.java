package minSubArrayLen;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i + 1 - left);
                sum -= nums[left];
                left++;
            }
        }
        return (min != Integer.MAX_VALUE) ? min : 0;
    }
}
