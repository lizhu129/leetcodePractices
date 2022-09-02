package missingNumber;

import java.util.HashSet;

public class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumAll = 0;
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sumAll = sumAll + i;
        }
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        return sumAll - sum;

    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));



    }
}
