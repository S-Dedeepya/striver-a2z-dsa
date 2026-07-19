/*
Problem Revision Notes

Problem:    Delete the Middle Node of a Linked List
Platform:   LeetCode
Difficulty: Medium
Date:       2026-07-19

──────────────────────────────────────────────────

Intuition
counted no.of nodes and divided it to half. so that the temp can be traversed till the half of the linked list. and delete the node

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
if the middle node happened to be the last node 
and if there is only one node

──────────────────────────────────────────────────

Edge Cases Handled
edge cases: only one node and middle being the last node

──────────────────────────────────────────────────

Mistakes I Made
handling the edge cases

──────────────────────────────────────────────────

Future Reminder
look after the edge cases

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
12    public ListNode deleteMiddle(ListNode head) {
13        ListNode temp=head;
14        ListNode prev=null;
15        int count=0;
16        while(temp!=null){
17            count++;
18            temp=temp.next;
19        }
20        count=(count/2);
21        temp=head;
22        if(count==0){
23            return null;
24        }
25        while(count!=0){
26            prev=temp;;
27            temp=temp.next;
28            count--;
29        }
30        if(temp.next==null){
31            prev.next=null;
32        }else{
33            prev.next=temp.next;
34        }
35        return head;
36    }
37}