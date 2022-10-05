package addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length(), l2 = b.length();
        char[] ans = new char[Math.max(l1, l2) + 1];
        int i = l1 - 1, j = l2 - 1, index = ans.length - 1;
        boolean carry = false;
        while (i >= 0 || j >= 0) {
            char charA = i < 0 ? '0' : a.charAt(i);
            char charB = j < 0 ? '0' : b.charAt(j);
            if (charA == '1' && charB == '1') {
                ans[index] = carry ? '1' : '0';
                carry = true;
            } else if (charA == '0' && charB == '0') {
                ans[index] = carry ? '1' : '0';
                carry = false;
            } else {
                ans[index] = carry ? '0' : '1';
            }
            if (i >= 0) {
                --i;
            }
            if (j >= 0) {
                --j;
            }
            --index;
        }
        if (carry) {
            ans[index--] = '1';
        }
        return new String(ans, index + 1, ans.length - (index + 1));
    }
}
