package maxArea;

public class maxArea {
    public static int maxArea(int[] height) {

        int max = 0;
        int h = 0;
        int a = 0;
        int b = height.length - 1;
        while (a < b) {
            h = Math.min(height[a], height[b]);
            max = Math.max(max, (b - a) * h);
            if (height[a] < height[b]) {
                a++;
            } else {
                b--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }




}
