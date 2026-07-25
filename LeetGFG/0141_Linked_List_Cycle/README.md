# 0141. Linked List Cycle

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-cycle/)  
**Submission Date:** 25 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Assign head to two pointers:slow and fast
move slow by one step and fast by two steps. if they meet they the list is loop else if fast becomes null or fast.next becomes null then list is linear.

### Lines / Logic To Be Careful With
If nodes are even in linear list,then fast become null after iterations, if odd then fast.next is null

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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
```
