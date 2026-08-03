# Add 1 to a Linked List Number

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)  
**Submission Date:** 3 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
first reverse the linked list. then add one to head and handle the carry. then again reverse the linked list

### Lines / Logic To Be Careful With
check if carry ==1 after loop ended. if yea then add newnode and connect it in thr front after reversing it.

### Edge Cases Handled
9 -> 10 , single digit converted to two digit after adding 1

## Solution

```java
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        int carry=0;
        head=reverse(head);
        Node temp=head;
        temp.data=temp.data+1;
        while(temp!=null){
            if(temp.data<10){
                carry=0;
                break;
            }
            temp.data=0;
            carry=1;
            if(temp.next!=null){
                temp.next.data+=carry;
            }
            temp=temp.next;
        }
        if(carry==1){
            Node newnode=new Node(1);
            head=reverse(head);
            newnode.next=head;
            return newnode;
        }
        head=reverse(head);
        return head;
        
    }
    public Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        Node front=null;
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
