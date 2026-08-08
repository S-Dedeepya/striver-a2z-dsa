# 0414. Neither Minimum nor Maximum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/neither-minimum-nor-maximum/)  
**Submission Date:** 8 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find the minimum and maximum, then return any element that is neither.

### Lines / Logic To Be Careful With
f all elements are min/max, return -1

### Edge Cases Handled
arrays with only 1–2 distinct values.

## Solution

```java
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                return nums[i];
            }
        }
        return -1;
    }
}
```
