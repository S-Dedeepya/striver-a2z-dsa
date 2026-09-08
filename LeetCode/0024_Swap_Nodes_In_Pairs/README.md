# 0024. Swap Nodes in Pairs

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/swap-nodes-in-pairs/)
**Submission Date:** 8 Sept 2026
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode temp=head;
        ListNode front=null;
        while(temp!=null && temp.next!=null){
            front=temp.next.next;
            temp.next.next=null;
            if(temp==head){
                temp=reverse(head);
                head=temp;
            }else{
                prev.next=null;
                temp=reverse(temp);
                prev.next=temp;
            }
            prev=temp.next;
            prev.next=front;
            temp=front;
        }
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
Swap every 2 adjacent nodes.
Save the node after the current pair using front.
Disconnect the current pair.
Reverse the pair using reverse().
Connect the reversed pair with the previous part and the remaining list.
prev always represents the last node of the previously swapped pair.

### Logic to Be Careful With
front = temp.next.next;
Save the next pair before changing any links.
temp.next.next = null;
Disconnect only the current pair before reversing.
temp = reverse(head);
head = temp;
For the first pair, update head because the second node becomes the new head.
prev.next = temp;
Connect the previous swapped pair to the current swapped pair.
prev = temp.next;
After reversing, temp.next is the tail of the swapped pair.
That tail becomes prev for the next pair.
prev.next = front;
Connect the swapped pair to the remaining list.

### Edge Cases Handled
singe node, head null,odd nodes in the list

### Mistakes Made
Save front before modifying links.
Disconnect the pair before calling reverse().
The first pair is special because there is no prev.
prev should always point to the tail of the previous swapped pair.
If one node is left at the end, leave it unchanged.
The while condition handles the last single node:

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
