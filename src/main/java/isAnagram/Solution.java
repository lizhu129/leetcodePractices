package isAnagram;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] set = new int[26];
        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            set[t.charAt(i) - 'a']--;
        }
        for (int n : set) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
