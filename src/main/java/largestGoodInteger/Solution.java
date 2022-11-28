package largestGoodInteger;

public class Solution {
    public static String largestGoodInteger(String num) {
        String res = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            int n1 = num.charAt(i) - '0';
            int n2 = num.charAt(i + 1) - '0';
            int n3 = num.charAt(i + 2) - '0';
            if (n1 == n2 && n2 == n3) {
                String s = num.substring(i, i + 3);
                if (res.equals("")) {
                    res = s;
                } else {
                    if (Integer.parseInt(s) > Integer.parseInt(res)) {
                        res = s;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String num = "6777133339";
        largestGoodInteger(num);
    }
}
