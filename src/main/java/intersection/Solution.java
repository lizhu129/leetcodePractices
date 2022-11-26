package intersection;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        int[] dic = new int[1001];
        for (int[] num : nums) {
            for (int n : num) {
                dic[n]++;
            }
        }
        for (int i = 1; i < 1001; i++) {
            if (dic[i] == nums.length) {
                res.add(i);
            }
        }
        return res;
    }
}
