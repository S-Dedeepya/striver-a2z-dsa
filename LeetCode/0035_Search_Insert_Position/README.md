# 0035. Search Insert Position

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/search-insert-position/)
**Submission Date:** 13 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return left;
    }
}
```

### Intuition
- Use binary search on the sorted array to find the target.
- If the target exists, return its index.
- If it doesn't exist, return the position where it should be inserted to maintain sorted order.

### Logic to Be Careful With
int right = nums.length - 1; — sets the last valid array index.



while(left <= right) — continues searching while the search range is valid.



int mid = (left + right) / 2; — finds the middle index. For safer overflow handling, use left + (right - left) / 2.



nums[mid] > target → search the left half.



nums[mid] < target → search the right half.



return left; — returns the correct insertion position when the target isn't found.

### Edge Cases Handled
Target is smaller than every element → returns 0.



Target is greater than every element → returns nums.length.



Target already exists → returns its index.



Empty array → returns 0.

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
