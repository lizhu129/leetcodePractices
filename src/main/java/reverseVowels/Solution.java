package reverseVowels;

public class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();

        while (i < j) {
            while (i < s.length() && !isVowel(chars[i])) {
                i++;
            }
            while (j >= 0 && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }

    void swap(char[] chars, int x, int y) {
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
}
