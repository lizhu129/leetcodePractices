package reorderList;

import java.util.Stack;

public class Solution {
    public class ListNode {
        int val;ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        ListNode curr = head;
        int size = stack.size();

        int i = 0;
        while (i < size / 2) {
            ListNode front = curr.next;
            ListNode back = stack.pop();
            curr.next = back;
            back.next = front;
            curr = front;
            i++;
        }
        curr.next = null;
    }
}
