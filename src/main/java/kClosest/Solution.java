package kClosest;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int[] a : points) {
            pq.offer(new Pair(a));
        }
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = pq.remove().point;
        }
        return res;
    }

    public class Pair implements Comparable{
        int[] point;
        int val;
        public Pair(int[] point) {
            this.point = point;
            this.val = this.point[0] * this.point[0] + this.point[1] * this.point[1];
        }

        @Override
        public int compareTo(Object o) {
            Pair p = (Pair) o;
            return this.val - p.val;
        }
    }

    public static void main (String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        Arrays.sort(points, (a, b) -> (a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1]));
        System.out.println(points[0][1]);
    }


}
