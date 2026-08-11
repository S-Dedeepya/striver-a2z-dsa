# 0961. N-Repeated Element in Size 2N Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/)  
**Submission Date:** 11 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
create hashmap, and store nums as key and no.of times repeated as value. find n which is half of numslength and check if any key equals the n value and return that key

### Lines / Logic To Be Careful With
checking if key value is n times

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=(nums.length)/2;
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }else{
                h.put(nums[i],1);
            }
        }
        for(int key:h.keySet()){
            if(h.get(key)==n){
                return key;
            }
        }
        return -1;
    }
}
```
