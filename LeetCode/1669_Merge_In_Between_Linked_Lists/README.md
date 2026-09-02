# 1669. Merge In Between Linked Lists

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/merge-in-between-linked-lists/)
**Submission Date:** 2 Sept 2026
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode temp=list1;
        ListNode prev=temp;
        ListNode temp1=list1;
        while(count!=b){
            if(count<a){
                prev=temp;
            }
            if(count==a){
                prev.next=list2;
            }
            temp=temp.next;
            count++;
        }
        if(a==b){
            prev.next=list2;
        }
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=temp.next;
        return list1;
    }
}
```

### Intuition
take two pointers prev and temp... place prev befor a, and temp on bth node.connect prev next to list2 and list2 end to temp next. and return list1.

### Logic to Be Careful With
connecting prev.next to list2 and list2 end to temp.next node.

### Edge Cases Handled
if a==b then handle that seperately. as prev.next will not connect if a==b.

### Mistakes Made
for a==b, while loop ends before connecting so we need to handle it seperately

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
