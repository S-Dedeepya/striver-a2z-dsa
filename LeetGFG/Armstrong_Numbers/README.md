# Armstrong Numbers

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1)  
**Submission Date:** 6 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Just like sum of digits except just cube the last digit before adding and check if n == sum

### Lines / Logic To Be Careful With
Cube the last digit before adding

### Edge Cases Handled
not much edge cases involved

## Solution

```java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp=n;
        int sum=0;
        while(temp!=0){
            int cube=(temp%10)*(temp%10)*(temp%10);
            sum=sum+cube;
            temp/=10;
        }
        if(n==sum){
            return true;
        }
        return false;
    }
}
```
