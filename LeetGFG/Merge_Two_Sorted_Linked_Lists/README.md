# Merge two sorted linked lists

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1)  
**Submission Date:** 23 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
wrote cases for: if the both nodes from both lists have same value then create two nodes of same value and connect both. increment both temp pointers if any of those temp value is lesser than the other then create node for that value and increment the temp pointer of that respective list.

### Lines / Logic To Be Careful With
Check if the head is actually null before add newnodes in any case

### Edge Cases Handled
If both lists are null return null

## Solution

```java
/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node list1, Node list2) {
        Node temp1=list1;
        Node temp2=list2;
        Node head=null;
        Node temp=null;
        if(list1==null && list2==null) return null;
        while(temp1!=null && temp2!=null){
            if(temp1.data==temp2.data){
                if(head==null){
                    Node newnode=new Node(temp1.data);
                    Node newnode1=new Node(temp2.data);
                    head=newnode;
                    temp=head;
                    temp.next=newnode1;
                    temp=temp.next;
                    temp1=temp1.next;
                    temp2=temp2.next;
                }else{
                    Node newnode=new Node(temp1.data);
                    Node newnode1=new Node(temp2.data);
                    temp.next=newnode;
                    temp=temp.next;
                    temp.next=newnode1;
                    temp=temp.next;
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }else if(temp1.data<temp2.data){
                Node newnode=new Node(temp1.data);
                if(head==null){
                    head=newnode;
                    temp=head;
                    temp1=temp1.next;
                    continue;
                }
                temp.next=newnode;
                temp=temp.next;
                temp1=temp1.next;
            }else{
                Node newnode=new Node(temp2.data);
                if(head==null){
                    head=newnode;
                    temp=head;
                    temp2=temp2.next;
                    continue;
                }
                temp.next=newnode;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            Node newnode=new Node(temp1.data);
            if(head==null){
                head=newnode;
                temp=head;
                temp1=temp1.next;
                continue;
            }
            temp.next=newnode;
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            Node newnode=new Node(temp2.data);
            if(head==null){
                head=newnode;
                temp=head;
                temp2=temp2.next;
            }else{
                temp.next=newnode;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        return head;
    }
}
```
