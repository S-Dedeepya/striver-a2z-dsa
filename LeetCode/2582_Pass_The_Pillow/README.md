# 2582. Pass the Pillow

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/pass-the-pillow/)
**Submission Date:** 21 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int passThePillow(int n, int time) {
        int count=0;
        while(time>(n-1)){
            time=time-(n-1);
            count++;
        }
        if(count%2==0){
            return 1+time;
        }
        return n-time;
    }
}
```

### Intuition
There are n positions, and the ball moves back and forth.
One complete direction takes n - 1 seconds to reach the opposite end.
count keeps track of how many complete traversals have happened.
After removing all complete traversals, time is the remaining movement.
The direction depends on whether count is even or odd.

### Logic to Be Careful With
while(time > (n-1)){
    time = time - (n-1);
    count++;
}
Remove one complete traversal of length n - 1.
count records the number of direction changes.
if(count % 2 == 0){
    return 1 + time;
}
Even number of complete traversals → moving in the forward direction.
Starting position is 1, so answer is 1 + time.
return n - time;
Odd number of complete traversals → moving in the reverse direction.
Starting from position n, move backward by time.

### Edge Cases Handled
time = 0 → position 1.
time < n - 1 → no complete traversal, so count = 0.
time = n - 1 → exactly reaches position n.
Multiple complete traversals → direction alternates.

### Mistakes Made
Use n - 1, not n, for one complete traversal.
Don't forget the positions are 1-based.
The direction changes after every complete traversal.
count % 2 determines the current direction.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
