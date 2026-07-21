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
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=null;
        ListNode temp=null;
        if(list1==null && list2==null) return null;
        while(temp1!=null && temp2!=null){
            if(temp1.val==temp2.val){
                if(head==null){
                    ListNode newnode=new ListNode(temp1.val);
                    ListNode newnode1=new ListNode(temp2.val);
                    head=newnode;
                    temp=head;
                    temp.next=newnode1;
                    temp=temp.next;
                    temp1=temp1.next;
                    temp2=temp2.next;
                }else{
                    ListNode newnode=new ListNode(temp1.val);
                    ListNode newnode1=new ListNode(temp2.val);
                    temp.next=newnode;
                    temp=temp.next;
                    temp.next=newnode1;
                    temp=temp.next;
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }else if(temp1.val<temp2.val){
                ListNode newnode=new ListNode(temp1.val);
                if(head==null){
                    head=newnode;
                    temp=head;
                    temp1=temp1.next;
                    continue;
                }
                temp.next=newnode;
                temp=temp.next;
                temp1=temp1.next;
            }else{
                ListNode newnode=new ListNode(temp2.val);
                if(head==null){
                    head=newnode;
                    temp=head;
                    temp2=temp2.next;
                    continue;
                }
                temp.next=newnode;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            ListNode newnode=new ListNode(temp1.val);
            if(head==null){
                head=newnode;
                temp=head;
                temp1=temp1.next;
                continue;
            }
            temp.next=newnode;
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            ListNode newnode=new ListNode(temp2.val);
            if(head==null){
                head=newnode;
                temp=head;
                temp2=temp2.next;
            }else{
                temp.next=newnode;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        return head;
    }
}