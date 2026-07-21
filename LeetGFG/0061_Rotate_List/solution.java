/*
Problem Revision Notes

Problem:    Rotate List
Platform:   LeetCode
Difficulty: Medium
Date:       2026-07-21

──────────────────────────────────────────────────

Intuition
First minimized the k to k%10 and made the list cycle so that i can move the temp from last node for k times and then move head pointer to that node later pointing it to null

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
Point last node to head node only after checking if k==0 because if its zero then we can return head directly no need to rotate list

──────────────────────────────────────────────────

Edge Cases Handled
When head head is null return null

──────────────────────────────────────────────────

Mistakes I Made
Made the list circular first before checking whether i really have to rotate it or not.

──────────────────────────────────────────────────

Future Reminder
Point last node to head node only after checking if k==0 because if its zero then we can return head directly no need to rotate list

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(1)

══════════════════════════════════════════════════
*/

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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int count=1;
        if(head==null) return null;
        if(k==0) return head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k==0) return head;
        temp.next=head;
        k=count-k;
        while(k!=0){
            temp=temp.next;
            k--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}