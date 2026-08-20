# 1486. XOR Operation in an Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/xor-operation-in-an-array/)  
**Submission Date:** 20 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
create an array where array[i]=start+2*i and store the value in that index. then perform xor on that array elements

### Lines / Logic To Be Careful With
array elements should be start+2*i

### Edge Cases Handled
not much edge cases handled

## Solution

```java
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
```
