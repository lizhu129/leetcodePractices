package searchRange;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                int left = mid - 1;
                int right = mid + 1;
                while (left >= 0 && nums[left] == target) {
                    left--;
                }
                while (right < nums.length && nums[right] == target) {
                    right++;
                }
                res[0] = ++left;
                res[1] = --right;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        int target = 2;
        int a = 5;
        nums[0] = ++a;
        System.out.println(nums[0]);
        System.out.println(a);
    }
}
