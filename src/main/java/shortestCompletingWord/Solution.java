package shortestCompletingWord;


public class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        String res = null;
        int min = Integer.MAX_VALUE;
        for (String s : words) {
            if (check(s, licensePlate) && s.length() < min) {
                res = s;
                min = s.length();
            }
        }
        return res;
    }

    private static boolean check(String s, String licensePlate) {
        int[] map = new int[26];
        for (int i = 0; i < licensePlate.length(); i++) {
            int n = licensePlate.charAt(i) - 'a';
            if (n >= 0 && n <= 25) {
                map[n]++;
            }
        }
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']--;
        }
        for (int n : map) {
            if (n > 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "Ah71752";
        s = s.toLowerCase();
        System.out.println(s);
        String[] words = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
        System.out.println(shortestCompletingWord(s, words));
    }
}
