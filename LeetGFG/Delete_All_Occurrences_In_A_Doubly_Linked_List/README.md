# Delete all occurrences in a doubly linked list

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1)  
**Submission Date:** 23 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Create temp,prev pointers. Start the loop and check if temp data is equal to x,if yes check its head, if yes move head,temp,prev pointers,if no check if the temp next is null, if null point prev to null and increment temp.,if not null connect prev and temp next nodes.

### Lines / Logic To Be Careful With
Don't forget to move the temp pointers after deleting the nodes having value x

### Edge Cases Handled
If the last node has value x then point prev node to null.

## Solution

```java
/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        Node prev=temp;
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                    head.prev=null;
                    temp=head;
                    prev=temp;
                }else{
                    if(temp.next!=null){
                        prev.next=temp.next;
                        temp.next.prev=prev;
                        temp=temp.next;
                    }else{
                        prev.next=null;
                        temp=temp.next;
                    }
                }
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}
```
