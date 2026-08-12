# 1346. Check If N and Its Double Exist

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/check-if-n-and-its-double-exist/)  
**Submission Date:** 12 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
For each number, check whether its double or half already exists.

### Lines / Logic To Be Careful With
Store the actual array values in the HashSet, not arr[i] * 2.
Check arr[i] * 2 directly for a matching double.
Check arr[i] / 2 only when arr[i] is even.
Add the current value to the set after checking, so you don't compare the number with itself.
Be careful with 0, because 0 * 2 = 0; previous 0 must exist.

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]*2)){
                return true;
            }
            if(arr[i]%2==0 && set.contains(arr[i]/2)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
```
