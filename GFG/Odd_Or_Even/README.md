# Odd or Even

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/odd-or-even3618/1)
**Submission Date:** 8 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    static boolean isEven(int n) {
        return (n|1)!=n;
    }
}
```

### Intuition
Journal Notes — Check Even Using Bit Manipulation
Intuition
- The last bit tells whether a number is even or odd.
- Even → last bit is 0.
- Odd → last bit is 1.
- n | 1 forces the last bit to 1.
- If n is even, this changes the number → n | 1 != n.
- If n is odd, it stays the same → n | 1 == n.

### Logic to Be Careful With
return (n | 1) != n;

### Edge Cases Handled
alllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(1)  
**Space Complexity:** O(1)
