# 0414. Third Maximum Number

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/third-maximum-number/)  
**Submission Date:** 8 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Track the three largest distinct values in one pass.

### Lines / Logic To Be Careful With
Skip duplicates and use long for MIN_VALUE

### Edge Cases Handled
fewer than 3 distinct values → return the maximum.

## Solution

```java
class Solution {
    public int thirdMax(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max1 || nums[i]==max2||nums[i]==max3) continue;
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }else if(nums[i]>max3){
                max3=nums[i];
            }
        }
        if(max3==Integer.MIN_VALUE){
            return max1;
        }
        return max3;
    }
}
```
