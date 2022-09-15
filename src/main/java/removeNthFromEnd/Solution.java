package removeNthFromEnd;

public class Solution {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-100);
        node.next = head;
        int count = 0;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        int i = 0;
        node = new ListNode(-100);
        node.next = head;
        while (i < count - n) {
            node = node.next;
            i++;
        }
        ListNode tmp = node.next.next;
        node.next = tmp;
        if (count == n) {
            return head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        int n = 2;

    }
}
