# 2130. Step 1. Use 2 pointers, one fast and the other slow until fast reaches the end. Put the numbers into the stack while traversing slow pointer.
Step 2. Move slow pointer further, and pop the  stack

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/)
**Submission Date:** 3 Sept 2026
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
    public int pairSum(ListNode head) {
        int count=1;
        int ans=0;
        ListNode temp=head;
        ListNode prev=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int i=0;
        while(i<(count/2)){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=null;
        temp=reverse(temp);
        prev.next=temp;
        ListNode temp1=head;
        while(temp!=null){
            ans=Math.max(temp1.val+temp.val,ans);
            temp=temp.next;
            temp1=temp1.next;
        }
        return ans;
    }
    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode front=null;
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
Count the number of nodes.
Find the start of the second half.
Split the list into 2 halves.
Reverse the second half.
Traverse both halves together and calculate the maximum twin sum.

### Logic to Be Careful With
ount should ideally start from 0, not 1.
prev.next = null → splits the list.
Reverse second half correctly.
Compare first half with reversed second half.
No need to reconnect the two halves.

### Edge Cases Handled
Minimum length = 2.
[1,100000] → 100001.
All values same → 2 × value.
Odd length doesn't need handling (problem guarantees even length).

### Mistakes Made
count = 1 made middle calculation confusing.
Reconnecting with prev.next = temp was unnecessary.
Earlier pointer handling created a cycle → TLE.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
