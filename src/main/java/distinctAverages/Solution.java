package distinctAverages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int i = 0;
        while (i < nums.length / 2) {
            set.add(((nums[i] * 1.0 + nums[nums.length - i - 1]) / 2));
            i++;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        System.out.println(distinctAverages(nums));
    }
}
