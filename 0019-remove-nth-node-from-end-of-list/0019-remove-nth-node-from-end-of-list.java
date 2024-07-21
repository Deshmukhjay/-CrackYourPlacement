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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        if(n==count)return head.next;
        int ele=count-n;
        ListNode prev=head;
        for(int i=1;i<ele;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}