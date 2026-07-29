# 1768. Merge Strings Alternately

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/merge-strings-alternately/)  
**Submission Date:** 29 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Add char by char simultaneously in the sb with the hep of i pointer at word1 and j pointer at word2.
if any string is greater than other then add all of that string until it reaches its length

### Lines / Logic To Be Careful With
Add the remaining letters of the longer length string

### Edge Cases Handled
if any one of the string is greater than the other

## Solution

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i!=word1.length() && j!=word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i!=word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j!=word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
```
