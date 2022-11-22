package isAlienSorted;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[26];
        for (int i = 0; i < 26; i++) {
            dic[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j >= words[i + 1].length()) {
                    return false;
                }
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int diff = dic[words[i].charAt(j) - 'a'] - dic[words[i + 1].charAt(j) - 'a'];
                    if (diff > 0) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }
}
