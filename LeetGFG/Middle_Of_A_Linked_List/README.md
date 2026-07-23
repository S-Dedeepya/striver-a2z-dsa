# Middle of a Linked List

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1)  
**Submission Date:** 23 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
First count no.of nodes in the linked list
Then make the count half of it and traverse the linked list until half of count becomes zero
If count half becomes zero then temp must have reached the middle node so return the middle node value.

### Lines / Logic To Be Careful With
After making the count into half... be careful with how many times you need to move to reach the middle node as count can be odd/even.

### Edge Cases Handled
no specific edge cases present in the sol

## Solution

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
    int getMiddle(Node head) {
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        count=count/2;
        while(count!=0){
            temp=temp.next;
            count--;
        }
        return temp.data;
    }
}
```
