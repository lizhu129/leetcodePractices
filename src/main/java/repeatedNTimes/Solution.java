package repeatedNTimes;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return num;
            else set.add(num);
        }
        return -1;

    }
}
