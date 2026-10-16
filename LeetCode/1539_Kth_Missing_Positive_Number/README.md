# 1539. Kth Missing Positive Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/kth-missing-positive-number/)
**Submission Date:** 16 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] r=new int[k];
        int j=1;
        int i=0;
        int index=0;
        while(index<r.length && i<arr.length){
            if(arr[i]!=j){
                r[index++]=j;
            }else{
                i++;
            }
            j++;
        }
        while(index<r.length){
            r[index++]=j++;
        }
        return r[k-1];
    }
}
```

### Intuition
brute forceeeeeeeeeeeee

### Logic to Be Careful With
finding the missing valueee

### Edge Cases Handled
alllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
