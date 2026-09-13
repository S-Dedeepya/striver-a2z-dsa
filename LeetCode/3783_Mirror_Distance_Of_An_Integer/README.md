# 3783. Mirror Distance of an Integer

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/mirror-distance-of-an-integer/)
**Submission Date:** 13 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int mirrorDistance(int n) {
        int rev=reverse(n);
        return Math.abs(n-rev);
    }
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
}
```

### Intuition
reverse the int and return the positive value of diference betwwen n and reverse of that int

### Logic to Be Careful With
just be careful with reverse logic

### Edge Cases Handled
all edge cases handled

### Mistakes Made
no mistakes made in this code

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
