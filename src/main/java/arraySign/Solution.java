package arraySign;

public class Solution {
    public int arraySign(int[] nums) {
        int p = 1;
        for (int n : nums) {
            if (n == 0) {
                return 0;
            }
            if (n < 0) {
                p = -p;
            }
        }
        return p;
    }
}
