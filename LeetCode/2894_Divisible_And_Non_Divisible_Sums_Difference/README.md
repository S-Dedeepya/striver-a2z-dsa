# 2894. Divisible and Non-divisible Sums Difference

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/)
**Submission Date:** 3 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        return sum2-sum1;
    }
}
```

### Intuition
Traverse all numbers from 1 to n.
If i is divisible by m, add it to sum1.
Otherwise, add it to sum2.
Return sum2 - sum1.

### Logic to Be Careful With
Use i % m, because i is the current number being checked.
n % m would check the same number every iteration.

### Edge Cases Handled
m = 1 → every number is divisible by m.
m > n → no number is divisible by m.
n = 1 → only one number to check.

### Mistakes Made
Since n doesn't change inside the loop, the original condition would put every number into the same group.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
