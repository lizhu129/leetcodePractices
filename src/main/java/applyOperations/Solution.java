package applyOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int[] res = new int[nums.length];
        Arrays.fill(res, 0);
        int i = 0;
        for (int n : nums) {
            if (n != 0) {
                res[i] = n;
                i++;
            }
        }
        return res;
    }
}
