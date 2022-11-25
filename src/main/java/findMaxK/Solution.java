package findMaxK;

import java.util.Arrays;

public class Solution {
    public static int findMaxK(int[] nums) {
        int[] positive = new int[1001];
        int[] negative = new int[1001];

        for (int n : nums) {
            if (n > 0) {
                positive[n]++;
            } else {
                negative[-n]++;
            }
        }
        for (int i = 1000; i > 0; i--) {
            if (positive[i] != 0 && negative[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-10,8,6,7,-2,-3};
        System.out.println(findMaxK(nums));
    }
}

