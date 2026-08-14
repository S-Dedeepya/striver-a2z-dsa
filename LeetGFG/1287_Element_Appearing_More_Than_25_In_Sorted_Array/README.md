# 1287. Element Appearing More Than 25% In Sorted Array

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/)  
**Submission Date:** 14 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Count consecutive occurrences and return the element occurring more than n/4 times.

### Lines / Logic To Be Careful With
check if count1>count and also make count1 as 1 if ele !=arr[i]

### Edge Cases Handled
not much edge cases handled

## Solution

```java
class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=arr.length/4;
        int count1=0;
        int i=0;
        int ele=arr[0];
        while(i<arr.length){
            if(ele==arr[i]){
                count1++;
            }else{
                if(count1>count){
                    return ele;
                }else{
                    count1=1;
                    ele=arr[i];
                }
            }
            i++;
        }
        if(count1>count){
            return ele;
        }
        return -1;
    }
}
```
