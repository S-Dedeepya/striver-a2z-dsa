# 0092. Reverse Linked List II

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-linked-list-ii/)
**Submission Date:** 5 Sept 2026
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode newhead=null;
        ListNode front=null;
        if(head==null || left==right) return head;
        int count=1;
        while(count<right){
            if(count<left){
                prev=temp;
            }
            if(count==left){
                newhead=temp;
            }
            temp=temp.next;
            count++;
        }
        front=temp.next;
        temp.next=null;
        if(prev==null){
            newhead=reverse(newhead);
            head=newhead;
        }else{
            prev.next=null;
            newhead=reverse(newhead);
            prev.next=newhead;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=front;
        return head;
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
Need to reverse only the nodes from left to right.
First find:
prev → node before left
newhead → node at left
temp → node at right
front → node after right
Cut the list around the portion.
Reverse newhead → ... → temp.
Reconnect the reversed portion with prev and front.

### Logic to Be Careful With
rev can be null when left == 1.
If left == 1, the reversed portion becomes the new head.
front = temp.next must be saved before breaking the link.
temp.next = null separates the portion that needs to be reversed.
After reversing, newhead points to the new beginning of the reversed portion.

### Edge Cases Handled
left == right → no reversal needed.
left == 1 → head changes.
Reverse entire list.
Reverse only the last few nodes.
Single-node list.

### Mistakes Made
Used prev.next without checking whether prev == null.
When left == 1, I forgot that head must change.
After reversing, I initially tried to reconnect using the wrong pointer.
Need to connect the tail of the reversed portion to front.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
