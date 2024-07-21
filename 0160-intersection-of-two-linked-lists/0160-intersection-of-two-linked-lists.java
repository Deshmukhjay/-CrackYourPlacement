/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        ListNode B=headB;

        int n=0,m=0;
        while(A!=null||B!=null){
            if(A!=null){
                m++;
                A=A.next;
            }
            else{
                n++;
                B=B.next;
            }
        }
        ListNode p1=(m>n)?headA:headB;
        ListNode p2=(p1==headA)?headB:headA;
        int dif=Math.abs(m-n);
        for(int i=0;i<dif;i++){
            p1=p1.next;
        }
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}