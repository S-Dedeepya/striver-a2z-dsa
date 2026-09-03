# 2181. Linked List Components

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/linked-list-components/)
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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            if(set.contains(temp.val)){
                if(temp.next==null || (!set.contains(temp.next.val))){
                    count++;
                }
            }
            temp=temp.next;
        }
        return count;
    }
}
```

### Intuition
Put all nums values into a HashSet for O(1) lookup.
Traverse the linked list.
A component is a continuous group of nodes whose values are present in nums.
Count the component when the current node is in the set but the next node is not

### Logic to Be Careful With
temp.val must be in the set.
temp.next being null means current node is the last component node.
!set.contains(temp.next.val) means the component ends here.

### Edge Cases Handled
nums = [] → 0
One matching node → 1
All nodes match → 1
Multiple separated groups → count each group
Component ends at last node → temp.next == null handles it.

### Mistakes Made
I was counting when the current value was not in the set:

else if(!set.contains(temp.val))

❌ Wrong.

I was counting nodes instead of counting continuous groups.
I didn't check the next node to determine where a component ends.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
