/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
    Node cur=head;
    while(cur!=null){
        Node temp=cur.next;
        cur.next=new Node(cur.val);
        cur.next.next=temp;
        cur=temp;
    }   
    cur=head;
    while(cur!=null){
        if(cur.next!=null){
           cur.next.random= (cur.random!=null)?cur.random.next:null;

        }
        cur=cur.next.next;
    }
    Node orig=head;
   Node copy  = (head!=null) ? head.next : null;
    Node temp=copy;
    while(orig!= null){
            orig.next = orig.next.next;
            
            if(copy.next== null){
                break;
            } 
            else {
            copy.next = copy.next.next;
            }            
            orig = orig.next;
            copy = copy.next;
        }
          return temp;
    }
}