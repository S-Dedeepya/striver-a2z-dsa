# Decimal to Binary

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/decimal-to-binary-1587115620/1)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    static String decToBinary(int n) {
        String res="";
        while(n!=1){
            if(n%2==1) res+='1';
            else res+='0';
            n/=2;
        }
        res+='1';
        String reversed = new StringBuilder(res).reverse().toString();
        return reversed;
    }
}
```

### Intuition
Repeatedly divide n by 2.
n % 2 gives the current binary digit.- 1 → append '1'
- 0 → append '0'

Division by 2 moves to the next binary digit.
Digits are generated right to left, so reverse the string at the end.

### Logic to Be Careful With
while(n!=1)

→ keep extracting digits until the remaining value becomes 1.
n/=2;

→ move to the next binary digit.
new StringBuilder(res).reverse().toString();

→ reverse because the binary digits were collected from right to left.

### Edge Cases Handled
n = 1 → "1"
n = 2 → "10"
n = 5 → "101"
n = 0 → current code does not work because while(n != 1) never terminates.

### Mistakes Made
nopeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(logn)
