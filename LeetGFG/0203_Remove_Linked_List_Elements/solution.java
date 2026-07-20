/*
Problem Revision Notes

Problem:    Remove Linked List Elements
Platform:   LeetCode
Difficulty: Easy
Date:       2026-07-20

──────────────────────────────────────────────────

Intuition
first check every node val with the give value. if its same then delete the node by using prev and temp node

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
be careful of the val is in the head node or the end node;

──────────────────────────────────────────────────

Edge Cases Handled
if the val is in head move the head and temp node forward. if the vali is at the end point the prev pointer to null and also MOVE THE temp pointer as well (because then only temp will change and loop condition fails in the next iterarion, else the temp remains unchanged and loop runs forever).

──────────────────────────────────────────────────

Mistakes I Made
if the node is t the end, i forgot to move the temp pointer as well after pointing the prev node to null which is why i got TLE error

──────────────────────────────────────────────────

Future Reminder
be careful while writing the code for edge cases

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(1)

══════════════════════════════════════════════════
*/

1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null) return null;
14        ListNode temp=head;
15        ListNode prev=null;
16        while(temp!=null){
17            if(temp.val==val){
18                if(temp==head){
19                    head=head.next;
20                    temp=head;
21                    continue;
22                }
23                if(temp.next!=null){
24                    prev.next=temp.next;
25                    temp=temp.next;
26                }else{
27                    prev.next=null;
28                    temp=temp.next;
29                }
30            }else{
31                prev=temp;
32                temp=temp.next;
33            }
34        }
35        return head;
36    }
37}