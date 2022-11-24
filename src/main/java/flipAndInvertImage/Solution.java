package flipAndInvertImage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            res[i] = flip(image[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return res;

    }

    private int[] flip(int[] row) {
        int[] res = new int[row.length];
        for (int i = 0; i < row.length; i++) {
            res[i] = row[row.length - 1 - i];
        }
        return res;
    }

}
