package destroyTargets;

import java.util.Arrays;

public class Solution {
    public static int destroyTargets(int[] nums, int space) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int res = nums[0];
        for (int i = 0; i < len; i++) {
            int check = check(i, nums, space);
            if (check > max) {
                max = check;
                res = nums[i];
            }
        }
        return res;
    }

    public static int check(int index, int[] nums, int space) {
        int len = nums.length;
        int a = nums[index];
        int c = 0;
        int count = 0;
        while (a < nums[len - 1]) {
            a = nums[index] + c * space;
            for (int n : nums) {
                if (a == n) {
                    count++;
                }
            }
            c++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {304415643,213512562,667776528,854523075,291102158};
        int s = 4;
        System.out.println(destroyTargets(nums, s));
    }
}
