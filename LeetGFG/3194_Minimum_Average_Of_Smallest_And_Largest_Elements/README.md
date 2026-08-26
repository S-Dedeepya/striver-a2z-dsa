# 3194. Minimum Average of Smallest and Largest Elements

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/)  
**Submission Date:** 27 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Pair the smallest with the largest and find the minimum of their averages.

### Lines / Logic To Be Careful With
Average = (a + b) / 2, not (a - b) / 2; use 2.0f for decimal division.

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public double minimumAverage(int[] nums) {
        float res[]=new float[nums.length/2];
        float min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            res[i]=(nums[nums.length-i-1]+nums[i])/2.0f;
        }
        for(int i=0;i<res.length;i++){
            min=Math.min(min,res[i]);
        }
        return min;
    }
}
```
