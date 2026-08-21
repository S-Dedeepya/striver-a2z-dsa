# 0011. Container With Most Water

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/container-with-most-water/)  
**Submission Date:** 21 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
set i pointer at 0 index and j at last index and find area between i and j. move the pointer having less value.return highest area.

### Lines / Logic To Be Careful With
for area calc: rigth-left* height[right] if right pointer have less value / height[left] if pointer have left pointer have less value

### Edge Cases Handled
not much edge cases handled

## Solution

```java
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left!=right){
            if(height[left]>=height[right]){
                ans=Math.max(ans,(right-left)*height[right]);
                right--;
            }else{
                ans=Math.max(ans,(right-left)*height[left]);
                left++;
            }
        }
        return ans;
    }
}
```
