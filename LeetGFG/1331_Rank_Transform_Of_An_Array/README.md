# 1331. Intuition

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/rank-transform-of-an-array/)  
**Submission Date:** 29 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Make a temp array copy of given arr. sort it then store that in hashmap with ranks. with help of hashmap assign ranks in the original array

### Lines / Logic To Be Careful With
while putting in hash map, check if that num already present in the hashmap. if yes then skip putting that value in hashmap.

### Edge Cases Handled
Duplicate values present in the array

## Solution

```java
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap <Integer,Integer> h=new HashMap<>();
        int[] copy=arr.clone();
        int rank=1;
        Arrays.sort(copy);
        for(int i=0;i<copy.length;i++){
            if(!h.containsKey(copy[i])){
                h.put(copy[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=h.get(arr[i]);
        }
        return arr;
    }
}
```
