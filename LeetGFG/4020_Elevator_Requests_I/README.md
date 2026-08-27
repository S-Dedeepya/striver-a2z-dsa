# 4020. Elevator Requests I

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/elevator-requests-i/)  
**Submission Date:** 27 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Total time = distance from the starting floor to the first request + distance between every consecutive request.

### Lines / Logic To Be Careful With
Use Math.abs() because movement can be upward or downward; don't forget the first movement from the starting floor.

### Edge Cases Handled
One request → time is that floor's distance from 0; empty requests → need to handle separately if allowed.

## Solution

```java
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec=requests[0];
        for(int i=0;i<requests.length-1;i++){
            sec=sec+Math.abs(requests[i]-requests[i+1]);
        }
        return sec;
    }
}
```
