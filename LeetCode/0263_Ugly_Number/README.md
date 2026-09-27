# 0263. Ugly Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/ugly-number/)
**Submission Date:** 27 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        while(n!=0){
            if(n%2==0){
                n/=2;
            }else if(n%3==0){
                n/=3;
            }else if(n%5==0){
                n/=5;
            }else{
                break;
            }
        }
        if(n==1) return true;
        return false;
    }
}
```

### Intuition
An ugly number is a positive number whose prime factors are only 2, 3, and 5.
Repeatedly divide n by 2, 3, or 5 whenever possible.
If we eventually reach 1, the number contains no other prime factors → Ugly.
If we get stuck at another number, it contains some prime factor other than 2, 3, or 5 → Not Ugly.

### Logic to Be Careful With
if(n<=0) return false;
Ugly numbers must be positive.
if(n%2==0){
    n/=2;
}else if(n%3==0){
    n/=3;
}else if(n%5==0){
    n/=5;
}
Keep removing factors 2, 3, and 5.
The order doesn't matter.
else{
    break;
}
If none of 2, 3, or 5 divides n, we cannot reduce it further.
if(n==1) return true;
Reaching 1 means all prime factors were among 2,3,5.

### Edge Cases Handled
n = 1 → true
n = 6 → true (6 → 3 → 1)
n = 30 → true
n = 14 → false (14 → 7, then stuck)
n <= 0 → false

### Mistakes Made
while(n!=0) works here because n is positive and only divided when divisible, so it won't become 0

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
