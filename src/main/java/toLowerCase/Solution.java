package toLowerCase;

public class Solution {
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((int) c >= 65 && (int) c <= 90) {
                c = (char) ((int) c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "here";
        System.out.println(toLowerCase(s));
    }
}
