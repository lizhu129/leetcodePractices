package sortArrayByParity;


import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Deque<Integer> res = new ArrayDeque<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                res.addFirst(n);
            } else {
                res.addLast(n);
            }
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.removeFirst();
        }
        return ans;
    }
}
