package lengthOfLongestSubstring;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) {
            return len;
        }
        /** Set two pointers */
        int left = 0;
        int right = 0;
        /** Sliding window template:
         * 1. Keep moving the right pointer to right until a repeating character appears, save the result,
         * then move the left point to right by 1
         */
        int max = 0;
        /** HashSet to store all the unique characters */
        HashSet<Character> set = new HashSet<>();
        while (right < len) {
            while (right < len && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            max = Math.max(max, set.size());
            set.remove(s.charAt(left));
            left++;
        }
        return max;
    }
}
