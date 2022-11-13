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
        Set<ListNode> nodes = new HashSet<>();
        
        while(hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if(tortoise.equals(hare)) {
                while(!nodes.contains(tortoise)) {
                    nodes.add(tortoise);
                    tortoise = tortoise.next;
                }
                tortoise = head;
                while(!nodes.contains(tortoise)) {
                    tortoise = tortoise.next;
                }
                return tortoise;
            }
        }
        return null;
    }        
}