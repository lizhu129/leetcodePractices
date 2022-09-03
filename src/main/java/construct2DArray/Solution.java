package construct2DArray;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if (m * n != original.length) {
            return new int[0][0];
        }
        int a = 0;
        while (a <= (m - 1) * n) {
            for (int i = a; i < a + n; i++) {
                result[a / n][i - a] = original[i];
            }
            a = a + n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1,2};
        int m = 1;
        int n = 1;
        int[][] result = construct2DArray(original, m, n);
    }
}
