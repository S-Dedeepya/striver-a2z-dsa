# 2487. Remove Nodes From Linked List

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/remove-nodes-from-linked-list/)
**Submission Date:** 7 Sept 2026
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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        ListNode prev=null;
        int max=Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.val>=max){
                max=temp.val;
                prev=temp;
                temp=temp.next;
            }else{
                temp=temp.next;
                prev.next=temp;
            }
        }
        head=reverse(head);
        return head;
    }
    public ListNode reverse(ListNode head){
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

### Intuition
A node should be removed if there is a greater value somewhere on its right.
Reverse the linked list so that the right side becomes the left side.
Traverse the reversed list while maintaining the maximum value seen so far.
If temp.val < max, remove that node.
Otherwise, keep it and update max.
Reverse the list again to restore the original order.

### Logic to Be Careful With
Reverse first so we can process nodes from the original right → left.
If current value is greater than or equal to the maximum seen so far, keep it.
Update max using the current node before moving temp.
When current node must be removed, connect the previous kept node directly to the next node.
Reverse again to restore the original order.

### Edge Cases Handled
Single node,head null, all nodes increasing/decreasing/equal

### Mistakes Made
I updated max after moving temp.
This caused max to represent the next node instead of the node currently being processed.
Correct order is:
Check current
     ↓
Update max
     ↓
Move temp
When deleting a node, prev must not move because it still represents the previous valid node.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
