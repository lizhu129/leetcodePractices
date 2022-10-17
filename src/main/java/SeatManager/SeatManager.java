package SeatManager;

import java.util.PriorityQueue;

public class SeatManager {

    PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq = new PriorityQueue<>(n);
        for (int i = 1; i <= n; i++) {
            pq.add(i);
        }
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}
