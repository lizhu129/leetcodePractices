package countGoodStrings;



public class Solution {

    public static int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        int mod = (int) 1e9 + 7;
        dp[one]++;
        dp[zero]++;
        int count = 0;
        for (int i = 1; i <= high; i++) {
            if (i - zero > 0) {
                dp[i] += dp[i - zero] % mod;
                dp[i] %= mod;
            }
            if (i - one > 0) {
                dp[i] += dp[i - one] % mod;
                dp[i] %= mod;
            }
            if (i >= low && i <= high) {
                count = (count + dp[i]) % mod;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int low = 3, high = 3, zero = 1, one = 1;
        System.out.println(countGoodStrings(low, high, zero, one));
    }


}
