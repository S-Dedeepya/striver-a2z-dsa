# Second Largest

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/second-largest3735/1)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int getSecondLargest(int[] arr) {
        int max1=-1;
        int max2=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        return max2;
    }
}
```

### Intuition
Find the second largest distinct element in one pass.
Maintain two variables:- max1 → largest
- max2 → second largest

When a new largest is found, the old largest becomes the second largest.
Otherwise, if the current value is between max1 and max2, update max2.

### Logic to Be Careful With
if(arr[i]>max1){
    max2=max1;
    max1=arr[i];
}

- New largest found.
- Shift the old largest into max2.
else if(arr[i]>max2 && arr[i]!=max1){
    max2=arr[i];
}

- Update second largest only if:
  - Current value is greater than max2.
  - Current value is different from the largest.

### Edge Cases Handled
all repeated elements, single element no max2.

### Mistakes Made
No mistakes in your code. ✅
arr[i] != max1 correctly prevents duplicates of the largest from being considered as the second largest.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
