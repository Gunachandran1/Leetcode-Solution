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
class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        
        if(h1==null && h2==null) return null;

        int carry = 0;
        int sum = 0;
        ListNode t1 = h1;
        ListNode t2 = h2;
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(t1 != null || t2 != null){
            if(t1 != null) sum += t1.val;
            if(t2 != null) sum += t2.val;
            sum += carry;

            ListNode n = new ListNode((sum%10));
            curr.next = n;
            curr = n;

            carry = sum / 10;
            sum = 0;

            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }

        if(carry != 0){
            ListNode n = new ListNode(carry);
            curr.next = n;
        }

        ListNode head = dummy.next;
        return head;
        
    }
}