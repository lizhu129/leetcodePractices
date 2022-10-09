package findCircleNum;

public class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] nums, boolean[] visited, int i) {
        for (int j = 0; j < nums.length; j++) {
            if (j != i && !visited[j] && nums[i][j] == 1) {
                visited[j] = true;
                dfs(nums, visited, j);
            }
        }
    }
}
