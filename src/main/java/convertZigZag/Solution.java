package convertZigZag;

import java.util.ArrayList;

public class Solution {
    public static String convert(String s, int numRows) {
        int l = s.length();
        String c = "";
        if (numRows == 1) {
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < l; j += 2 * (numRows - 1)) {
                    c = c + s.charAt(j);
                }
            } else {
                int j = i;
                while (j < l) {
                    c = c + s.charAt(j);
                    j += 2 * (numRows - i - 1);
                    if (j >= l) {
                        break;
                    }
                    c = c + s.charAt(j);
                    j += 2 * i;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String convert = "PAHNAPLSIIGYIR";
        System.out.println(convert(s, numRows));
    }
}
