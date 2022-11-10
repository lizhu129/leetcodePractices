package findErrorNums;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] findErrorNums(int[] nums) {
        int [] arr = new int [nums.length+1];
        int res[] = new int [2];
        for(int i: nums)arr[i]++;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2)res[0]=i;
            if(arr[i]==0)res[1]=i;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 6, 5};
        System.out.println(findErrorNums(nums)[0]);
        System.out.println(findErrorNums(nums)[1]);
    }
}
