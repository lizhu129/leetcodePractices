package sortArrayByParityII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                evens.add(n);
            } else {
                odds.add(n);
            }
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                res[i] = evens.get(i / 2);
            } else {
                res[i] = odds.get(i / 2);
            }
        }
        return res;
    }
}
