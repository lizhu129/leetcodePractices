package merge;

import java.util.PriorityQueue;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> q = new PriorityQueue<>(m + n);
        for (int i = 0; i < m -1; i++) {
            q.add(nums1[i]);
        }
        for (int i = 0; i < n -1; i++) {
            q.add(nums2[i]);
        }
        int count = 0;
        while (!q.isEmpty()) {
            nums1[count] = q.remove();
            count++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

}
