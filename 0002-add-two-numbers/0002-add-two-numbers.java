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

        if(h1 == null && h2 == null) return null;
        
        ListNode t1 = h1;
        ListNode t2 = h2;

        int carry = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode mover = dummyHead;

        while(t1 != null || t2 != null){

            int sum = carry;

            if(t1 != null) {sum += t1.val;
            t1 = t1.next;
            }
            if(t2 != null){ sum += t2.val;
            t2 = t2.next;
            }
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10 ;

            mover.next = newNode;
            mover = newNode;

        }

        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            mover.next = newNode;
        }

        return dummyHead.next;
    }
}