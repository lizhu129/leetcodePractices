package twoOutOfThree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();
        int[] m1 = new int[101];
        int[] m2 = new int[101];
        int[] m3 = new int[101];

        for (int n : nums1) {
            m1[n]++;
        }
        for (int n : nums2) {
            m2[n]++;
        }
        for (int n : nums3) {
            m3[n]++;
        }

        for (int i = 0; i <= 100; i++) {
            if (helper(m1[i], m2[i], m3[i])) {
                res.add(i);
            }
        }
        return res;
    }

    private static boolean helper(int n1, int n2, int n3) {
        return (n1 >= 1 && n2 >= 1) || (n2 >= 1 && n3 >= 1) || (n1 >= 1 && n3 >= 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2};
        int[] nums2 = {4, 3, 3};
        int[] nums3 = {5};
        twoOutOfThree(nums1, nums2, nums3);
    }
}
