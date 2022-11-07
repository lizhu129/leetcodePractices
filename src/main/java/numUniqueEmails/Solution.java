package numUniqueEmails;


import java.util.HashSet;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            int atIndex = email.indexOf("@");
            int plusIndex = email.indexOf("+");
            String s = "";
            if (plusIndex >= 0) {
                s = email.substring(0, plusIndex);
            } else {
                s = email.substring(0, atIndex);
            }
            String s1 = s.replace(".", "") + email.substring(atIndex);
            set.add(s1);
        }
        return set.size();
    }
}
