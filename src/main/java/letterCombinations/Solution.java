package letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        backtrack(digits, "", 0, res);
        return res;
    }

    private static void backtrack(String digits, String curr, int index, List<String> res) {
        if (index == digits.length()) {
            res.add(curr);
            return;
        }

        String letters = KEYS[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(digits, curr + letters.charAt(i), index + 1, res);
        }
    }

    public static void main(String[] args) {
        String s = "23";
        letterCombinations(s);


    }

}
