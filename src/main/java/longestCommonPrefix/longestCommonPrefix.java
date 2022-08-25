package longestCommonPrefix;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {return null;}
        String a = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(a) != 0) {
                a = a.substring(0, a.length() - 1);
                if (a.isEmpty()) {
                    return null;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
         String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
