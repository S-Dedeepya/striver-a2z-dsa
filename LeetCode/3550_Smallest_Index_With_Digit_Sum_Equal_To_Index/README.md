# 3550. Smallest Index With Digit Sum Equal to Index

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/)
**Submission Date:** 24 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=digitsum(nums[i]);
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
    public static int digitsum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n/=10;
        }
        return sum;
    }
}
```

### Intuition
index equals sum of all digits of a number present in that index then return that index value. else if no such index return -1;

### Logic to Be Careful With
index should be checked with sum of digits of the number present in that index

### Edge Cases Handled
single digit number, no digit sum equals with index

### Mistakes Made
no mistakes madeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
