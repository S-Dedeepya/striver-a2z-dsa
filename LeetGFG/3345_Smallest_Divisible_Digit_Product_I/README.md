# 3345. Smallest Divisible Digit Product I

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/smallest-divisible-digit-product-i/)  
**Submission Date:** 6 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
find the product of digit if divisible by t then return n else increment n

### Lines / Logic To Be Careful With
find product and check if divisible by t

### Edge Cases Handled
not much edge cases handled

## Solution

```java
class Solution {
    public int smallestNumber(int n, int t) {
        while(n!=0){
            int product=prodigit(n);
            if(product%t==0){
                return n;
            }
            n++;
        }
        return -1;
    }
    public static int prodigit(int n){
        int product=1;
        while(n!=0){
            product*=(n%10);
            n/=10;
        }
        return product;
    }
}
```
