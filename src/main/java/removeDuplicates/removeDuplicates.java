package removeDuplicates;

import java.util.HashSet;

public class removeDuplicates {

    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[set.size() - 1] = nums[i];
            }
        }
        return set.size();


    }

}
