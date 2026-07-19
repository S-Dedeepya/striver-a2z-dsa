/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
     if(head==null){
         return null;
     }   
     // if we want to delete the head node
  if(x==1){
      head=head.next;
      if(head!=null){
          head.prev=null;
          
      }
      return head;
  }
      Node temp=head;
      int c=1;
       // move temp to the x-th node
      while(temp!=null && c<x){
          temp=temp.next;
          c++;
      }
       // if position is invalid (greater than list length)
      if(temp==null)return head;
      
       // unlink temp from DLL
      if(temp.prev!=null) temp.prev.next=temp.next;
      if(temp.next!=null)temp.next.prev=temp.prev;
  temp.next=null;
  temp.prev=null;
     return head;
    }
}