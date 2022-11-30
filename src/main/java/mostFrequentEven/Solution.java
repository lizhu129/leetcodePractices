package mostFrequentEven;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        int res = -1, count = 0;
        for (int n : map.keySet()) {
            if (map.get(n) > count) {
                res = n;
                count = map.get(n);
            }
        }
        return res;


    }
}
