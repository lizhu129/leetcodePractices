package closetTarget;

public class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = 10001, t = 0;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int val = Math.abs(i - startIndex);
                t = 0;
                if (i > startIndex) {
                    t = startIndex + n - i;
                } else {
                    t = i + n -startIndex;
                }
                ans = Math.min(t, Math.min(val, ans));
            }
        }
        return ans == 10001? -1 : ans;
    }
}
