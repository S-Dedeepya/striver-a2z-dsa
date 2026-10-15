# 0941. Example:

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/valid-mountain-array/)
**Submission Date:** 15 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3) return false;
        int i=0;
        while(i<n-1 &&arr[i]<arr[i+1] ){
            i++;
        }
        if(i==0 || i==n-1) return false;
        while(i<n-1){
            if(arr[i]<=arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
```

### Intuition
A valid mountain array must have a strictly increasing part, a peak, and a strictly decreasing part.



First, move i uphill until the increasing sequence stops.



Check that the peak is neither the first nor the last element.



Then move downhill, ensuring every next element is strictly smaller.

### Logic to Be Careful With
if(n < 3) return false; — a mountain needs at least three elements.



while(i < n-1 && arr[i] < arr[i+1]) — moves uphill only while values strictly increase.



if(i == 0 || i == n-1) return false; — rejects arrays with no uphill section or no downhill section.



if(arr[i] <= arr[i+1]) — rejects equal or increasing adjacent values during the downhill phase.

### Edge Cases Handled
alllllllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
