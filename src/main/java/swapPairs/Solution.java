package swapPairs;

import java.util.List;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(888);
        node.next = head;
        ListNode curr = node;
        while (curr.next != null && curr.next.next != null) {
            ListNode a = curr.next;
            ListNode b = curr.next.next;
            a.next = b.next;
            curr.next = b;
            curr.next.next = a;
            curr = curr.next.next;
        }
        return node.next;
    }

}
