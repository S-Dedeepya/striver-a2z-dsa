# Check K-th Bit

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        String res="";
        while(n!=1){
            if(n%2==1) res+='1';
            else res+='0';
            n/=2;
        }
        res+='1';
        String reversed = new StringBuilder(res).reverse().toString();
        if(k>=reversed.length()) return false;
        if(reversed.charAt(reversed.length()-1-k)=='0'){
            return false;
        }
        return true;
    }
}
```

### Intuition
Convert n to binary.
k is 0-indexed from the right.
Find the character at length - 1 - k.
If k is outside the binary length, that bit is 0.

### Logic to Be Careful With
if(k >= reversed.length()){
    return false;
}

→ Important for cases like n = 1250, k = 30.
reversed.charAt(reversed.length()-1-k)

→ k=0 means the rightmost bit.

### Edge Cases Handled
n=5, k=0 → true
n=5, k=1 → false
n=5, k=2 → true
n=1250, k=30 → false

### Mistakes Made
- Initially used:
k <= reversed.length()

- Correct condition is:
k >= reversed.length()

because valid indices are 0 to length-1.
- If k is outside the binary representation, return false.

**Time Complexity:** O(log n)  
**Space Complexity:** O(logn)
