# 3718. Smallest Missing Multiple of K

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-missing-multiple-of-k/)  
**Submission Date:** 25 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
create hashset and store arr elements in it. check the  multiples of k one after one if present in the hashset. if not then return that num that is not present

### Lines / Logic To Be Careful With
for multiples for k, it is a=k*i; where i is multiples from 1 to n. multiples of i stored in the a variable

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int a=k,i=1;
        while(k!=0){
            if(!set.contains(a)){
                return a;
            }
            a=i*k;
            i++;
        }
        return -1;
    }
}
```
