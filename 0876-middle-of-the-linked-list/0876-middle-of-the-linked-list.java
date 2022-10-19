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
    public ListNode middleNode(ListNode head) {
        // we need one fast pointer which will iterate until the end
        // the slow pointer will iterate in every two fast pointer iterations
        
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null) {
           if(count != 0 && count%2 == 0) {
               slow = slow.next;
           }
            if(fast.next == null && count%2 == 1){
                slow = slow.next;
            }
            count++;
            fast = fast.next;
        } 
        
        return slow;
        
    }
}