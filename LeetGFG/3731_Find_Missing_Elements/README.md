# 3731. Find Missing Elements

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-missing-elements/)  
**Submission Date:** 7 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
find min and max value in the array, then check every element between min and max present in the array, if no then add it to the list

### Lines / Logic To Be Careful With
checking if element present means searching method need to be used

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        while(min!=max){
            if(find(nums,min)){
                min++;
            }else{
                list.add(min);
                min++;
            }
        }
        return list;
    }
    public static boolean find(int[] nums,int n){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                return true;
            }
        }
        return false;
    }
}
```
