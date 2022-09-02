package findDisappearedNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int m : nums) {
            set.add(m);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        return list;

    }

}
