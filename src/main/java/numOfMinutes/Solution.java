package numOfMinutes;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, helper(i, manager, informTime));
        }
        return res;
    }

    private int helper(int i, int[] manager, int[] time) {
        if (manager[i] != -1) {
            time[i] += helper(manager[i], manager, time);
            manager[i] = -1;
        }
        return time[i];
    }

}
