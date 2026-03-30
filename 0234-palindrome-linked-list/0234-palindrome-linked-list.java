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

        List<Integer> l = new ArrayList<>();

        ListNode ln ;
        for(ln = head ; ln.next != null ; ln = ln.next){
            l.add(ln.val);
        }
        l.add(ln.val);

        int i = 0 ;
        int j = l.size()-1;

        while(i < j){
            if(l.get(i) != l.get(j)) return false;

            i++;
            j--;
        }

        return true;



    }
}