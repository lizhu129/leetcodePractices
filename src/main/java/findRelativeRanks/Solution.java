package findRelativeRanks;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            q.add(new Pair(score[i], i));
        }
        String[] res = new String[score.length];
        int count = 0;
        while (!q.isEmpty()) {
            Pair p = q.remove();
            if (count == 0) {
                res[p.index] = "Gold Medal";
            } else if (count == 1) {
                res[p.index] = "Silver Medal";
            } else if (count == 2) {
                res[p.index] = "Bronze Medal";
            } else {
                res[p.index] = String.valueOf(count + 1);
            }
            count++;
        }
        return res;
    }

    private static class Pair implements Comparable {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Object o) {
            return ((Pair) o).val - this.val;
        }
    }

    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
    }
}
