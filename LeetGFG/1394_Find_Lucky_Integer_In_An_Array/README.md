# 1394. Find Lucky Integer in an Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-lucky-integer-in-an-array/)  
**Submission Date:** 29 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Create Hashmap and store nums[i] as key adn no.of times its repeated as value. if both key and value are same then its lucky number. if there are multiple lucky number return max of it. if none return -1

### Lines / Logic To Be Careful With
keep max as -1 (for no lucky number), be careful with map functions

### Edge Cases Handled
no lucky number in the array

## Solution

```java
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=-1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==map.get(arr[i])){
                max=Math.max(arr[i],max);
            }
        }
        return max;
    }
}
```
