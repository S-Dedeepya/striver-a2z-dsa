# 2739. Total Distance Traveled

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/total-distance-traveled/)
**Submission Date:** 31 Aug 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res=0;
        while(mainTank>=5 && additionalTank>0){
            int refill = Math.min(mainTank / 5, additionalTank);
            res=(refill*50)+res;
            additionalTank=additionalTank-refill;
            mainTank = (refill) + (mainTank - refill * 5);
        }
        res=mainTank*10+res;
        return res;
    }
}
```

### Intuition
For every 5 liters consumed, you can transfer at most 1 liter from the additional tank, so simulate the fuel exchange.

### Logic to Be Careful With
refill = Math.min(used, additionalTank) prevents using more additional fuel than available; don't automatically subtract mainTank / 5.

### Edge Cases Handled
additionalTank = 0 → no refills; mainTank < 5 → simply use the remaining fuel; additional fuel less than required → use only what's available.

### Mistakes Made
refill = Math.min(used, additionalTank) prevents using more additional fuel than available; don't automatically subtract mainTank / 5.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
