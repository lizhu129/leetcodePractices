package longestPalindrome;

import java.util.*;

public class Solution {
    static int start;
    static int length;
    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            checkPalidrone(i, i, s);
            checkPalidrone(i, i + 1, s);
        }
        return s.substring(start, start + length);
    }


    private static void checkPalidrone(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (length < right - left - 1) {
            start = left + 1;
            length = right - left - 1;
        }
    }

    public static void main(String[] args) {
        String s = "babad";
        longestPalindrome(s);

    }
}
