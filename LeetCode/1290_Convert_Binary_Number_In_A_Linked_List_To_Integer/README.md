# 1290. Long Time No Seen, Aehhh Easy Question !!

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)
**Submission Date:** 4 Sept 2026
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
    public int getDecimalValue(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        int ans=0,count=0;
        while(temp!=null){
            ans+=(Math.pow(2,count++)*temp.val);
            temp=temp.next;
        }
        return ans;
    }
    public static ListNode reverse(ListNode head){
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
First reverse the linked list so the least significant bit comes first.
Traverse the reversed list.
count represents the power of 2.
For every node:
Calculate 2^count × digit
Add it to ans.
Increase count for the next digit.

### Logic to Be Careful With
ans += Math.pow(2,count++) * temp.val;
Math.pow() returns double.
count++ increases count after using it.
reverse(head) modifies the original linked list.
Make sure temp = temp.next is present so traversal continues.

### Edge Cases Handled
head = [0] → 0
head = [1] → 1
[1,0,0] → 4
[0,0,0] → 0

### Mistakes Made
Reverse → power of 2 → multiply with digit → add to answer . my approach

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
