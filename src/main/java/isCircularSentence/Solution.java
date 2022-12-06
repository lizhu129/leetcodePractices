package isCircularSentence;

public class Solution {
    public static boolean isCircularSentence(String sentence) {
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        int len = words.length;
        String w1 = words[0], wl = words[len - 1];
        if (w1.charAt(0) != wl.charAt(wl.length() - 1)) {
            return false;
        } else {
            for (int i = 0; i < words.length - 1; i++) {
                String a = words[i], b = words[i + 1];
                if (a.charAt(a.length() - 1) != b.charAt(0)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        isCircularSentence(sentence);
    }
}
