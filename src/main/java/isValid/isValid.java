package isValid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isValid {
    // Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //An input string is valid if:
    //
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.



    public static boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                if (map.containsValue(s.charAt(i))) {
                    return false;
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                char last = stack.peek();
                if (map.containsKey(last) && map.get(last) == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "()";
        String s3 = "()[]{";
        String s4 = "{]{]][[[[";
        System.out.println(isValid(s1) == true);
        System.out.println(isValid(s2) == true);
        System.out.println(isValid(s3) == false);
        System.out.println(isValid(s4) == false);
    }

}
