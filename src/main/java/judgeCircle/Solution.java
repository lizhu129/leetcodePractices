package judgeCircle;

public class Solution {

    public boolean judgeCircle(String moves) {
        int[] counts1 = new int[2];
        int[] counts2 = new int[2];
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'L') {
                counts1[0]++;
            } else if (c == 'R') {
                counts1[1]++;
            } else if (c == 'U') {
                counts2[0]++;
            } else {
                counts2[1]++;
            }
        }
        return (counts1[0] == counts1[1]) && (counts2[0] == counts2[1]);
    }
}
