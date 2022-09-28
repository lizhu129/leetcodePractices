package matrixReshape;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int a = 0, b = 0;
        int[][] res = new int[r][c];
        if (row * col != r * c) {
            return mat;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[a][b] = mat[i][j];
                b++;
                if (b == c) {
                    b = 0;
                    a++;
                }
            }
        }
        return res;
    }
}
