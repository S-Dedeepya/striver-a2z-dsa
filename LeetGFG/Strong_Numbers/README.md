# Strong Numbers

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/strong-numbers4336/1)  
**Submission Date:** 6 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Just like armstrong number but just need to find factorial for last digit before adding

### Lines / Logic To Be Careful With
instead of writing logic for factorial just store fact of 0-9 and store in an array and return the index as index means last digit.

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    public boolean isStrong(int n) {
        int temp=n;
        int sum=0;
        while(temp!=0){
            int last=fact(temp%10);
            sum+=last;
            temp/=10;
        }
        if(n==sum){
            return true;
        }
        return false;
    }
    public static int fact(int n){
        int[] fact={1,1,2,6,24,120,720,5040,40320,362880};
        return fact[n];
    }
}
```
