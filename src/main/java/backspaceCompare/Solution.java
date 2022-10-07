package backspaceCompare;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = getChars(s);
        Stack<Character> s2 = getChars(t);
        if (s1.size() != s2.size()) {
            return false;
        } else {
            while (!s1.isEmpty() && !s2.isEmpty()) {
                if (s1.pop().equals(s2.pop())) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    private Stack<Character> getChars(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        return st;
    }
}
