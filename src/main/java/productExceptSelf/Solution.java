package productExceptSelf;


public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int p = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = p;
            p *= nums[i];
        }

        p = 1;
        for (int i = n -1; i >=0; i--) {
            answer[i] *= p;
            p *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] answer = new int[n];
        int p = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = p;
            p *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }

        p = 1;
        for (int i = n -1; i >=0; i--) {
            answer[i] *= p;
            p *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }


    }
}
