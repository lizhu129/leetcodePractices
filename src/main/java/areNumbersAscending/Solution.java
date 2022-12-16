package areNumbersAscending;

public class Solution {
    public static boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int a = Integer.MIN_VALUE;
        for (String word : words) {
            if (word.charAt(0) - '0' > 0 && word.charAt(0) - '0' <= 9) {
                int n = Integer.parseInt(word);
                if (n <= a) {
                    return false;
                } else {
                    a = n;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        areNumbersAscending(s);
    }
}
