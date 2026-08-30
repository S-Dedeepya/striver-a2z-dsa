# 4038. Count Integers Appearing in a Single Block

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-integers-appearing-in-a-single-block/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Track when a new block starts using last; mark each number as 1 for one block and -1 when it appears in multiple blocks.

### Lines / Logic To Be Careful With
Update last = nums[i] every iteration, even when the number is already marked -1.I initially thought last = 0 was the issue, but nums[i] >= 1, so it was valid.
The real bug was not updating last when arr[nums[i]] == -1.
This caused the next occurrence of that value to be incorrectly treated as part of the previous block.Single element → 1; repeated value in separate blocks → not counted; consecutive duplicates belong to the same block.

### Edge Cases Handled
Single element → 1; repeated value in separate blocks → not counted; consecutive duplicates belong to the same block.

## Solution

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
       if(nums.length==1) return 1;
       int[] arr=new int[101];
        int last=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(last!=nums[i] && arr[nums[i]]!=-1 && arr[nums[i]]==0){
                arr[nums[i]]++;
                last=nums[i];
            }else if(last!=nums[i] && arr[nums[i]]==1){
                arr[nums[i]]=-1;
                last=nums[i];
            }
            last=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                res++;
            }
        }
        return res;
    }
}
```
