package checkInclusion;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            Map<Character, Integer> map2 = new HashMap<>();
            for (int j = 0; j < s1.length(); j++) {
                map2.put(s2.charAt(i + j), map2.getOrDefault(s2.charAt(i + j), 0) + 1);
            }
            if (matches(map, map2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(Map<Character, Integer> m1, Map<Character, Integer> m2) {
        for (char c : m1.keySet()) {
            if (m1.get(c) - m2.getOrDefault(c, -1) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));

    }
}
