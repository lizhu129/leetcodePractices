package dailyTemperatures;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int max = 0;
        int[] res = new int[len];
        Arrays.fill(res, 0);
        for (int i = len - 1; i >= 0; i--) {
            int today = temperatures[i];
            if (today >= max) {
                max = today;
                continue;
            }
            int days = 1;
            while (temperatures[i + days] <= today) {
                days += res[i + days];
            }
            res[i] = days;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int len = temperatures.length;
    }
}
