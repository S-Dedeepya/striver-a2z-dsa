# 1095. Find Indices of Stable Mountains

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-indices-of-stable-mountains/)
**Submission Date:** 15 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public List<Integer> stableMountains(int[] heights, int threshold) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<heights.length;i++){
            if(heights[i-1]>threshold){
                list.add(i);
            }
        }
        return list;
    }
}
```

### Intuition
start from 1st index and check if i-1 index have value that is strictly greater than the given threshold. if yess add to list.

### Logic to Be Careful With
loop condition from 1 to n-1. as mountain 0 can never be stable

### Edge Cases Handled
allllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
