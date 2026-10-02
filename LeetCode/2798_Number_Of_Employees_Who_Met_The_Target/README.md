# 2798. Number of Employees Who Met the Target

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/number-of-employees-who-met-the-target/)
**Submission Date:** 2 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}
```

### Intuition
Go through every employee's working hours.
If an employee worked at least the target hours, increase count.
Return the total count.

### Logic to Be Careful With
Use >=, because employees who worked exactly the target also count.

### Edge Cases Handled
- All employees meet target → hours.length
- No employee meets target → 0
- Hours exactly equal to target → count them.
- Empty array → 0

### Mistakes Made
No mistakes in your code. ✅
Simple linear traversal is sufficient.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
