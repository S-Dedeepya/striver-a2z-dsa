# Binary to Decimal

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int binaryToDecimal(String b) {
        int power=1;
        int num=0;
        int n=b.length();
        for(int i=n-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                num=num+power*1;
            }
            power=power*2;
        }
        return num;
    }
}
```

### Intuition
Start with power = 1 because the rightmost binary digit represents \(2^0\).
Traverse the binary string from right to left.
If the current bit is 1, add the current power to num.
After every position, double power.

### Logic to Be Careful With
for(int i=n-1;i>=0;i--)

→ start from the rightmost bit.
if(b.charAt(i)=='1'){
    num=num+power;
}

→ only 1 contributes to the decimal value.
power=power*2;

→ move from \(2^0\) → \(2^1\) → \(2^2\) → ..

### Edge Cases Handled
"0" → 0
"1" → 1
"10" → 2
"101" → 5
"111" → 7

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
