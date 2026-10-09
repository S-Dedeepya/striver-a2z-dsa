# Merge Sort

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/merge-sort/1)
**Submission Date:** 9 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public void mergeSort(int arr[], int l, int r) {
        if(l==r) return;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    public static void merge(int[] arr,int l,int m,int r){
        int ls=m-l+1;
        int rs=r-m;
        int[] la=new int[ls];
        int[] ra=new int[rs];
        for(int i=0;i<ls;i++){
            la[i]=arr[l+i];
        }
        for(int i=0;i<rs;i++){
            ra[i]=arr[m+1+i];
        }
        int k=l;
        int i=0;
        int j=0;
        while(i<ls && j<rs){
            if(la[i]<ra[j]){
                arr[k++]=la[i++];
            }else{
                arr[k++]=ra[j++];
            }
        }
        while(i<ls){
            arr[k++]=la[i++];
        }
        while(j<rs){
            arr[k++]=ra[j++];
        }
    }
}
```

### Intuition
Merge sort uses divide and conquer.



Divide the array into two halves recursively until each subarray contains one element.



Merge the two sorted halves into a single sorted section.



Continue merging until the entire array is sorted.

### Logic to Be Careful With
if(l==r) return;


→ Base case: a single-element subarray is already sorted.
int m=(l+r)/2;


→ Find the middle index to divide the array.
mergeSort(arr,l,m);
mergeSort(arr,m+1,r);


→ Sort the left and right halves independently.
if(la[i]<ra[j])


→ Compare the front elements of both temporary arrays and copy the smaller one. Using < instead of <= is correct, but equal elements will be taken from the right half first.
while(i<ls)
while(j<rs)


→ Copy any remaining elements after one half is exhausted.

### Edge Cases Handled
alllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)
