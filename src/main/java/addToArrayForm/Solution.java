package addToArrayForm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l = helper(k);
        List<Integer> res = new ArrayList<>();
        int len1 = num.length, len2 = l.size();
        int i = len1 - 1, j = 0;
        boolean carry = false;
        while (i >= 0 || j < len2) {
            int a = i < 0 ? 0 : num[i];
            int b = j >= len2? 0 : l.get(j);
            if (a + b > 9) {
                int c = carry ? ((a + b) % 10 + 1) : (a + b) % 10;
                res.add(0, c);
                carry = true;
            } else if (a + b == 9 && carry) {
                res.add(0, 0);
                carry = true;
            } else {
                int c = carry ? a + b + 1 : a + b;
                res.add(0, c);
                carry = false;
            }
            if (i >= 0) {
                i--;
            }
            if (j < len2) {
                j++;
            }
        }
        if (carry) {
            res.add(0, 1);
        }
        return res;
    }

    private static List<Integer> helper(int k) {
        List<Integer> res = new ArrayList<>();
        while (k > 0) {
            int a = k % 10;
            res.add(a);
            k = k / 10;
        }
        return res;
    }

    public List<Integer> add(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int len = num.length - 1;
        while(len >= 0 || k > 0) {
            if(len >= 0) {
                k += num[len--];
            }
            ans.addFirst(k%10);
            k /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 12345;
        List<Integer> l = helper(n);
        System.out.println(l.toString());
        int a = 5;
        int b = 5;
        boolean carry = true;
        int c = carry ? ((a + b) % 10 + 1) : (a + b) % 10;
        System.out.println(c);
        int[] num = {2, 1, 5};
        int k = 806;
        System.out.println(addToArrayForm(num, k).toString());
    }


}
