# 4070. Minimum Rotations to Dial a Number I

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-rotations-to-dial-a-number-i/)
**Submission Date:** 4 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int minRotations(String s) {
        int count=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            int dist1=Math.abs(num-start);
            int dist2=10-dist1;
            count+=(Math.min(dist1,dist2));
            start=num;
        }
        return count;
    }
}
```

### Intuition
Start from digit 0.
For every digit in the string, find the minimum rotations needed to reach it.
Since digits 0–9 are arranged in a circle, there are two ways to reach a digit:- Direct distance
- Wrap-around distance

Add the smaller distance to count.
Update start to the current digit.

### Logic to Be Careful With
int num=s.charAt(i)-'0';

- Converts a character digit into its integer value.
- Example: '5' - '0' = 5.
int dist1=Math.abs(num-start);
int dist2=10-dist1;

- dist1 → direct distance.
- dist2 → circular/wrap-around distance.
- Choose Math.min(dist1,dist2).

### Edge Cases Handled
- Same digit → 0 rotations.
- 0 → 9 → 1 rotation.
- 0 → 5 → 5 rotations.
- 2 → 8 → 4 rotations.

### Mistakes Made
- Initially used:
Integer.valueOf(s.charAt(i))

- This gives the character's ASCII/Unicode value, not the digit.
- Correct:
s.charAt(i)-'0'

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
