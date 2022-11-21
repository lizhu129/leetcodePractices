package RecentCounter;

import java.util.LinkedList;

public class RecentCounter {

    LinkedList<Integer> list = new LinkedList<>();

    public RecentCounter() {
        list = new LinkedList<>();
    }

    public int ping(int t) {
        list.addLast(t);
        while (list.getFirst() < t - 3000) {
            list.removeFirst();
        }
        return list.size();
    }
}
