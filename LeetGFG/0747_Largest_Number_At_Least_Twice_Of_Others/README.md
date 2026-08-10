# 0747. Largest Number At Least Twice of Others

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/largest-number-at-least-twice-of-others/)  
**Submission Date:** 10 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
if i find second highest and check if twice of that is atleast same or equal to highest then automatically every element other than second highest will be atleast twice of that highest.

### Lines / Logic To Be Careful With
store the index while finding highest number

### Edge Cases Handled
no element is atleast as twice as highest return -1

## Solution

```java
class Solution {
    public int dominantIndex(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
                index=i;
            }else if(max2<nums[i]){
                max2=nums[i];
            }
        }
        if(max2*2<=max1){
            return index;
        }
        return -1;
    }
}
```
