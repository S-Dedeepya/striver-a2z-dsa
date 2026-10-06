# 0414. Third Maximum Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/third-maximum-number/)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int thirdMax(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int max1=nums[nums.length-1];
        int max2=0,max3=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=max1){
                max2=nums[i];
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=max2 && nums[i]!=max1){
                return nums[i];
            }
        }
        return max1;
    }
}
```

### Intuition
- First, sort the array using Bubble Sort.
- After sorting, the largest value is at the last index.
- Move from the end to find the second distinct largest value.
- Then move again from the end to find the third distinct largest value.
- If there are fewer than 3 distinct values, return the largest value.

### Logic to Be Careful With
int max1=nums[nums.length-1];

- Since the array is sorted, the last element is the largest.
if(nums[i]!=max1){
    max2=nums[i];
    break;
}

- Find the first different value from the right.
- break is important because that is the second largest.
if(nums[i]!=max2 && nums[i]!=max1){
    return nums[i];
}

- The first value different from both max1 and max2 is the third largest.

### Edge Cases Handled
- [3,2,1] → 1
- [3,2,2,1] → 1
- [3,3,2,2,1] → 1
- [1,2] → 2
- [2,2,2] → 2
- Fewer than 3 distinct values → return the largest.

### Mistakes Made
- Initially, you didn't use break while finding max2.
- Without break, max2 keeps changing and eventually becomes the smallest different value.
- max3 is declared but never used:
int max2=0,max3=0;

You can simply use:

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
