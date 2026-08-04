# Rotate Doubly Linked List

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1)  
**Submission Date:** 4 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
move temp to end of ddl, and connect last node to first node and move head until k==0 and return head

### Lines / Logic To Be Careful With
while connecting last node to head connect head to prev node which is last node

### Edge Cases Handled
ddl consisting only one node

## Solution

```java
/* Structure of a doubly link list node
class Node {
    int data;
    Node prev, next;
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}*/

class Solution {
    public Node rotateDLL(Node head, int k) {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        temp.next.prev=temp;
        while(k!=0){
            head=head.next;
            k--;
        }
        head.prev.next=null;
        head.prev=null;
        return head;
    }
}
```
