# 3471. Find the Largest Almost Missing Integer

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-the-largest-almost-missing-integer/)  
**Submission Date:** 18 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find elements that appear in exactly one subarray of size k; for 1 < k < n, only the first and last elements can qualify.

### Lines / Logic To Be Careful With
k == 1 is a special case—find the largest unique element; k == n means the whole array is one subarray.

### Edge Cases Handled
First and last elements are same, no unique candidate → -1, and fewer than 3 distinct elements.

## Solution

```java
class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            return large(nums);
        }
        if(k==1){
            int max=-1;
            for(int i=0;i<nums.length;i++){
                if(check(nums,nums[i])==1){
                    max=Math.max(max,nums[i]);
                }
            }
        return max;
        }
        if(nums[0]!=nums[n-1]){
            if(check(nums,nums[0])==1 && check(nums,nums[n-1])==1){
                return Math.max(nums[0],nums[n-1]);
            }
            if(check(nums,nums[0])==1){
                return nums[0];
            }
            if(check(nums,nums[n-1])==1){
                return nums[n-1];
            }
        }else{
            if(check(nums,nums[0])==1){
                return nums[0];
            }
        }
        return -1;
    }
    public static int large(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public static int check(int[] nums,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }
        return count;
    }
}
```
