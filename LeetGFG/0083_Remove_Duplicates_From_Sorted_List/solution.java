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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode prev=temp;
        if(head==null) return null;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                if(temp==head){
                    head=head.next;
                    temp=head;
                    prev=temp;
                }else{
                    prev.next=temp.next;
                    temp=temp.next;
                }

            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}