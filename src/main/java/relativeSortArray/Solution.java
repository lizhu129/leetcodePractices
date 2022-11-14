package relativeSortArray;

import java.util.*;

public class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] res = new int[arr1.length];
        for (int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : arr2) {
            for (int i = 0; i < map.get(n); i++) {
                l1.add(n);
            }
            map.put(n, 0);
        }
        for (int n : map.keySet()) {
            if (map.get(n) != 0) {
                for (int i = 0; i < map.get(n); i++) {
                    pq.add(n);
                }
            }
        }
        while (!pq.isEmpty()) {
            l1.add(pq.remove());
        }
        for (int i = 0; i < arr1.length; i++) {
            res[i] = l1.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {26, 21, 11, 20, 50, 34, 1, 18};
        int[] arr2 = {21, 11, 26, 20};
        relativeSortArray(arr1, arr2);
    }
}
