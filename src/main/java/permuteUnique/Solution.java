package permuteUnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,0, new ArrayList<>(), new boolean[nums.length], res);
        return res;
    }

    private void dfs(int[] nums, int index, ArrayList<Integer> path, boolean[] visited, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            visited[i] = true;
            dfs(nums, index + 1, path, visited, res);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }

}
