# 4038. Count Integers Appearing in a Single Block

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-integers-appearing-in-a-single-block/)  
**Submission Date:** 30 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

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

### Intuition
Track when a new block starts using last; mark each number as 1 for one block and -1 when it appears in multiple blocks.

### Logic to Be Careful With
Update last = nums[i] every iteration, even when the number is already marked -1

### Edge Cases Handled
Single element → 1; repeated value in separate blocks → not counted; consecutive duplicates belong to the same block.

### Mistakes Made
I initially thought last = 0 was the issue, but nums[i] >= 1, so it was valid.
The real bug was not updating last when arr[nums[i]] == -1.
This caused the next occurrence of that value to be incorrectly treated as part of the previous block.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

## Solution 2

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] blocks = new int[101];
        int prev = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != prev) {
                blocks[nums[i]]++;
                prev = nums[i];
            }
        }

        int ans = 0;

        for(int i = 1; i <= 100; i++) {
            if(blocks[i] == 1) {
                ans++;
            }
        }

        return ans;
    }
}
```

### Intuition
Every time nums[i] != prev, a new block starts. Count blocks for each number, then count numbers whose block count is exactly 1.

### Logic to Be Careful With
Compare with the previous element, not just whether the number has appeared before.

### Edge Cases Handled
single element in the array

### Mistakes Made
Update last = nums[i] every iteration, even when the number is already marked -1.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
