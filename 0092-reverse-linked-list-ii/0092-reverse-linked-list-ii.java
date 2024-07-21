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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right||head.next==null||head==null) return head;
        ListNode cur=head;
        ListNode prev=null;
        int count=1;
        while(cur!=null&&count!=left){
            prev=cur;
            cur=cur.next;
            count++;
        }
        ListNode start=cur;
        ListNode startToPoint=prev;
        prev=null;
        while(cur!=null&&count!=right+1){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            count++;
        }
        start.next=cur;
       if( startToPoint!=null){
        startToPoint.next=prev;
       }
       else{  
      return prev;
       }
       return head;
    }
}