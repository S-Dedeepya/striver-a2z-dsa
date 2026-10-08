# 0231. Power of Two

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/power-of-two/)
**Submission Date:** 8 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return  (n & (n-1))==0;
    }
}
```

### Intuition
- A power of 2 has exactly one 1 bit in binary.
- Subtracting 1 changes that 1 into 0 and all bits after it into 1.
- Therefore:
n & (n-1) = 0

for powers of 2

### Logic to Be Careful With
if(n<=0) return false;

→ Important because 0 also satisfies n & (n-1) == 0, but 0 is not a power of 2.

### Edge Cases Handled
n==0 and negative numbers

### Mistakes Made
edge casessssssssssssssssssss

**Time Complexity:** O(1)  
**Space Complexity:** O(1)
