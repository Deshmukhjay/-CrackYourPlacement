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
        // Create a dummy node that points to the head  
        ListNode dummy = new ListNode(0);  
        dummy.next = head;  
        ListNode cur = dummy; // Start with the dummy node  

        while (cur.next != null) {  
            // If the next node needs to be removed  
            if (cur.next.val == val) {  
                cur.next = cur.next.next; // Bypass the node to be removed  
            } else {  
                cur = cur.next; // Move to the next node only if no removal  
            }  
        }  

        return dummy.next; // Return the next of dummy, which is the new head  
    }  
}