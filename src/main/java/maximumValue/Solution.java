package maximumValue;

public class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for (String s : strs) {
            if (helper(s)) {
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }
        }
        return max;
    }

    private boolean helper(String s) {
        for (char c : s.toCharArray()) {
            if (c >= 97 && c <= 122) {
                return false;
            }
        }
        return true;
    }
}
