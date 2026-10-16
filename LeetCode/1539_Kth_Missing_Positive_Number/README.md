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

## Solution 2

```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int j=0;
        int ans=0;
        while(k>0 && i<arr.length){
            if(arr[i]!=j+1){
                ans=j+1;
                k--;
            }else{
                i++;
            }
            j++;
        }
        while(k>0){
            ans=j+1;
            j++;
            k--;
        }
        return ans;
    }
}
```

### Intuition
without using extra space but o(n) complexity

### Logic to Be Careful With
decrementing k and incrementing i,j

### Edge Cases Handled
allllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
