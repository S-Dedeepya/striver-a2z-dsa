# 3736. Minimum Moves to Equal Array Elements III

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/)
**Submission Date:** 23 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count+(max-nums[i]);
        }
        return count;
    }
}
```

### Intuition
Find the maximum element in the array.
For every element, calculate how far it is from the maximum: max - nums[i].
Add all these differences.
This gives the total number of moves required to make all elements equal to the maximum.

### Logic to Be Careful With
max=Math.max(max,nums[i]);
Find the maximum first.
count=count+(max-nums[i]);
Add the difference between the maximum and current element.

### Edge Cases Handled
Single element → 0
All elements equal → 0
Maximum appears multiple times → those elements contribute 0
Negative numbers → still works.

### Mistakes Made
None in the final code.
Important: don't modify max while calculating the differences.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
