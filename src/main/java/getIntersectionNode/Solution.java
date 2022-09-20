package getIntersectionNode;

import java.awt.color.ICC_ColorSpace;
import java.util.HashMap;

public class Solution {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; next = null; }
         ListNode(int x, ListNode next) { val = x; this.next = next; }
     }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode currA = headA, currB = headB;
        while (currA != null) {
            currA = currA.next;
            lenA++;
        }
        while (currB != null) {
            currB = currB.next;
            lenB++;
        }
        currA = headA;
        currB = headB;
        while (lenA > lenB) {
            currA = currA.next;
            lenA--;
        }
        while (lenB > lenA) {
            currB = currB.next;
            lenB--;
        }
        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }

    public static void main(String[] args) {
         ListNode head1 = new ListNode(4);
         head1.next = new ListNode(1);
         head1.next.next = new ListNode(8);
         head1.next.next.next = new ListNode(4, new ListNode(5));

         ListNode head2 = new ListNode(5);
         head2.next = new ListNode(6);
         head2.next.next = new ListNode(1);
         head2.next.next.next = new ListNode(8);
         head2.next.next.next.next = new ListNode(4, new ListNode(5));

         ListNode a = new ListNode(-2);
         a.next = head1;

         int count = 0;
         while (a.next != null) {
             a = a.next;
             count++;
         }
        System.out.println(count);
        System.out.println(a.val);


    }
 }
