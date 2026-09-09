# 1721. Swapping Nodes in a Linked List

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)
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
    public ListNode swapNodes(ListNode head, int k) {
        int count=countnodes(head);
        int arr[]=new int[count];
        ListNode temp=head;
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        int temp1=arr[k-1];
        arr[k-1]=arr[arr.length-k];
        arr[arr.length-k]=temp1;
        ListNode tempo=head;
        for(int i=0;i<arr.length;i++){
            tempo.val=arr[i];;
            tempo=tempo.next;
        }
        return head;
    }
    public static int countnodes(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
```

### Intuition
Count the total number of nodes.
Store the node values in an array.
Find the two positions:
k-th from start → k - 1
k-th from end → n - k
Swap their values.
Traverse the linked list again and update the values.

### Logic to Be Careful With
arr[k-1]

→ k-th node from the beginning.

arr[arr.length-k]

→ k-th node from the end.

### Edge Cases Handled
k = 1 → first and last nodes swap.
k = n → same as k = 1.
Middle node → may swap with itself.
One node → no change.

### Mistakes Made
arr[arr.length-1] = temp1;

This always refers to the last node.

✅

arr[arr.length-k] = temp1;

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
