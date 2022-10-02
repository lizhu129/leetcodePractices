package LUPrefix;

import java.util.PriorityQueue;

public class LUPrefix {
    /**
     * Your LUPrefix object will be instantiated and called as such:
     * LUPrefix obj = new LUPrefix(n);
     * obj.upload(video);
     * int param_2 = obj.longest();
     */
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int max = 0;

    public LUPrefix(int n) {
    }

    public void upload(int video) {
        if (video == max + 1) {
            max++;
        } else {
            pq.add(video);
        }
        if (pq.size() > 0) {
            while (pq.size() > 0 && pq.peek() == max + 1) {
                pq.poll();
                max++;
            }
        }
    }

    public int longest() {
        return max;
    }
}
