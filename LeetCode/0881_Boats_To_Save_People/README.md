# 0881. Boats to Save People

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/boats-to-save-people/)
**Submission Date:** 2 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;
        while(left<=right){
            if(limit>=people[left]+people[right]){
                boats++;
                left++;
                right--;
            }else{
                boats++;
                right--;
            }
        }
        return boats;
    }
}
```

### Intuition
first sort the array. place one pointer at first and another at last index. check if first and last sum is less than or equal to limit. if yeas increase the boat pointer and move the both pointers. if no then assign boat to high num and move the pointer.

### Logic to Be Careful With
if limit is less than the sum of val at two indexes then assign boat to high weight only

### Edge Cases Handled
all edge cases handled

### Mistakes Made
dont check the sumof two adjacent index in the array instead check for highes and lowest sum less than or equal to sum

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
