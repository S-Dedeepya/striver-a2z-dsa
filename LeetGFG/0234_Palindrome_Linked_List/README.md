# 0234. Palindrome Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/palindrome-linked-list/)  
**Submission Date:** 27 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
First divide the list into two halves by using slow and fast pointers.Then reverse the second half of the list. From newhead check the data in node with old head. if different return false else true.

### Lines / Logic To Be Careful With
while comparing data in first half nodes and second half nodes, dont forget to move first and second pointers

### Edge Cases Handled
head is null and only one node

## Solution

```java
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newhead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newhead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newhead);
        return true;
    }
    public static ListNode reverse(ListNode temp){
        ListNode prev=null;
        ListNode front=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
```
