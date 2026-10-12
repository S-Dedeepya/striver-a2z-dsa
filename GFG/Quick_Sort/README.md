# Quick Sort

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/quick-sort/1)
**Submission Date:** 12 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public void quickSort(int[] arr, int low, int high) {
       if(low>=high) return;
       int pi=partition(arr,low,high);
       quickSort(arr,low,pi-1);
       quickSort(arr,pi+1,high);
    }

    private int partition(int[] arr, int low, int high) {
        int i=low;
		for(int j=low;j<high;j++){
		    if(arr[j]<arr[high]){
			    int temp=arr[j];
			    arr[j]=arr[i];
			    arr[i]=temp;
			    i++;
		    }
		}
		int temp=arr[high];
		arr[high]=arr[i];
		arr[i]=temp;			
        return i;
    }
}
```

### Intuition
Quick Sort uses divide and conquer to sort the array.



Choose the last element as the pivot.



Partition the array so that elements smaller than the pivot move to its left.



Place the pivot in its correct sorted position.



Recursively sort the left and right partitions.

### Logic to Be Careful With
- if(low >= high) return; — stops recursion when the subarray has zero or one element.
- for(int j = low; j < high; j++) — excludes the pivot from the comparison loop.
- if(arr[j] < arr[high]) — compares each element with the last element, which is the pivot.
- i tracks the position where the next smaller element should go.
- The final swap places the pivot at index i, and return i gives its correct position.
- quickSort(arr, low, pi - 1) and quickSort(arr, pi + 1, high) sort the two partitions without including the pivot again.

### Edge Cases Handled
Empty array: handled if called with low = 0, high = -1.



Single element: recursion stops immediately.



Already sorted or reverse-sorted array: works correctly, but performance degrades.



Duplicate elements: sorted correctly, though many duplicates can lead to poor performance.

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)
