# 2595. Number of Even and Odd Bits

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/number-of-even-and-odd-bits/)
**Submission Date:** 7 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] evenOddBit(int n) {
        int[] res=new int[2];
        int count=0;
        while(n!=0){
            if(n%2==1){
                if(count%2==0){
                    res[0]++;
                }else{
                    res[1]++;
                }
            }
            count++;
            n/=2;
        }
        return res;
    }
}
```

### Intuition
Extract binary bits from right to left using % 2.
count represents the bit position.
Position 0,2,4,... → even index → res[0].
Position 1,3,5,... → odd index → res[1].

### Logic to Be Careful With
if(n%2==1)

→ checks whether the current bit is 1.
if(count%2==0)

→ checks whether the position is even.
count++;
n/=2;

→ increment position for every bit, including 0 bits.

### Edge Cases Handled
n = 1 → [1,0]
n = 2 (10) → [0,1]
n = 5 (101) → [2,0]

### Mistakes Made
count++ was inside the 1-bit condition, so it counted 1s instead of bit positions.
total was unnecessary.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
