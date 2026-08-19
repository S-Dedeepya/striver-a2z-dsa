# 1550. Three Consecutive Odds

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/three-consecutive-odds/)  
**Submission Date:** 19 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Count consecutive odd numbers and reset when an even number appears.

### Lines / Logic To Be Careful With
Always use arr[i] inside the loop; arr[0] checks only the first element.

### Edge Cases Handled
not much edge cases handled

## Solution

```java
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
                if(count==3){
                    return true;
                }
            }else{
                count=0;
            }
        }
        return false;
    }
}
```
