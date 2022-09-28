package findTheDifference;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static char findTheDifference(String s, String t) {
        int l1 = s.length(), l2 = t.length();
        if (l1 < l2) {
            return find(t, s);
        }
        return find(s, t);
    }

    private static char find(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                return (char) (i + 'a');
            }
        }
        return '~';
    }

    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(findTheDifference(s, t));
    }
}
