# 0231. Power of Two

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/power-of-two/)  
**Submission Date:** 5 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(1)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
bitwise end operator between power of 2 and before that number will give zero

### Lines / Logic To Be Careful With
((n & (n - 1)) == 0). write this in if condition, because if written differently then it will error due to operator precedence

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        int res=n & n-1;
        if(res==0) return true;
        else return false;
    }
}
```
