# 0215. Kth Largest Element in an Array

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/kth-largest-element-in-an-array/)
**Submission Date:** 28 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
```

### Intuition
using sorting and return the last kth element

### Logic to Be Careful With
return the nums.length-k index element

### Edge Cases Handled
alllllllllllllllllllllllllllll

### Mistakes Made
nooooooooooooooooooo

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)
