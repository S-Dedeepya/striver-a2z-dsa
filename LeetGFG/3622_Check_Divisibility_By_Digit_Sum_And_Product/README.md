# 3622. Check Divisibility by Digit Sum and Product

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)  
**Submission Date:** 22 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
find digitsum and digitproduct and sum them check if that sum is divisible by the n

### Lines / Logic To Be Careful With
product=product*(temp%10); not product=product*temp%10;

### Edge Cases Handled
n==0 and n<10 sum and product both are same

## Solution

```java
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        while(temp!=0){
            sum=sum+temp%10;
            product=product*(temp%10);
            temp/=10;
        }
        return (n%(sum+product)==0);
    }
}
```
