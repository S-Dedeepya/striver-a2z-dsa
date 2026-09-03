# 2807. Insert Greatest Common Divisors in Linked List

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/)
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        if(temp==null || temp.next==null){
            return head;
        }
        while(temp!=null && temp.next!=null){
            int value=gcd(temp.val,temp.next.val);
            ListNode node=new ListNode(value);
            node.next=temp.next;
            temp.next=node;
            temp=temp.next.next;
        }
        return head;

    }
    public static int gcd(int a,int b){
        if(b<a){
            return gcd(b,a);
        }
        for(int i=a;i>=1;i--){
            if((a%i==0)&&(b%i)==0){
                return i;
            }
        }
        return 1;
    }
}
```

### Intuition
Traverse the linked list.
For every adjacent pair, calculate GCD.
Insert GCD between the two nodes.
Move to the original next node.

### Logic to Be Careful With
Check temp != null before using temp.next.
Prevents NullPointerException.

### Edge Cases Handled
head is null and head.next is null then return head.

### Mistakes Made
while(temp.next != null) can cause NPE if temp == null.
temp.next = node; temp = temp.next.next is harder to track; explicitly connect node.next first.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)
