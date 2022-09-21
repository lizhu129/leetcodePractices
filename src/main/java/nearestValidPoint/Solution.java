package nearestValidPoint;

public class Solution {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int dis = Math.min(min, Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y));
                if (dis < min) {
                    min = dis;
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] points = {{2,3}};
        int x = 3;
        int y = 4;
        int a = nearestValidPoint(x, y, points);
        System.out.println(a);
    }
}
