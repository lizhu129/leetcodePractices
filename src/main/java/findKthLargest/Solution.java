package findKthLargest;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i : nums) {
            q.offer(i);
        }
        while (nums.length - k > 0) {
            q.poll();
            k++;
        }
        return q.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i : nums) {
            q.offer(i);
        }
        while (nums.length - k > 0) {
            q.poll();
            k++;
        }
        System.out.println(q.poll());
    }
}
