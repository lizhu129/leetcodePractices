package generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<String> res = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        StringBuilder cur = new StringBuilder();
        dfs(cur, 0, 0, n);
        return res;
    }

    public static void dfs(StringBuilder cur, int left, int right, int n){
        if(cur.length() == 2 * n){
            res.add(cur.toString());
            return;
        }

        if(left < n){
            cur.append("(");
            dfs(cur, left + 1, right, n);
            cur.deleteCharAt(cur.length() - 1);
        }

        if(left > right){
            cur.append(")");
            dfs(cur, left, right + 1, n);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    public static void main(String[] args) {
        generateParenthesis(8);
        System.out.println(generateParenthesis(8));
    }
}
