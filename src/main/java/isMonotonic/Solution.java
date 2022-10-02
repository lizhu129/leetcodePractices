package isMonotonic;

public class Solution {
    public static boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;
        if (nums.length <= 2) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increase = false;
            }
            if (nums[i] < nums[i + 1]) {
                decrease = false;
            }
        }
        return decrease || increase;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(isMonotonic(a));
    }
}
