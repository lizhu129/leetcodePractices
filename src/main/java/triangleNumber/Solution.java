package triangleNumber;

import java.util.Arrays;

public class Solution {
    public int triangleNumber(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                while (k < nums.length && nums[i] + nums[j] > nums[k]) {
                    k++;
                    count += k - j - 1;
                }
            }
        }
        return count;
    }
}
