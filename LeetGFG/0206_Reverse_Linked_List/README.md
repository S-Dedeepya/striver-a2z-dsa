# 0206. Reverse Linked List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-linked-list/)  
**Submission Date:** 24 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Take three pointers: prev,temp,front
first store text next node in front, then point temp to prev node.
Next move prev to temp and temp to front to iterate the loop
Atlast return prev node as it will be the head after reversing

### Lines / Logic To Be Careful With
Make sure to move prev to temp or else the front node cannot be pointed to the temp node.

### Edge Cases Handled
Not much edge cases involved

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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
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
