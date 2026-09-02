# 0445. Add Two Numbers II

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/add-two-numbers-ii/)
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode l3=null;
        ListNode temp=l3;
        l1=reverse(l1);
        l2=reverse(l2);
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            if(l3==null){
                l3=node;
                temp=l3;
            }else{
                temp.next=node;
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            l2=l2.next;
        }
        if(carry!=0){
            ListNode node=new ListNode(carry);
            temp.next=node;
            temp=temp.next;
        }
        l3=reverse(l3);
        return l3;
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
reverse both linkedlists and add them node by node. after addition return the reverse of that sum linkedlist

### Logic to Be Careful With
reverse linkedlist code. be careful with what you are assigning to what.

### Edge Cases Handled
different l1,l2 sizes,both null, any one of the ll is null

### Mistakes Made
reverse logic of llinkedlist. temp.next is assigned to front not the otherwise

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
