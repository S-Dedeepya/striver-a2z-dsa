# 0258. Add Digits

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/add-digits/)
**Submission Date:** 22 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return 1+(num-1)%9;
    }
}
```

### Intuition
We need to repeatedly add the digits until only one digit remains.
Instead of using a loop, use the digital root.
A number and its digit sum have the same remainder when divided by 9.
Therefore, the answer follows the pattern 1 → 9 → 1 → 9...

### Logic to Be Careful With
if(num == 0) return 0;
0 is a special case because its digital root is 0.
return 1 + (num - 1) % 9;
(num - 1) handles multiples of 9.
Without -1, numbers like 9, 18, 27 would incorrectly give 0.

### Edge Cases Handled
num = 0 → 0
single digit return the same

### Mistakes Made
Initially, the % 9 idea can be confusing because:
18 % 9 = 0
but digit sum of 18 is 9.
So simply using num % 9 is not enough.
Need:
1 + (num - 1) % 9

**Time Complexity:** O(1)  
**Space Complexity:** O(1)
