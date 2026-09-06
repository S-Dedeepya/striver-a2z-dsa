# 1299. Replace Elements with Greatest Element on Right Side

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)
**Submission Date:** 6 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        return arr;
    }
}
```

### Intuition
For every element, we need the maximum element to its right.
Instead of checking all elements to the right, traverse from right to left.
Maintain a variable max containing the greatest value seen so far.
Replace the current element with max.
Then update max using the original current value.

### Logic to Be Careful With
int current = arr[i];
arr[i] = max;
max = Math.max(max, current);
Save the original value before replacing it.
First current = arr[i]
Then replace arr[i]
Finally update max.

### Edge Cases Handled
Single element: [5] → [-1]
Two elements: [5, 3] → [3, -1]
Already decreasing: [5,4,3,2] → [4,3,2,-1]
All same values: [2,2,2] → [2,2,-1]
Negative values: [-1,-2,-3] → [-2,-3,-1]

### Mistakes Made
replaced arr[i] first.
Then max = arr[i] stored the new value, not the original value.
This loses the original element.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
