package threeSum;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int l = nums.length;
        for (int i = 0; i < l - 2; i++) {
            int sum = nums[i] + nums[l - 2] + nums[l - 1];
            if (sum < 0) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            // if smallest possible value is greater than 0, break
            sum = nums[i] + nums[i + 1] + nums[i + 2];
            if (sum > 0) {
                break;
            }
            int j = i + 1;
            int k = l - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

