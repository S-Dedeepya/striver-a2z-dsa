# 1855. Maximum Difference Between Increasing Elements

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-difference-between-increasing-elements/)
**Submission Date:** 16 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]-nums[i]>=0){
                ans=Math.max(ans,nums[j]-nums[i]);
            }else{
                i=j;
            }
        }
        return ans;
    }
}
```

### Intuition
Need to find the maximum nums[j] - nums[i] where j > i.
Keep i as the index of the smallest useful value seen so far.
For every j, calculate the difference.
If nums[j] is smaller than nums[i], update i = j because this smaller value can give a better difference later.

### Logic to Be Careful With
if(nums[j] - nums[i] >= 0)
Only consider valid non-negative differences.
ans = Math.max(ans, nums[j] - nums[i]);
Keep track of the maximum difference found.
else {
    i = j;
}
Current value is smaller than the previous candidate.
Make it the new starting point.

### Edge Cases Handled
Strictly decreasing array → -1
Equal values → 0
Increasing array → last value − first value
Single element → -1 (assuming problem constraints allow it)

### Mistakes Made
nums[j]-nums[i] should always be a number > 0

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
