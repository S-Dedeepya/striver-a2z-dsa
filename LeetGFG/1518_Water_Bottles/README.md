# 1518. Water Bottles

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/water-bottles/)  
**Submission Date:** 17 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Drink the bottles and use the empty bottles to get new ones until you can’t exchange anymore.

### Lines / Logic To Be Careful With
numBottles = add + (numBottles % numExchange); → new bottles + leftover

### Edge Cases Handled
If numBottles < numExchange, no exchange is possible, so the answer is the initial number of bottles.

## Solution

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int add=numBottles/numExchange;
            total=total+(add);
            numBottles=add+(numBottles%numExchange);
        }
        return total;
    }
}
```
