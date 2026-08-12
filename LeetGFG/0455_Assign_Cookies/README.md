# 0455. Assign Cookies

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/assign-cookies/)  
**Submission Date:** 12 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Sort arrays and use two pointers for checking s[i]>=g[i]

### Lines / Logic To Be Careful With
one cookie can satisfy only one child

### Edge Cases Handled
not much edge cases present

## Solution

```java
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int count=0;
        while(i<s.length && j< g.length){
            if(s[i]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
```
