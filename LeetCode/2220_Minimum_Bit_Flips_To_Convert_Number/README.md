# 2220. Minimum Bit Flips to Convert Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/)
**Submission Date:** 9 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        while(start!=0 && goal!=0){
            if((start%2) != (goal%2)) count++;
            start/=2;
            goal/=2;
        }
        while(start!=0){
            if(start%2!=0) count++;
            start/=2;
        }
        while(goal!=0){
            if(goal%2!=0) count++;
            goal/=2;
        }
        return count;
    }
}
```

### Intuition
Count how many bit positions differ between start and goal.



Compare their last bits using % 2.



If the bits differ, increment count.



Divide both numbers by 2 to process the next bit.



When one number becomes 0, count the remaining 1 bits in the other number.

### Logic to Be Careful With
while(start!=0 && goal!=0)


→ Compare bits while both numbers have remaining bits.
if((start%2) != (goal%2)) count++;


→ A mismatch requires one bit flip.
if(start%2!=0) count++;


→ Count remaining 1 bits when only one number has bits left.

### Edge Cases Handled
start = 10, goal = 7 → 3



start = 3, goal = 3 → 0



start = 0, goal = 7 → 3



start = 8, goal = 0 → 1

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
