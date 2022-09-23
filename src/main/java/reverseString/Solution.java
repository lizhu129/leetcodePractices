package reverseString;

public class Solution {
    public void reverseString(char[] s) {
        int i = 0, l = s.length;
        while (i < l / 2) {
            char c = s[i];
            s[i] = s[l - i - 1];
            s[l - i - 1] = c;
            i++;
        }
    }
}
