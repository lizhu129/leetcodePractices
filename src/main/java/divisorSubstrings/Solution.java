package divisorSubstrings;

public class Solution {
    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i <= s.length() - k; i++) {
            int n = Integer.parseInt(s.substring(i, i + k));
            if (n!= 0 && num % n == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 430043, k = 2;
        System.out.println(divisorSubstrings(num, k));
    }
}
