/*
Problem Revision Notes

Problem:    Remove Nth Node From End of List
Platform:   LeetCode
Difficulty: Medium
Date:       2026-07-19

──────────────────────────────────────────────────

Intuition
first count no.of node and subtract n from it. this  give the what node to delete.

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
while dealing with test cases that gives count 0 after subtracting n from it

──────────────────────────────────────────────────

Edge Cases Handled
if count 0 after subtracting n from the no.of nodes

──────────────────────────────────────────────────

Mistakes I Made
Mishandled the edge case

──────────────────────────────────────────────────

Future Reminder
dont forget the edge cases

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(1)

══════════════════════════════════════════════════
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count-n;
        temp=head;
        ListNode prev=temp;
        if(count==0){
            head=head.next;
        }
        while(count!=0){
            prev=temp;
            temp=temp.next;
            count--;
        }
        if(temp.next!=null){
            prev.next=temp.next;
        }else{
            prev.next=null;
        }
        return head;
    }
}