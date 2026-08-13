# 0374. Guess Number Higher or Lower

**Platform:** LeetCode  
**Problem Link:** [View Problem](https://leetcode.com/problems/guess-number-higher-or-lower/)  
**Submission Date:** 13 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
apply binary search to solve the problem

### Lines / Logic To Be Careful With
check for res=0,1,-1 and move low,high pointers accordingly

### Edge Cases Handled
no pick between 1 to n

## Solution

```java
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int res=guess(mid);
            if(res==0){
                return mid;
            }else if(res==1){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
```
