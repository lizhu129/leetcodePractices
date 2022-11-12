package countGoodStrings;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int countGoodStrings(int low, int high, int zero, int one) {
        Set<String> set = new HashSet<>();
        StringBuilder cur = new StringBuilder();
        int i = 0, j = 0;
        while ((i * zero + j * one) < low) {
            if (cur.length() + zero <= high) {
                cur.append(0);
                i++;
                if (cur.length() >= low) {
                    set.add(cur.toString());
                }
            }
            if (cur.length() + one <= high) {
                cur.append(1);
                j++;
                if (cur.length() >= low) {
                    set.add(cur.toString());
                }
            }
        }
        return set.size();

    }


    public static void main(String[] args) {
        int low = 3, high = 3, zero = 1, one = 1;
        System.out.println(countGoodStrings(low, high, zero, one));
    }


}
