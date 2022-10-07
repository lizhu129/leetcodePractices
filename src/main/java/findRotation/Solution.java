package findRotation;

import java.util.Arrays;

public class Solution {
    public static boolean findRotation(int[][] mat, int[][] target) {
        if (check(mat, target)) {
            return true;
        } else {
            int i = 2;
            int[][] r = rotate90(mat);
            while (i >= 0) {
                if (check(r, target)) {
                    return true;
                }
                r = rotate90(r);
                i--;
            }
            return false;
        }

    }
    private static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == target[i][j]) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    private static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - i - 1] = mat[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(check(mat, target));
        System.out.println(Arrays.deepToString(rotate90(mat)));
        System.out.println(findRotation(mat, target));

    }
}
