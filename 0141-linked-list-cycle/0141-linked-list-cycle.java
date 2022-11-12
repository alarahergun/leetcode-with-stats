/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    // tortoise and hare algorithm
    public boolean hasCycle(ListNode head) {        
        ListNode tortoise = head;
        ListNode hare = head;

        while(hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if(tortoise.equals(hare)) {
                return true;
            } 
        }

        return false;
    }
}