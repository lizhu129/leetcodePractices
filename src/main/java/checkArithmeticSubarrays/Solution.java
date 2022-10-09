package checkArithmeticSubarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        int i = 0;
        while (i < l.length) {
            int left = l[i], right = r[i];
            int[] temp = Arrays.copyOfRange(nums, left, right + 1);
            res.add(check(temp));
            i++;
        }
        return res;
    }

    private boolean check(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != diff) {
                return false;
            }
        }
        return true;
    }
}
