package reverseInteger;

public class Solution {
    public int reverse(int x) {
        int temp = x;
        long rev = 0;
        if (temp < 0) {
            temp = - x;
        }
        while (temp > 0) {
            int n = temp % 10;
            rev = rev * 10 + n;
            temp /= 10;
        }
        if (rev <= 2147483646 && rev >= 0) {
            if (x >= 0) {
                return (int) rev;
            }
            return (int) - rev;
         }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println((int) Math.pow(2, 31) - 1);
    }
}
