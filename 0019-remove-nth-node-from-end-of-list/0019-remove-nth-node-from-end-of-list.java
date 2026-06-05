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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || n == 0) return head;

        if(head.next == null){
            return null;
        }
        if(n==1){
            ListNode temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }

        int len = 0;

        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        if(n > len) return null;

        int removeIndex = len - n + 1;

        if(removeIndex == 1){
            head = head.next;
            return head;
        }

        temp = head;
        len = 0;
        while(temp != null){
            len ++;
            if((len+1) == removeIndex){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}