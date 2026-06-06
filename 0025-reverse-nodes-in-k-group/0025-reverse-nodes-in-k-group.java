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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        ListNode newHead = head;
        ListNode prev = null;

        while(temp != null){
            ListNode nth = temp;
            int count = 1;
            while(count != k){
                count++;
                if(nth.next == null) return newHead;
                nth = nth.next;
            }

            ListNode nextNode = nth.next;
            nth.next = null;

            ListNode h = reverse(temp);

            if(temp == head) newHead = h;
            else prev.next = h;
            prev = temp;
            temp.next = nextNode;
            temp = temp.next;
        }

        return newHead;
    }

    public ListNode reverse(ListNode head){

        ListNode prev = null;

        while(head != null){
            ListNode front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }
}