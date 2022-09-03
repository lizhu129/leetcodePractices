package singleNumber;

import java.util.HashSet;

public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int sum = 0;
        int summ = 0;
        for (int n : set) {
            sum = sum + n;
        }
        for (int n : nums) {
            summ = summ + n;
        }
        return 2 * sum - summ;
    }

    public int singleNumber1(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        System.out.println(result);

    }
}
