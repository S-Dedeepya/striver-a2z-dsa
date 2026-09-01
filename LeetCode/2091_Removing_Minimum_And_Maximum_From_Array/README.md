# 2091. Removing Minimum and Maximum From Array

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/)
**Submission Date:** 1 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxIndex=0;
        int minIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        if(maxIndex<minIndex){
            return Math.min(Math.min(nums.length-maxIndex,minIndex+1),maxIndex+nums.length-minIndex+1);
        }
        return Math.min(Math.min(nums.length-minIndex,maxIndex+1),minIndex+nums.length-maxIndex+1);
    }
}
```

### Intuition
Find the minimum and maximum indices, then calculate the 3 possible ways to remove both:

From the left
From the right
From both sides

### Logic to Be Careful With
For two indices a < b:

Left only → b + 1
Right only → n - a
Both sides → (a + 1) + (n - b)

### Edge Cases Handled
single element in the array

### Mistakes Made
You swapped the indices in the left-only and right-only calculations. You used the closer index for both, but you need the larger index for left deletion and the smaller index for right deletion.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
