package pivotIndex;

public class Solution {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0, l = nums.length;

        for (int i = 0; i < l; i++)
            totalSum += nums[i];

        for (int i = 0; i < l; i++) {
            if (leftSum*2 == totalSum-nums[i])
                return i;
            leftSum += nums[i];
        }

        return -1;

    }


    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        pivotIndex(nums);



    }
}
