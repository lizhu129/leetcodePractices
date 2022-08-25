package mergeTwoLists;

public class ListNode implements Comparable<ListNode> {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next; }


    @Override
    public int compareTo(ListNode o) {
        return this.val - o.val;
    }
}
