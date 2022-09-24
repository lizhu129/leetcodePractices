package findItinerary;

import java.util.*;

public class Solution {

    /** Idea: Think of the itinerary as a tree
     * sort children (lexical order) + PostOrder Traversal
     * the return value is the reverse of PostOrder route */
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> trips = new HashMap<>();
        List<String> route = new ArrayList<>();

        for (List<String> list : tickets) {
            String from = list.get(0);
            String to = list.get(1);
            trips.putIfAbsent(from, new PriorityQueue<>());
            trips.get(from).offer(to);
        }

        postOrder(trips, route,"JFK");
        return route;
    }

    /** PostOrder traversal */
    private void postOrder(Map<String, PriorityQueue<String>> trips, List<String> route, String start) {
        /** Get all the children all the start */
        PriorityQueue<String> pq = trips.get(start);

        while (pq != null && !pq.isEmpty()) {
            postOrder(trips, route, pq.poll());
        }
        route.add(0, start);
    }
}
