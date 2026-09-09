# 0143. Reorder List

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/reorder-list/)
**Submission Date:** 9 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

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
    public void reorderList(ListNode head) {
        ListNode prev=head;
        ListNode temp=head.next;
        while(temp!=null){
            prev.next=null;
            temp=reverse(temp);
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode front=null;
        ListNode temp=head;
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

### Intuition
The required order is:
L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...
My approach repeatedly:
Disconnect the list after prev.
Reverse the remaining list.
Attach the reversed part back.
Move prev and temp forward.
reverse() is used to reverse the remaining portion of the list.

### Logic to Be Careful With
temp must point to the remaining part before calling reverse().
Always disconnect the list before reversing to avoid unwanted links/cycles.
reverse() changes the direction of all nodes in the given portion.

### Edge Cases Handled
head == null
One node
Two nodes
Odd number of nodes
Even number of nodes

### Mistakes Made
This approach is not the standard efficient solution for Reorder List.
Reversing the remaining list repeatedly causes the same nodes to be traversed many times.
Therefore, the time complexity can become O(n²).

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
