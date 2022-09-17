package permutations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,0, new ArrayList<>(), new boolean[nums.length], res);
        return res;
    }

    private static void dfs(int[] nums, int index, ArrayList<Integer> path, boolean[] visited, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            dfs(nums, index + 1, path, visited, res);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums).toString());
    }
}
