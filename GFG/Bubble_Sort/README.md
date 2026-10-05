# Bubble Sort

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/bubble-sort/1)
**Submission Date:** 5 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public void bubbleSort(int[] arr) {
       for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr.length;j++){
               if(arr[j-1]>arr[j]){
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
    }
}
```

### Intuition
for every index i, check if arr[j]<arr[j-1] yes then continue else swap. like that check for i iterations

### Logic to Be Careful With
index j should be from 1 to arr.length

### Edge Cases Handled
allllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
