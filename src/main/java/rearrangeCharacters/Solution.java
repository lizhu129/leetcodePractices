package rearrangeCharacters;

public class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] tar = new int[26];
        int[] str = new int[26];
        for (char c : target.toCharArray()) {
            tar[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            str[c - 'a']++;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (tar[i] != 0) {
                res = Math.min(res, str[i] / tar[i]);
            }
        }
        return res;
    }
}
