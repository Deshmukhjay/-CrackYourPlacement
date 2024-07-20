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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode l3=new ListNode(0);
     ListNode cur=l3;
     int carry=0;
       while(l1!=null||l2!=null){
      int val1=(l1!=null)?l1.val:0;
      int val2=(l2!=null)?l2.val:0;

      int cursum=val1+val2+carry;
      carry=cursum/10;
      int ld=cursum%10;
      ListNode n=new ListNode(ld);
      cur.next=n;
      if(l1!=null) l1=l1.next;
      if(l2!=null) l2=l2.next;
      cur=cur.next;
       } 
       if(carry>0){
        ListNode nd=new ListNode(carry);
        cur.next=nd;
        cur=cur.next;
       }
       return l3.next;
    }
}