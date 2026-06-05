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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)return head;

        while(head != null && head.val == val) {
            head = head.next;
        }
        if(head == null || head.next == null)return head;
        ListNode temp = head;

        while(temp != null){
            while(temp.next != null && temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        } 
        return head;

    }
}