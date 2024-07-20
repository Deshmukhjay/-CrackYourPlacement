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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        
        while(list1!=null&&list2!=null){
            int val1=list1.val;
            int val2=list2.val;
            if(val1<val2){
                cur.next=list1;
                list1=list1.next;
            }
            else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;}
            if(list1!=null)cur.next=list1;
            if(list2!=null)cur.next=list2;
        
        return dummy.next;
    }
}