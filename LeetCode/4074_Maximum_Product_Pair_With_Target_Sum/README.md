# 4074. Maximum Product Pair With Target Sum

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-product-pair-with-target-sum/)
**Submission Date:** 12 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int product=Integer.MIN_VALUE;
        int[] ans=new int[]{-1,-1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target && nums[i]!=nums[j]){
                    if(nums[i]*nums[j]>=product){
                        ans[0]=(nums[i]>nums[j])?i:j;
                        ans[1]=(nums[j]<nums[i])?j:i;
                        product=nums[i]*nums[j];
                    }
                }
            }
        }
        return ans;
    }
}
```

### Intuition
Use two nested loops to check every pair of distinct indices (i, j).



If nums[i] + nums[j] == target and the values are different, calculate their product.



Keep the pair with the maximum product found so far.



If no valid pair exists, return [-1, -1].

### Logic to Be Careful With
j = i + 1 avoids checking the same element twice or repeating a pair in reverse order.



nums[i] != nums[j] ensures the two values are different, as required.



nums[i] * nums[j] >= product allows a later pair to replace an earlier pair when their products are equal.



ans[0] = j; ans[1] = i; stores the indices in reverse order. Check whether the problem requires the larger index first.

### Edge Cases Handled
No valid pair → returns [-1, -1].



Multiple valid pairs → keeps the pair with the greatest product.



Equal products → the latest matching pair wins because of >=.



Negative numbers → handled correctly if multiplication does not overflow.

### Mistakes Made
Potential issue: If the problem requires the pair of indices in a specific order, make sure your assignment matches that requirement.

**Time Complexity:** O(n^2)  
**Space Complexity:** O(n)
