package sortColors;

public class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0;
        for (int n : nums) {
            if (n == 0) {
                a++;
            } else if (n == 1) {
                b++;
            }
        }
        for (int i = 0; i < a; i++) {
            nums[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            nums[i] = 1;
        }
        for (int i = a + b; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
