# 2037. Minimum Number of Moves to Seat Everyone

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/)
**Submission Date:** 29 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count=0;
        for(int i=0;i<seats.length;i++){
            count=count+Math.abs(seats[i]-students[i]);
        }
        return count;
    }
}
```

### Intuition
sort both array and calculate the differences between number at each index and sum those differences

### Logic to Be Careful With
the difference should be positive if negative. because we are counting the moves

### Edge Cases Handled
single index
no moves

### Mistakes Made
no mistake madeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
