# Check If Circular Linked List

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/circular-linked-list/1)  
**Submission Date:** 2 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
assign temp var to the list. check if temp == head everytime after the temp moves. if its then its true else false

### Lines / Logic To Be Careful With
not a tricky code so,no lines to be careful with

### Edge Cases Handled
not much edge cases handled

## Solution

```java
/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            if(temp==head){
                return true;
            }
        }
        return false;
    }
}
```
