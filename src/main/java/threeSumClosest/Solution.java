package threeSumClosest;

import java.util.Arrays;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] + nums[nums.length - 1] + nums[nums.length - 2];
            if (sum < target) {
                // largest sum is smaller than target
                result = sum;
                continue;
            }
            sum = nums[i] + nums[i + 1] + nums[i + 2];
            if (sum > target) {
                // smallest sum is larger than target
                if (sum - target < minDiff) {
                    result = sum;
                    minDiff = sum - target;
                }
                break;
            }

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    result = sum;
                    minDiff = diff;
                }
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;
        System.out.println(threeSumClosest(nums, target));
    }
}
