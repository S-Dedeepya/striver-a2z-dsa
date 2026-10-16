# 0268. Missing Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/missing-number/)
**Submission Date:** 16 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int j=0;
            while(j<nums.length){
                if(nums[j]==i) break;
                j++;
            }
            if(j>=nums.length){
                return i;
            }
        }
        return 0;
    }
}
```

### Intuition
brute forceeeeeeeeeeeeeeeeee

### Logic to Be Careful With
alllllllllllllllllllll

### Edge Cases Handled
allllllllllllllllllllllllllll

### Mistakes Made
nooooooooooooooooooo

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)

## Solution 2

```java
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
```

### Intuition
using sorting technique

### Logic to Be Careful With
finding the answerrrrrr

### Edge Cases Handled
alllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)
