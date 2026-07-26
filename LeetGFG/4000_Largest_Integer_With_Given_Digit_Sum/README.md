# 4000. Largest Integer With Given Digit Sum

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/largest-integer-with-given-digit-sum/)  
**Submission Date:** 26 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find low and high according to the given n. For example if n=2 then the number will be most likely from 10-99 so write simple math to calculate that 10 and 99, store in low and high. Run loop from low to high and check if low is equal to sum. if yes store them and return max value out of it.

### Lines / Logic To Be Careful With
Finding low and high

### Edge Cases Handled
if n==1, then  low==1

## Solution

```java
class Solution {
    public int largestInteger(int n, int s) {
        int low;
        if(n==1){
            low=1;
        }else{
            low=(int)Math.pow(10,n-1);
        }
        int high=(low*10)-1;
        int max=0;
        if(s>9*n) return -1;
        for(int i=low;i<=high;i++){
            int res=digitsum(i);
            if(res==s){
                max=Math.max(max,i);
            }
        }
        return max;
    }
    public static int digitsum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n/=10;
        }
        return sum;
    }
}
```
