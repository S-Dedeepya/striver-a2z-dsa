# 2181. Merge Nodes in Between Zeros

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/merge-nodes-in-between-zeros/)
**Submission Date:** 3 Sept 2026
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
    public ListNode mergeNodes(ListNode head) {
        ListNode newhead=null;
        ListNode tempo=null;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                if(sum!=0){
                    ListNode node=new ListNode(sum);
                    if(newhead==null){
                        newhead=node;
                        tempo=newhead;
                    }else{
                        tempo.next=node;
                        tempo=tempo.next;
                    }
                }
                temp=temp.next;
                sum=0;
            }else{
                sum+=temp.val;
                temp=temp.next;
            }
        }
        return newhead;
    }
}
```

### Intuition
You are doing exactly this:

sum → stores the sum of the current group.
When you encounter 0:
If sum != 0, create a node containing that sum.
Attach it to the new list.
Reset sum = 0.
Continue until the list ends.

### Logic to Be Careful With
Resetting sum,Moving temp,creating new linked list

### Edge Cases Handled
list having only zeroes

### Mistakes Made
no mistakes made solving this problem

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
