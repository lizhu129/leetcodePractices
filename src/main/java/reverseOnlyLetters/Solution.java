package reverseOnlyLetters;

public class Solution {

    public static String reverseOnlyLetters(String s) {
        if (s.length() == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (check(c1)) {
                if (check(c2)) {
                    sb.setCharAt(i, c2);
                    sb.setCharAt(j, c1);
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    private static boolean check(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));

    }
}
