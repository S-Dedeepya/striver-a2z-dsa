# 1464. Maximum Product of Two Elements in an Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)  
**Submission Date:** 27 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find first ans second highest element from the array and subtract 1 from both and return its product

### Lines / Logic To Be Careful With
Make sure to assign max1 to max2 before updating the max1 value

### Edge Cases Handled
Not much edge cases there

## Solution

```java
class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
            }else if(max2<nums[i]){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
```
