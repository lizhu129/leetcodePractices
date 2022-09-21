package longestPalindrome;

public class Solution2 {
    /** Expand around the corner
     * expand from the center until Palindrome no longer satisfies;
     * in total, there are 2n - 1 centers (when s.length is an even number,
     * the center is between the characters)
     * Time Complexity O(n2)
     * Space Complexity O(1)
     */
    int l, len;
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            check(s, i, i);
            check(s, i, i + 1);
        }
        return s.substring(l, l + len);

    }

    private void check(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        if (len < r - l - 1) {
            this.l = l + 1;
            len = r - l - 1;
        }
    }

}
