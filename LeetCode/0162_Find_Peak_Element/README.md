# 0162. Find Peak Element

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-peak-element/)
**Submission Date:** 15 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}
```

### Intuition
find the max element and return the index of that element

### Logic to Be Careful With
find the max element and store it in a variable

### Edge Cases Handled
allllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
