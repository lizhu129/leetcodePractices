package findWords;

import java.util.*;

import static java.util.Arrays.*;

public class Solution {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        List<Character> r1 = List.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        List<Character> r2 = List.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        List<Character> r3 = List.of('z', 'x', 'c', 'v', 'b', 'n', 'm');
        for (String s : words) {
            if (check(r1, s) || check(r2, s) || check(r3, s)) {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    private static boolean check(List<Character> list, String s) {
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        findWords(words);
    }
}
