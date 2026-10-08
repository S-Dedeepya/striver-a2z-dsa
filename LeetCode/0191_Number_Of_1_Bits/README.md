# 0191. Number of 1 Bits

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/number-of-1-bits/)
**Submission Date:** 8 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}
```

### Intuition
Hamming weight = number of 1s in the binary representation.
Check the last bit using n & 1.
If it is 1, increment count.
Divide by 2 to move to the next bit.

### Logic to Be Careful With
if((n&1)==1)

→ checks whether the current/rightmost bit is 1.
n/=2;

→ removes the rightmost bit and moves to the next bit.

### Edge Cases Handled
allllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(1)  
**Space Complexity:** O(1)
