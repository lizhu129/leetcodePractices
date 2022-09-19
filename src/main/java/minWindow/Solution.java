package minWindow;

import java.util.HashMap;

public class Solution {
    public static String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        int[] map = new int[128];
        for (int i = 0; i < n; i++) {
            map[t.charAt(i)]++;
        }
        int count = 0, i = 0, j = 0, min = Integer.MAX_VALUE, si = -1;
        while (j < m) {
            if (map[s.charAt(j++)]-- > 0) {
                count++;
            }
            while (count == n) {
                if (j-i < min) {
                    min = j-i;
                    si = i;
                }
                if (++map[s.charAt(i++)] > 0) {
                    count--;
                }
            }
        }
        return si == -1 ? "" : s.substring(si, si+min);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        minWindow(s, t);
    }

}
