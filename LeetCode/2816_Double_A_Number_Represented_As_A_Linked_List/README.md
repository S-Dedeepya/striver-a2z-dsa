# 2816. Double a Number Represented as a Linked List

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/)
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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        ListNode prev=temp;
        int carry=0;
        while(temp!=null){
            int value=temp.val*2+carry;
            carry=value/10;
            temp.val=value%10;
            prev=temp;
            temp=temp.next;
        }
        if(carry!=0){
            ListNode node=new ListNode(carry);
            prev.next=node;
        }
        head=reverse(head);
        return head;
        
    }
    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode front=null;
        ListNode prev=null;
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
reverse the linkedlist and multiply each node val by 2 and if after multiplying val>=10 store in the carry. and at last if carry is not zero then create node and attach it to end of ll. nd then return the reverse after performing this operation/

### Logic to Be Careful With
if carry not zero create node for thaat carry and connect the prev to that node

### Edge Cases Handled
carry is not zero. then we need to handle that case

### Mistakes Made
while carry not zero i tried to connect temp and that carry node but we should connect prev to carry node

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
