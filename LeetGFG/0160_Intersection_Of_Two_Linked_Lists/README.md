# 0160. Intersection of Two Linked Lists

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/intersection-of-two-linked-lists/)  
**Submission Date:** 1 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
assign t1,t2 to head1,head2 and move until null...if t1 reaches null assign it to head2 and if t2 reaches null assign it to head1. and if they both meet at a point then it is the intersection node

### Lines / Logic To Be Careful With
condition that to be written in the while loop

### Edge Cases Handled
head1 and head2 both are null.

## Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null || head2==null) return null;
        ListNode t1=head1;
        ListNode t2=head2;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2) return t1;
            if(t1==null) t1=head2;
            if(t2==null) t2=head1;
        }
        return t1;
    }
}
```
