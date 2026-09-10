# 3232. Find if Digit Game Can Be Won

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-if-digit-game-can-be-won/)
**Submission Date:** 10 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                sum2+=nums[i];
            }else{
                sum1+=nums[i];
            }
        }
        if(sum1==sum2) return false;
        return true;
    }
}
```

### Intuition
find single digit sum, double digit sum in the array and check if both same return false else true. alice always wins

### Logic to Be Careful With
noneeeeeeeeeeeeeeeeeeeeeeeeeeeeee

### Edge Cases Handled
alll edge cases handled

### Mistakes Made
noneeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
