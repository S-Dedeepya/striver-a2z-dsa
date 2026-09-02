# 2540. Error: Time Limit Exceeded

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-common-value/)
**Submission Date:** 2 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ans=-1;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums2[j]>nums1[i]){
                i++;
            }else if(nums1[i]==nums2[j]){
                ans=nums1[i];
                return ans;
            }else{
                j++;
            }
        }
        return ans;
    }
}
```

### Intuition
one pointer at first index of array, another at first index of another array. move first pointer if value at that index is less than the another. move the other one if otherwise. if both same then return the number.

### Logic to Be Careful With
be careful with what pointers to move at what condition.

### Edge Cases Handled
no common element between the two arrays

### Mistakes Made
dont assume that if first index val of first array is greater than the first index value at another array as no common elements present

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
