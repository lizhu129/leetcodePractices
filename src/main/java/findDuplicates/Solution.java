package findDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for(int i : nums){
            freq[i]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(nums);
    }
}
