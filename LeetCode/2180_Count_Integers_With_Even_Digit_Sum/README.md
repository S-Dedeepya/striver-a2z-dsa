# 2180. Count Integers With Even Digit Sum

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/count-integers-with-even-digit-sum/)
**Submission Date:** 15 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int countEven(int num) {
        int count=0;
        while(num!=1){
            if(digitsum(num)%2==0){
                count++;
            }
            num--;
        }
        return count;
    }
    public static int digitsum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}
```

### Intuition
Need to count numbers from num down to 2 whose digit sum is even.
For each number:
Find digit sum using digitsum().
Check digitsum(num) % 2 == 0.
If even, increment count.
Decrease num.

### Logic to Be Careful With
if(digitsum(num)%2==0){
    count++;
}
% 2 == 0 → digit sum is even.
sum += n % 10;
n /= 10;
n % 10 extracts the last digit.
n /= 10 removes the last digit.

### Edge Cases Handled
all edge cases handled

### Mistakes Made
no mistakes code while writing

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
