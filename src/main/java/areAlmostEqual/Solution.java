package areAlmostEqual;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static boolean areAlmostEqual(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if (l1 != l2) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        for (int i = 0; i < l1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                a.add(s1.charAt(i));
                b.add(s2.charAt(i));
            }
        }
        if (a.size() == 2 && (a.get(0) == b.get(1) && a.get(1) == b.get(0))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "bb";
        System.out.println(areAlmostEqual(s1, s2));

    }
}
