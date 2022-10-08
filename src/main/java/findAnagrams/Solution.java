package findAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] map = new int[26];
        for (int i = 0; i < p.length(); i++) {
            map[p.charAt(i) - 'a']++;
        }
        int left = 0, right = 0;
        while (right < s.length()) {
            if (map[s.charAt(right) - 'a'] > 0) {
                map[s.charAt(right) - 'a']--;
                right++;
                if (right - left == p.length()) {
                    res.add(left);
                }
            } else {
                map[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        findAnagrams(s, p);
    }
}
