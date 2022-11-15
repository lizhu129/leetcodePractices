package countCharacters;

import java.util.Arrays;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] dic = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            dic[chars.charAt(i) - 'a']++;
        }
        for (String s : words) {
            int[] cp = Arrays.copyOf(dic, 26);
            count += helper(cp, s);
        }
        return count;
    }

    private int helper(int[] dic, String s) {
        for (char c : s.toCharArray()) {
            dic[c - 'a']--;
            if (dic[c - 'a'] < 0) {
                return 0;
            }
        }
        return s.length();
    }
}
