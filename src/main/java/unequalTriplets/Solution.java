package unequalTriplets;



public class Solution {
    public int unequalTriplets(int[] nums) {
        int trips = 0, pairs = 0, count[] = new int[1001];
        for (int i = 0; i < nums.length; ++i) {
            trips += pairs - count[nums[i]] * (i - count[nums[i]]);
            pairs += i - count[nums[i]];
            count[nums[i]] += 1;
        }
        return trips;
    }
}
