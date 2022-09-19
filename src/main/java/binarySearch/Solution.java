package binarySearch;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        return binarySearch(nums, target, 0, nums.length);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, left, mid - 1);
        } else {
            return binarySearch(nums, target, mid + 1, right);
        }
    }
}
