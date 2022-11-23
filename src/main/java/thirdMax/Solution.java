package thirdMax;

import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int m1 = nums[nums.length - 1];
        int m2 = m1;
        int m3 = m1;
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != m1) {
                m2 = nums[i];
                index = i;
                break;
            }
        }
        for (int i = index; i >= 0; i--) {
            if (nums[i] != m2) {
                m3 = nums[i];
                break;
            }
        }
        return m3;
    }
}
