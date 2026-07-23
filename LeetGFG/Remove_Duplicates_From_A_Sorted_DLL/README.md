# Remove duplicates from a sorted DLL

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1)  
**Submission Date:** 23 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Create temp and prev pointers
start loop and check if temp and temp next data is same. if same check if temp is head. if head then move head pointer,prev,temp. if its not head then connect the prev to temp next node.

### Lines / Logic To Be Careful With
Remember to connect prev pointer of node to prev nodes.
if head is moved to next then make sure the after moving it, point prev pointer of that head node to null

### Edge Cases Handled
Head is null, return null

## Solution

```java
/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        Node temp=head;
        Node prev=null;
        if(head==null) return null;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                if(temp==head){
                    head=head.next;
                    head.prev=null;
                    temp=head;
                    prev=temp;
                }else{
                    prev.next=temp.next;
                    temp.next.prev=prev;
                    temp=temp.next;
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
