# 2089. Find Target Indices After Sorting Array

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-target-indices-after-sorting-array/)
**Submission Date:** 23 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}
```

### Intuition
sort the array and find the element add that element in the list

### Logic to Be Careful With
sort first search later

### Edge Cases Handled
alllllllllllllllllllllllllllll

### Mistakes Made
noneeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)
