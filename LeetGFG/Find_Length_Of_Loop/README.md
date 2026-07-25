# Find length of Loop

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/find-length-of-loop/1)  
**Submission Date:** 25 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Detect the loop. Now move fast to the next node and increment count until fast reach the slow. then return count

### Lines / Logic To Be Careful With
Make sure to move fast to next node after detecting the loop

### Edge Cases Handled
Not much edge cases involved

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
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node slow=head;
        Node fast=head;
        int count=1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                while(slow!=fast){
                    fast=fast.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
```
