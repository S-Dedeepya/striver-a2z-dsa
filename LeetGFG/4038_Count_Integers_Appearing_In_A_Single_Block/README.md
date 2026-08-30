# 4038. Count Integers Appearing in a Single Block

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-integers-appearing-in-a-single-block/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Every time nums[i] != prev, a new block starts. Count blocks for each number, then count numbers whose block count is exactly 1.

### Lines / Logic To Be Careful With
Compare with the previous element, not just whether the number has appeared before.

### Edge Cases Handled
single element in the array

## Solution

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] blocks = new int[101];
        int prev = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != prev) {
                blocks[nums[i]]++;
                prev = nums[i];
            }
        }

        int ans = 0;

        for(int i = 1; i <= 100; i++) {
            if(blocks[i] == 1) {
                ans++;
            }
        }

        return ans;
    }
}
```
