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
        int[] list = new int[100001];
        int count = 0;
        
        ListNode temp = head;
        while(temp != null) {
            list[count] = temp.val;
            temp = temp.next;
            count++;
        }
        
        int swap = list[k-1];
        list[k-1] = list[count-k];
        list[count-k] = swap;
        
        temp = head;
        int i = 0;
        
        while(temp != null) {
            temp.val = list[i++];
            temp = temp.next;
        }
        
        return head;
    }
}