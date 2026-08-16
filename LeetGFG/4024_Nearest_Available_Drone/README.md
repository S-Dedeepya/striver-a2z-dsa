# 4024. Nearest Available Drone

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/nearest-available-drone/)  
**Submission Date:** 16 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Calculate Manhattan distance from the target to each drone, and choose the closest drone whose range can reach the target.

### Lines / Logic To Be Careful With
Check distance <= drones[i][2] and update the index only when the distance is smaller.

### Edge Cases Handled
No reachable drone → -1; equal distances → keep the earlier index.

## Solution

```java
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int index=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int distance=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(distance<=drones[i][2]){
                if(ans>distance){
                    ans=distance;
                    index=i;
                }
            }
        }
        return index;
    }
}
```
