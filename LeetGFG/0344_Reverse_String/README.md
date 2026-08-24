# 0344. Reverse String

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-string/)  
**Submission Date:** 24 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
place two pointers one at 0 index and another at last index . and swap them and increment until i<j

### Lines / Logic To Be Careful With
the while condition should be i<j

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp= s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
```
