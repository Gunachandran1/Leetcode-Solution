/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution{
    public boolean isPalindrome(ListNode head) {

        if(head == null) return false;
        if(head.next == null) return true;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverse(slow.next);
        slow = newHead;
        fast = head;

        while(slow != null){
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        reverse(newHead);
        return true;

    }

    public static ListNode reverse(ListNode node){

        ListNode prev = null;

        while(node != null){
            ListNode front = node.next;
            node.next  = prev;
            prev = node;
            node = front;
        }

        return prev;
    }
}