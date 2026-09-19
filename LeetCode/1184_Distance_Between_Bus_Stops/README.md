# 1184. Distance Between Bus Stops

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/distance-between-bus-stops/)
**Submission Date:** 19 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clock=0;
        int anticlock=0;
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int i=start;
        while(i<destination){
            clock+=distance[i];
            i++;
        }
        int k=start-1;
        if(k==-1){
            k=distance.length-1;
        }
        while(true){ 
            anticlock+=distance[k];
            if(k==destination){
                break;
            }
            k--;
            if(k==-1){
                k=distance.length-1;
            }
        }
        return Math.min(clock,anticlock);
    }
}
```

### Intuition
There are 2 possible routes between start and destination:
Clockwise
Anti-clockwise
Calculate both distances and return the smaller one.
If start > destination, swap them so the clockwise traversal becomes simple.

### Logic to Be Careful With
if(start > destination){
    int temp = start;
    start = destination;
    destination = temp;
}
Swap start and destination to simplify the calculation.
if(k == -1){
    k = distance.length - 1;
}
Important for circular traversal.
When moving backward from index 0, wrap around to the last index.
anticlock += distance[k];

if(k == destination){
    break;
}
Add the distance first, then check destination.
This prevents missing the edge when start = 0 and destination = last index.

### Edge Cases Handled
Used:
while(k != l)
When k == destination initially, the loop never executed, giving anticlock = 0.
Tried:
if(k == 1)
This was an incorrect special case.
The condition should depend on destination, not a fixed index.
Forgot that the list is circular, so when k becomes -1, it must wrap to distance.length - 1.

### Mistakes Made
start > destination
start = 0
destination = distance.length - 1
Destination is immediately before start
Clockwise and anti-clockwise distances are equal

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
