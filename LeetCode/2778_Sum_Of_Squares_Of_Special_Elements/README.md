# 2778. Sum of Squares of Special Elements

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/sum-of-squares-of-special-elements/)
**Submission Date:** 12 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                sum+=(nums[i]*nums[i]);
            }
        }
        return sum;
    }
}
```

### Intuition
You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums.

### Logic to Be Careful With
n % (i + 1) == 0 — use i + 1 because the problem uses 1-based indexing, while Java arrays use 0-based indexing.



nums[i] * nums[i] — squares the selected element.



sum += ... — accumulates the squares.

### Edge Cases Handled
Single element: Its index is 1, which always divides n.



No negative values? Negative elements are also handled correctly because squaring makes them non-negative.



Empty array: Returns 0; however, the problem generally guarantees a non-empty array.

### Mistakes Made
nopeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
