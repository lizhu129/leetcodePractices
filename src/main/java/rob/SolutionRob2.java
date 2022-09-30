package rob;

public class SolutionRob2 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robb(nums, 0, nums.length - 1), robb(nums, 1, nums.length));
    }

    public int robb(int[] nums, int start, int end) {
        int sum1 = 0, sum2 = 0;
        for (int i = start; i < end; i++) {
            int curr = Math.max(nums[i] + sum1, sum2);
            sum1 = sum2;
            sum2 = curr;
        }
        return sum2;
    }
}
