# 0912. Sort an Array

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/sort-an-array/)
**Submission Date:** 12 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums,int left,int right){
        int mid=(left+right)/2;
        if(left<right){
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public static void merge(int[] nums,int l,int m,int r){
        int ls=m-l+1;
        int rs=r-m;
        int[] left=new int[ls];
        int[] right=new int[rs];
        for(int i=0;i<ls;i++){
            left[i]=nums[l+i];
        }
        for(int i=0;i<rs;i++){
            right[i]=nums[m+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<ls && j<rs){
            if(left[i]<right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }
        while(i<ls){
            nums[k++]=left[i++];
        }
        while(j<rs){
            nums[k++]=right[j++];
        }
    }
}
```

### Intuition
merge sort algorithm

### Logic to Be Careful With
merge sort algorithm

### Edge Cases Handled
alllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)

## Solution 2

```java
class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
    public static void quicksort(int[] nums,int left,int right){
        if(left>=right) return;
        int pivot=partition(nums,left,right);
        quicksort(nums,left,pivot-1);
        quicksort(nums,pivot+1,right);
    }
    public static int partition(int[] nums,int l,int r){
        int last=r;
        int i=l;
        for(int j=l;j<r;j++){
            if(nums[j]<nums[last]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        int temp=nums[last];
        nums[last]=nums[i];
        nums[i]=temp;
        return i;
    }
}
```

### Intuition
quicksortttttttttttttttttttttttttt

### Logic to Be Careful With
this will fail for this leetcode problem because choosing first/last will give tle

### Edge Cases Handled
largeeeeeeeeeeeeee arrayyyyyyyyyyyyyyy

### Mistakes Made
code correct but cannot be accepted

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)
