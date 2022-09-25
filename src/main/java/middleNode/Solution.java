package middleNode;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(999);
        node.next = head;
        int count = 0;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        node = new ListNode(999);
        node.next = head;
        int m = count / 2;
        while (m >= 0) {
            node = node.next;
            m--;
        }
        return node;

    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4, new ListNode(5));

        ListNode node = new ListNode(999);
        node.next = root;
        int count = 0;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        System.out.println(count);
        node = new ListNode(999);
        node.next = root;
        int m = count / 2;
        while (m >= 0) {
            node = node.next;
            m--;
        }
        System.out.println(node.val);
    }
}
