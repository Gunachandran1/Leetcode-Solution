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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;
        
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            len ++;
        }
        if(k == len) return head;
        k = k % len;

        tail.next = head;
        int lastIndex = len - k;
        tail = head;
        while(lastIndex > 1){
            tail = tail.next;
            lastIndex--; 
        }
        head = tail.next;
        tail.next = null;

        return head;
    }
}