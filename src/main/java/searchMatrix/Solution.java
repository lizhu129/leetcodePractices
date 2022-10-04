package searchMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int index = -1;
        if (r == 1 && c == 1) {
            return matrix[0][0] == target;
        }
        for (int i = 0; i < r; i++) {
            if (matrix[i][c - 1] >= target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = 0; i < c; i++) {
            if (matrix[index][i] == target) {
                return true;
            }
        }
        return false;
    }

}
