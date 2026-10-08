# Set Rightmost Unset Bit

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1)
**Submission Date:** 8 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int setBit(int n) {
        int i=0;
        while(true){
            if((n&(1<<i))==0){
                return (n|(1<<i));
            }
            i++;
        }
    }
}
```

### Intuition
- Start checking bits from position 0 (rightmost bit).
- Create a mask using 1 << i.
- If the ith bit is 0, set it using OR.
- Return immediately after setting the first unset bit.

### Logic to Be Careful With
(n & (1 << i)) == 0

→ checks whether the ith bit is 0.
n | (1 << i)

→ sets the ith bit to 1.
i++;

→ move to the next bit until an unset bit is found.

### Edge Cases Handled
alllllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
