package interpret;

public class Solution {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append('G');
                i++;
            }
            if (c == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i += 2;
            } else if (c == '(' && command.charAt(i + 1) == 'a') {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String c = "(al)G(al)()()G";
        System.out.println(interpret(c));
    }
}
