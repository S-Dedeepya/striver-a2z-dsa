# Add 1 to a Linked List Number

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)
**Submission Date:** 7 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

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
        head=reverse(head);
        Node temp=head;
        Node prev=null;
        int carry=1;
        while(temp!=null){
            int sum=temp.data+carry;
            temp.data=(sum)%10;
            carry=(sum)/10;
            if(carry==0){
                head=reverse(head);
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        if(carry==1){
            Node newnode=new Node(carry);
            prev.next=newnode;
        }
        head=reverse(head);
        return head;
    }
    public static Node reverse(Node head){
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

### Intuition
The number is stored from most significant digit → least significant digit.
Reverse the list so we can start adding from the last digit.
Start with carry = 1 because we need to add one.
For every node:
Calculate sum = digit + carry
Store sum % 10 as the digit.
Store sum / 10 as the carry.
If carry becomes 0, reverse back and return.
If carry is still 1 after the last node, add a new node.
Reverse again to restore the original order.

### Logic to Be Careful With
int carry = 1;
Start with 1, since the operation is +1.
int sum = temp.data + carry;
temp.data = sum % 10;
carry = sum / 10;
Calculate sum before changing temp.data.
% 10 → new digit.
/ 10 → carry.
if(carry == 0){
    head = reverse(head);
    return head;
}
Once there is no carry, no further nodes need to be changed.
if(carry == 1){
    Node newnode = new Node(carry);
    prev.next = newnode;
}
Needed when every digit was 9.

### Edge Cases Handled
all 9's, single digit, one 9

### Mistakes Made
Initially started with:

carry = 0;

but since we are adding 1, the initial carry should be 1.

Initially calculated carry after modifying the digit:

temp.data = (...);
carry = (temp.data + 1) / 10;

This uses the new digit, so carry can become incorrect.

Correct pattern:

sum → digit → carry

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
