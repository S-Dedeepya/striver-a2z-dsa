# 0002. Add Two Numbers

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/add-two-numbers/)  
**Submission Date:** 23 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Traverse temp1,temp2 var throughout l1,l2 
add values from temp1 and temp2
if sum is less than 10 then add to new created linked list '
if sum is greater than or equal to 10 then store the tens digit in carry and create node in new linked list on value of ones digit of that sum

### Lines / Logic To Be Careful With
Make carry zero whenever you get sum>10
and also dont forget to check if carry is zero or not after both temps become null

### Edge Cases Handled
Carry is not zero after both temps reach the null
Both lists have different lengths

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=null;
        ListNode temp=null;
        int sum=0,carry=0;
        while(temp1!=null && temp2!=null){
            sum=temp1.val+temp2.val+carry;
            ListNode newnode;
            if(sum>=10){
                newnode=new ListNode(sum%10);
                carry=sum/10;
            }else{
                newnode=new ListNode(sum);
                carry=0;
            }
            if(head==null){
                head=newnode;
                temp=head;
            }else{
                temp.next=newnode;
                temp=temp.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            sum=temp1.val+carry;
            ListNode newnode;
            if(sum>=10){
                newnode=new ListNode(sum%10);
                carry=sum/10;
            }else{
                newnode=new ListNode(sum); 
                carry=0;
            }
            if(head==null){
                head=newnode;
                temp=head;
            }else{
                temp.next=newnode;
                temp=temp.next;
            }
            temp1=temp1.next;
        }
        while(temp2!=null){
            sum=temp2.val+carry;
            ListNode newnode;
            if(sum>=10){
                newnode=new ListNode(sum%10);
                carry=sum/10;
            }else{
                newnode=new ListNode(sum);
                carry=0;
            }
            if(head==null){
                head=newnode;
                temp=head;
            }else{
                temp.next=newnode;
                temp=temp.next;
            }
            temp2=temp2.next;
        }
        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            temp.next=newnode;
        }
        return head;
    }
}
```
