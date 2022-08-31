package lengthOfLastWord;

import java.util.Arrays;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("\\s+", "0");
        return s.length() - s.lastIndexOf("0") - 1;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        s = s.trim();
        s = s.replaceAll("\\s+", "0");

        System.out.println(s);
        System.out.println(s.length() - s.lastIndexOf("0") - 1);

    }
}
