package MinStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MinStack {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    Node head, headMin;

    public MinStack() {

    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }

        if (headMin == null) {
            headMin = new Node(val);
        } else {
            int min = Math.min(val, headMin.val);
            Node node = new Node(min);
            node.next = headMin;
            headMin = node;
        }
    }

    public void pop() {
        head = head.next;
        headMin = headMin.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return headMin.val;
    }

}
