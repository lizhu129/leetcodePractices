package calPoints;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String s : operations) {
            switch (s) {
                case "+" -> {
                    int n = list.size();
                    list.add(list.get(n - 1) + list.get(n - 2));
                }
                case "D" -> list.add(list.get(list.size() - 1) * 2);
                case "C" -> list.remove(list.get(list.size() - 1));
                default -> list.add(Integer.parseInt(s));
            }
        }
        int res = 0;
        for (int n : list) {
            res += n;
        }
        return res;
    }
}
