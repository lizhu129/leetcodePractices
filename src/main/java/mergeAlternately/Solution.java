package mergeAlternately;

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int l1 = word1.length(), l2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while (i < l1 && j < l2) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if (l1 < l2) {
            sb.append(word2, l1 , l2);
        }
        if (l1 > l2) {
            sb.append(word1, l2, l1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
}
