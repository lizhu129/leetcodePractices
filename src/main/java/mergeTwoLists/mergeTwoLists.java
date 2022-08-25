package mergeTwoLists;


public class mergeTwoLists {

    // You are given the heads of two sorted linked lists list1 and list2.
    //
    //Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
    //
    //Return the head of the merged linked list.



    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) { return list2; }
        if (list2 == null) { return list1; }
        ListNode sentinel = new ListNode(123);
        ListNode a = sentinel;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                a.next = list1;
                list1 = list1.next;
            } else {
                a.next = list2;
                list2 = list2.next;
            }
            a = a.next;
        }
        if (list1 != null) {
            a.next = list1;
        }
        if (list2 != null) {
            a.next = list2;
        }

        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.println(mergeTwoLists(l1, l2).val);



    }
}
