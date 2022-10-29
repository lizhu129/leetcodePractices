package oddString;

public class Solution {
    public static String oddString(String[] words) {
        int[] d1 = getDiff(words[0]);
        int[] d2 = getDiff(words[1]);
        int[] d3 = getDiff(words[2]);
        if (compare(d1, d2)) {
            for (int i = 2; i < words.length; i++) {
                int[] di = getDiff(words[i]);
                if (!compare(d1, di)) {
                    return words[i];
                }
            }
        } else if (compare(d1, d3)) {
            return words[1];
        } else if (compare(d2, d3)) {
            return words[0];
        }
        return null;
    }

    private static int[] getDiff(String s) {
        int[] diff = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) {
            diff[i] = s.charAt(i + 1) - s.charAt(i);
        }
        return diff;
    }

    private static boolean compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"aaa","bob","ccc","ddd"};
        System.out.println(oddString(words));
    }
}
