package nextGreatestLetter;

public class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) lo = mi + 1;
            else hi = mi;
        }
        return letters[lo % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char c = nextGreatestLetter(letters, target);
        System.out.println(c);
    }
}
