# 2441. Largest Positive Integer That Exists With Its Negative

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/)  
**Submission Date:** 28 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
first sort array. create hashset and store all negative numbers. then start from the last index of array to check if max positive num is present in hashset as negative. if yeas return else return -1

### Lines / Logic To Be Careful With
while adding negative num in the hashset first check if i<nums.length and then if nums[i]<0

### Edge Cases Handled
array of negative nums and array of positive nums

## Solution

```java
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        while(i<nums.length && nums[i]<0){
            set.add(nums[i]);
            i++;
        }
        for(int j=nums.length-1;j>=0;j--){
            if(set.contains(-(nums[j]))){
                return nums[j];
            }
        }
        return -1;
    }
}
```
