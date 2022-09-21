package isPerfectSquare;

public class Solution {
    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((long) mid * mid == (long) num) {
                return true;
            } else if ((long) mid * mid < (long) num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
        System.out.println(Math.sqrt(808201));
    }
}
