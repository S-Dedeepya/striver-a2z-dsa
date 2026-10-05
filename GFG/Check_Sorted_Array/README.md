# Check Sorted Array

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1)
**Submission Date:** 5 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
```

### Intuition
check element with the next element if next id smaller than current then return fasle else return true;

### Logic to Be Careful With
the current element is greater than the next element then it is not sorted

### Edge Cases Handled
allllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
