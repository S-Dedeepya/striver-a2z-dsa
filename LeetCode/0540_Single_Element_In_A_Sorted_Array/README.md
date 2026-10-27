# 0540. Hint

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/single-element-in-a-sorted-array/)
**Submission Date:** 27 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums.length==1) return nums[0];
        while(left<=right){
            int mid=(left+right)/2;
            if(mid%2==0){
                if(mid<nums.length-1 && nums[mid]==nums[mid+1]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }else{
                if(mid>=0 && nums[mid]==nums[mid-1]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return nums[left];
    }
}
```

### Intuition
apply binary search and find the answer

### Logic to Be Careful With
check if mid is even and beside element is same then move left else right. if midd odd then check if behind element is same if yeas move left else right

### Edge Cases Handled
alllllllllllllllllllllllllllllll

### Mistakes Made
noneeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
