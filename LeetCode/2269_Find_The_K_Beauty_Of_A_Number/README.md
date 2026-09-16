# 2269. Find the K-Beauty of a Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-the-k-beauty-of-a-number/)
**Submission Date:** 16 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        int n=num;
        int power=(int)(Math.pow(10,k));
        while(n>=(power/10)){
            int temp=n%power;
            if(temp!=0 && num%temp==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
```

### Intuition
Need to check every k-digit substring of num.
Use % 10^k to extract the last k digits.
After checking, use /10 to shift one digit and get the next substring.
If the extracted number is non-zero and divides num, increment count.

### Logic to Be Careful With
int temp = n % (int)(Math.pow(10,k));
Extracts the last k digits.
n /= 10;
Moves the window one digit to the left.
if(temp != 0 && num % temp == 0)
temp != 0 is important because division/modulo by 0 is invalid.
num % temp == 0 means temp is a divisor of num

### Edge Cases Handled
all edge cases handled

### Mistakes Made
while condition... make sure n is having k no.of digits

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
