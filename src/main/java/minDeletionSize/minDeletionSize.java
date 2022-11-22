package minDeletionSize;

public class minDeletionSize {
    public static int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                int diff = strs[j + 1].charAt(i) -  strs[j].charAt(i);
                if (diff < 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(strs));
    }
}
