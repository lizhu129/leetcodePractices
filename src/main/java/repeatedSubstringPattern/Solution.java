package repeatedSubstringPattern;

import java.util.HashSet;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                if (s.charAt(i - 1) != s.charAt(l - 1)) {
                    continue;
                }
                String sub = s.substring(0, i);
                int m = l / i, p = 1;
                while (p < m && sub.equals(s.substring(i*p,i*p+i))) {
                    p++;
                }
                if (p == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String s1 = s + s;
        System.out.println(s1.indexOf(s, 1));
    }
}
