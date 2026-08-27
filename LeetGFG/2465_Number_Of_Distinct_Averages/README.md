# 2465. Approach

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/number-of-distinct-averages/)  
**Submission Date:** 27 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Create hashset and sory nums. find avg for first and last and store the value in set. and increment. do this until we reach the half the length of the array. and then return set size

### Lines / Logic To Be Careful With
for storing avg... use (nums[i]+nums[nums.length-1-i])/2.0f

### Edge Cases Handled
not much edge cases there

## Solution

```java
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Float> set=new HashSet<>();
        for(int i=0;i<(nums.length/2);i++){
            set.add((nums[i]+nums[nums.length-1-i])/2.0f);
        }
        return set.size();
    }
}
```
