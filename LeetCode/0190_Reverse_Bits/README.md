# 0190. Reverse Bits

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-bits/)
**Submission Date:** 7 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int reverseBits(int n) {
        String res="";
        int count=32;
        while(count!=0){
            if(n%2==1) res+='1';
            else res+='0';
            n/=2;
            count--;
        }
        int ans=0;
        int power=1;
        for(int i=res.length()-1;i>=0;i--){
            ans+=power*(res.charAt(i)-'0');
            power=power*2;
        }
        return ans;
    }
}
```

### Intuition
Extract exactly 32 bits from n.
Store them in res.
Since bits are extracted from right to left, res already contains the reversed bit order.
Convert the reversed binary string back to decimal.

### Logic to Be Careful With
while(count!=0)

→ Must process exactly 32 bits, including leading zeros.
ans += power * (res.charAt(i)-'0');

→ Convert character '0'/'1' to numeric 0/1.
power *= 2;

→ Move from \(2^0\) to \(2^1\), \(2^2\), etc

### Edge Cases Handled
n = 0 → 0
Leading zeros must still be processed because the integer is 32 bits.
Negative numbers require Java's signed/unsigned bit behavior to be handled carefully; the bit-extraction approach using % 2 and / 2 is not reliable for negative n

### Mistakes Made
Forgot power *= 2.
Used res.charAt(i) directly, which gives a character/ASCII value.

**Time Complexity:** O(32)  
**Space Complexity:** O(32)
