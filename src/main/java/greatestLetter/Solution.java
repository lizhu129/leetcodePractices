package greatestLetter;

public class Solution {
    public static String greatestLetter(String s) {
        int[] upper = new int[26];
        int[] lower = new int[26];

        for (char c : s.toCharArray()) {
            if (c >= 97 && c <= 122) {
                lower[c - 'a']++;
            } else {
                upper[c - 'A']++;
            }
        }

        for (int i = 25; i >= 0; i--) {
            if (upper[i] > 0 && lower[i] > 0) {
                return String.valueOf((char) (i + 65));
            }
        }
        return "";
    }


}
