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
    public ListNode detectCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        
        while(hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if(tortoise.equals(hare)) {
                tortoise = head;
                while(!tortoise.equals(hare)) {
                    tortoise = tortoise.next;
                    hare = hare.next;
                }
                return tortoise;
            }
        }
        return null;
    }        
}