# Insert in Sorted Circular Linked List

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1)
**Submission Date:** 9 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
       Node temp=head.next;
       Node prev=head;
       Node tail=head;
       while(tail.next!=head){
           tail=tail.next;
       }
       if(head.data>=data){
           Node newnode=new Node(data);
           newnode.next=head;
           tail.next=newnode;
           return newnode;
       }
       while(temp!=head){
           if(temp.data>=data){
               Node newnode=new Node(data);
               prev.next=newnode;
               newnode.next=temp;
               return head;
           }
           prev=temp;
           temp=temp.next;
       }
       Node newnode=new Node(data);
       tail.next=newnode;
       newnode.next=head;
       return head;
    }
}
```

### Intuition
Find the tail first because in a circular list:
tail.next == head
There are 3 cases:
Insert before head.
Insert between two nodes.
Insert after tail.
Keep the list circular after insertion.

### Logic to Be Careful With
Node temp = head.next;
Node prev = head;
Node tail = head;
temp starts from the second node.
prev stays one node behind temp.
tail is used to maintain the circular connection.

### Edge Cases Handled
Insert smaller than head.
Insert equal to head.
Insert in the middle.
Insert greater than tail.
Only one node.
Duplicate values.

### Mistakes Made
Node temp = head;
while(temp != head)

The loop never executes because temp is already head.

✅ Correct:

Node temp = head.next;
Node prev = head;

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
