# 3536. Maximum Product of Two Digits

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-product-of-two-digits/)  
**Submission Date:** 26 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Declare two max variables. Inside the loop start checking if max1 or max2 is less than ones digit of the number. if max1 is less than assign max1 to max2 and store that ones digit in max1. else assign it in max2. then remove the ones digit and starting checking again until num becomes zero.

### Lines / Logic To Be Careful With
Assigning max1 to max1

### Edge Cases Handled
Not much edge cases involved

## Solution

```java
class Solution {
    public int maxProduct(int n) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n!=0){
            int temp=n%10;
            if(temp>max1){
                max2=max1;
                max1=temp;
            }else if(temp>max2){
                max2=temp;
            }
            n/=10;
        }
        return max1*max2;
    }
}
```
