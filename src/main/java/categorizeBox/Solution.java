package categorizeBox;

public class Solution {
    public static String categorizeBox(int length, int width, int height, int mass) {
        if(bulky(length, width, height) && heavy(mass)) {
            return "Both";
        }
        if (!bulky(length, width, height) && !heavy(mass)) {
            return "Neither";
        }
        if (bulky(length, width, height) && !heavy(mass)) {
            return "Bulky";
        }
        if (!bulky(length, width, height) && heavy(mass)) {
            return "Heavy";
        }
        return null;
    }

    private static boolean bulky(int length, int width, int height) {
        long v = (long) length * width * height;
        return length >= 10000 || width >= 10000 || height >= 10000 || v >= 1000000000;
    }

    private static boolean heavy(int mass) {
        return mass >= 100;
    }

    public static void main(String[] args) {
        System.out.println(categorizeBox(2909, 3968, 3272, 727));
    }
}
