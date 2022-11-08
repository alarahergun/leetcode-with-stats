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
    public ListNode swapNodes(ListNode head, int k) {
        // delete nth node from the end but an advanced version of it
        
        ListNode nthBegin;
        ListNode fast = head;
        ListNode slow = head;
        
        for(int i=0; i<k-1; i++) {
            fast = fast.next;
        }
        
        nthBegin = fast;
        
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        int swap = nthBegin.val;
        nthBegin.val = slow.val;
        slow.val = swap;
        
        return head;
    }
}