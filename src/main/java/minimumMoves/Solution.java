package minimumMoves;

public class Solution {
    public static int minimumMoves(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "XXOX";
        minimumMoves(s);
    }
}
