package equalFrequency;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static boolean equalFrequency(String word) {
        if (word.length() == 2) {
            return true;
        }
        int[] hash = new int[26];
        for (int i = 0; i < word.length(); i++) {
            hash[word.charAt(i)- 'a']++;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                count++;
                min = Math.min(min, hash[i]);
                max = Math.max(max, hash[i]);
            }
        }
        if (count == 1) {
            return true;
        } else if (min == 1 && max == 1) {
            return true;
        } else if (max - min == 1 && count * min + 1 == word.length()) {
            return true;
        } else return min == 1 && count * max - 1 == word.length();
    }

    public static void main(String[] args) {
        String s = "aaaabbb";
        String s2 = "aazzccdddd";
        System.out.println(equalFrequency(s));
        System.out.println(equalFrequency(s2));

    }
}
