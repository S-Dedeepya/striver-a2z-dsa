# 0025. Reverse Nodes in k-Group

**Platform:** LeetCode  
**Difficulty:** Hard  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-nodes-in-k-group/)  
**Submission Date:** 24 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Process the linked list one group of k nodes at a time. Find the kth node, temporarily detach that group, reverse it, and reconnect it with the previously processed part.
If fewer than k nodes remain, leave them unchanged and attach them directly to the end of the already reversed list.

### Lines / Logic To Be Careful With
If kthnode is null... just connect prevnode to temp and break the loop.

### Edge Cases Handled
Empty list,k==1,k is greater than nodes present in the linked list.

## Solution

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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        while(temp!=null){
            ListNode kthnode= kth(temp,k);
            if(kthnode==null){
                prevnode.next=temp;
                break;
            }
            ListNode next=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
                prevnode=temp;
                temp=next;
            }else{
                prevnode.next=kthnode;
                prevnode=temp;
                temp=next;
            }
        }
        return head;
    }
    public ListNode kth(ListNode temp,int k){
        int count=1;
        while(temp!=null && k!=count){
            temp=temp.next;
            count++;
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
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
