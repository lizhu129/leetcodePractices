package countAsterisks;

public class Solution {
    public int countAsterisks(String s) {
        int count = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count % 2 == 0) {
                if (s.charAt(i) == '|') {
                    count++;
                }
                if (s.charAt(i) == '*') {
                    res++;
                }
            } else {
                if (s.charAt(i) == '|') {
                    count++;
                }
            }
        }
        return res;
    }
}
