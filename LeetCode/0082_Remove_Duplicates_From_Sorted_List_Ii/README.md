# 0082. Remove Duplicates from Sorted List II

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
**Submission Date:** 7 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode prev=dummy;
        while(temp!=null){
            if(temp.next!=null && temp.val==temp.next.val){
                int dup=temp.val;
                while(temp!=null && temp.val==dup){
                    temp=temp.next;
                }
                prev.next=temp;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}

### Intuition
The list is sorted, so duplicate values are always together.
If temp.val == temp.next.val, that value is a duplicate.
We must remove all nodes having that value.
Use prev to point to the last node that is definitely not a duplicate.
Use temp to scan the list.
After skipping the entire duplicate group:

### Logic to Be Careful With
ListNode dummy = new ListNode(0);
dummy.next = head;
dummy helps when duplicates occur at the beginning.
if(temp.next != null && temp.val == temp.next.val)
First check temp.next != null.
Then compare values.
int duplicate = temp.val;
Store the duplicate value before skipping the group.
while(temp != null && temp.val == duplicate) {
    temp = temp.next;
}
Skip every node with the duplicate value.
prev.next = temp;
Connect the previous valid node directly to the first non-duplicate node.
else {
    prev = temp;
    temp = temp.next;
}
Move prev only when temp is confirmed not duplicated.

### Edge Cases Handled
head null,single node,all nodes are duplicated

### Mistakes Made
was removing duplicate nodes one by one instead of removing the entire duplicate group.

Moving:

temp = temp.next;

alone does not remove the node from the linked list.

I used too many conditions involving head, prev, and temp.
Special handling for temp == head made the logic complicated.
I wasn't maintaining a clear distinction:
prev → last safe node
temp → current node being checked

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
