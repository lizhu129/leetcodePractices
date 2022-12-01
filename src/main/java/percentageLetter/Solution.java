package percentageLetter;

public class Solution {
    public static int percentageLetter(String s, char letter) {
        int len = s.length();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count / len * 100;
    }

    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        int len = s.length();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        System.out.println(len);
        System.out.println(count);
        int n = count * 100 / len;
        System.out.println(n);
    }
 }
