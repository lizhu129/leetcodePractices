package twoEditWords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        int n = queries[0].length();
        for (String s : queries) {
            for (String d : dictionary) {
                if (check(s, d)) {
                    res.add(s);
                    break;
                }
            }
        }
        return res;
    }

    private static boolean check(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            int n = a.charAt(i) - b.charAt(i);
            if (n != 0) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] queries = {"word","note","ants","wood"};
        String[] d = {"wood","joke","moat"};
        System.out.println(twoEditWords(queries, d));
        System.out.println(check("word", "aoob"));
    }
}
