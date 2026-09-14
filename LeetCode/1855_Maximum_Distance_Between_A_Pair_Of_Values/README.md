# 1855. Maximum Distance Between a Pair of Values

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/)
**Submission Date:** 14 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int left=0;
            int right=nums2.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums1[i]<=nums2[mid]){
                    max=Math.max(max,(mid-i));
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return max;
    }
}
```

### Intuition
We need to maximize:
j - i

subject to:

i <= j
nums1[i] <= nums2[j]
For every index i in nums1, use binary search on nums2.
Since nums2 is non-increasing, when nums1[i] <= nums2[mid] is true, try moving left forward to find a larger valid j.
Update max with mid - i.
Binary Search
if(nums1[i] <= nums2[mid]){
    max = Math.max(max, mid - i);
    left = mid + 1;
}
Current mid is valid.
Move right to search for an even larger valid index.
else{
    right = mid - 1;
}
nums2[mid] is too small.
Search the left side.
Important Condition
nums1[i] <= nums2[mid]

The pair is valid only when this condition holds.

Also:

mid - i

is the distance we want to maximize.

### Logic to Be Careful With
i comes from nums1.
mid represents j from nums2.
We need i <= j.
The binary search should find the farthest valid j, not just any valid j.
nums1 and nums2 are already sorted in non-increasing order, which allows binary search.

### Edge Cases Handled
No valid pair → answer 0.
i == j → distance 0.
First element of nums1 may pair with the last valid element of nums2.
Arrays with one element.

### Mistakes Made
using o(n^2) approach

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)
