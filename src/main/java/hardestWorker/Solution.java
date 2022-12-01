package hardestWorker;

public class Solution {
    public static int hardestWorker(int n, int[][] logs) {
        int len = logs.length;
        int max = logs[0][1], res = logs[0][0];
        for (int i = 1; i < len; i++) {
            int t = logs[i][1] - logs[i - 1][1];
            if (t == max) {
                res = res < logs[i][0] ? res : logs[i][0];
            } else if (t >= max) {
                max = t;
                res = logs[i][0];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] logs = {{36,3},{1,5},{12,8},{25,9},{53,11},{29,12},{52,14}};
        int n = 70;
        System.out.println(hardestWorker(n, logs));
    }
}
