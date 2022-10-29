package secondGreaterElement;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;


public class Solution {
    public static int[] secondGreaterElement(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            while (!pq.isEmpty() && nums[pq.peek()] < nums[i]) {
                res[pq.poll()] = nums[i];
            }
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                pq.offer(stack.pop());
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,0,9,6};
        for (int n : secondGreaterElement(nums)) {
            System.out.println(n);
        }
    }
}
