# 0575. Distribute Candies

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/distribute-candies/)  
**Submission Date:** 9 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Find the minimum and maximum, then return any element that is neither.

### Lines / Logic To Be Careful With
dont count duplicates

### Edge Cases Handled
array distinct elements less than length/2

## Solution

```java
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        if(set.size()>(candyType.length/2)){
            return candyType.length/2;
        }
        return set.size();
    }
}
```
