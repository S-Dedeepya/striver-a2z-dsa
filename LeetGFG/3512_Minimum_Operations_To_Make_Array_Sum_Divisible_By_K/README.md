# 3512. Minimum Operations to Make Array Sum Divisible by K

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/)  
**Submission Date:** 16 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find the total sum; the minimum operations needed is the remainder when the sum is divided by k.

### Lines / Logic To Be Careful With
Use sum % k. return the remainder

### Edge Cases Handled
not much edge cases there

## Solution

```java
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}
```
