# 1431. Kids With the Greatest Number of Candies

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)  
**Submission Date:** 30 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
First find the max element in the array.Then check if candies in that index + extracandies is greater than the max element. if yea add true else false

### Lines / Logic To Be Careful With
check if candies at index + extracandies is greater than max element of the array

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
```
