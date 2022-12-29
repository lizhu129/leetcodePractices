package similarPairs;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int similarPairs(String[] words) {
        int count = 0;
        Set[] sets = new Set[words.length];
        for (int i = 0; i < words.length; i++) {
            Set<Character> set = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                set.add(c);
            }
            sets[i] = set;
        }
        for (int i = 0; i < sets.length; i++) {
            for (int j = i + 1; j < sets.length; j++) {
                if (helper(sets[i], sets[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean helper(Set<Character> s1, Set<Character> s2) {
        for (char c : s1) {
            if (!s2.contains(c)) {
                return false;
            }
        }
        for (char c : s2) {
            if (!s1.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }
}
