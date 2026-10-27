# 0744. Find Smallest Letter Greater Than Target

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
**Submission Date:** 27 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        char ans=letters[0];
        while(left<=right){
            int mid=(left+right)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
```

### Intuition
apply binary search and find the answer.

### Logic to Be Careful With
check if mid char is greater than target if yes store in some var and move left pointer else move right pointer

### Edge Cases Handled
alllllllllllllllllllllllllllllll

### Mistakes Made
noneeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
