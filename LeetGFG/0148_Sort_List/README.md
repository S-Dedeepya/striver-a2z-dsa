# 0148. Sort List

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/sort-list/)  
**Submission Date:** 31 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n log n)  
**Space Complexity:** O(logn)  

## Revision Notes

### Intuition
Apply MergeSort method.

### Lines / Logic To Be Careful With
finding the middle node and merging the two divided lists

### Edge Cases Handled
head null,head next is null

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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode middle=findmiddle(head);
        ListNode lefthead=head;
        ListNode righthead=middle.next;
        middle.next=null;
        ListNode left=sortList(lefthead);
        ListNode right=sortList(righthead);
        return merge(left,right);
    }
    public ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
        }
        return dummy.next;
    }
}
```
