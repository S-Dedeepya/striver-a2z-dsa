# 0278. First Bad Version

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/first-bad-version/)  
**Submission Date:** 27 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
we need to search from 1 to n to find the first bad ver. so apply binary search and find the first bad version.

### Lines / Logic To Be Careful With
if bad version is true after storing mid in bad move right pointer  cuz bad version might exist before this mid. if bad version false then move left pointer.

### Edge Cases Handled
not much edge cases there

## Solution

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        int bad=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                bad=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return bad;
    }
}
```
