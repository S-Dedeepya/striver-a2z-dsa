# 0142. Linked List Cycle II

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-cycle-ii/)  
**Submission Date:** 25 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Detect the loop and assign slow pointer to head and move fast and slow pointer by 1 step. if they meet then that would be the starting node of the loop

### Lines / Logic To Be Careful With
for second loop, need to move both slow and fast by 1 step

### Edge Cases Handled
Not much edge cases involved

## Solution

```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
```
