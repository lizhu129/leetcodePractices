package isPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("\\s+","").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (str.isEmpty()) {
            return true;
        }
        int a = 0;
        int b = str.length() - 1;
        while (a < str.length() / 2) {
            if (str.charAt(a) == str.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String str = s.replaceAll("\\s+","").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int a = 0;
        int b = str.length() - 1;
        while (a < str.length() / 2) {
            if (str.charAt(a) == str.charAt(b)) {
                a++;
                b--;
            } else {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");

    }
}
