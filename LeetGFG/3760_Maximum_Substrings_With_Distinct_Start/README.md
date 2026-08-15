# 3760. Maximum Substrings With Distinct Start

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-substrings-with-distinct-start/)  
**Submission Date:** 15 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
create hashset and add characters that are not there in hashset and return set size

### Lines / Logic To Be Careful With
add only if the character not present in the hashset

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        return set.size();
    }
}
```
