package majorityElement;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==majority)
                count++;

            else{
                count--;
                if(count==0)
                {
                    majority=nums[i];
                    count=1;
                }
            }
        }
        return majority;
    }
}


//