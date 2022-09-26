package nextGreaterElement;

import java.util.Arrays;

public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = j + 1;
                    while (k < nums2.length) {
                        if (nums2[k] > nums1[i]) {
                            break;
                        }
                        k++;
                    }
                    if (k == nums2.length) {
                        res[i] = -1;
                    } else {
                        res[i] = nums2[k];
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] res = nextGreaterElement(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
