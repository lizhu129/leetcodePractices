package findMin;

public class Solution {
    public int findMin(int[] nums) {
        int a = nums[0];
        if (nums.length == 1) {
            return a;
        }
        int i = 0, j = nums.length - 1;
        if (nums[j] > nums[0]) {
            return nums[0];
        }

        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return Integer.M]
    }

}
