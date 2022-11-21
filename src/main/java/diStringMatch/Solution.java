package diStringMatch;

import java.util.Arrays;

public class Solution {
    public static int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int n1 = 0, n2 = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                res[i] = n1;
                n1++;
            } else {
                res[i] = n2;
                n2--;
            }
        }
        res[s.length()] = n1;
        return res;

    }

    public static void main(String[] args) {
        String s = "DDD";
        int[] res = diStringMatch(s);
        System.out.println(Arrays.toString(res));
    }
}
