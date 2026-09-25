# 0202. Why the input number cannot go to infinity (an explanation/proof that fits the context of a technical interview)

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/happy-number/)
**Submission Date:** 25 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(true){
            slow=squaresum(slow);
            fast=squaresum(squaresum(fast));
            if(slow==fast){
                if(slow==1) return true;
                else return false;
            }
            
        }
    }
    public static int squaresum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
}
```

### Intuition
Happy Number repeatedly replaces a number with the sum of squares of its digits.
Eventually:
It reaches 1 → Happy
Or enters a cycle → Not Happy
Use Floyd's Cycle Detection to detect the cycle without extra space.
slow moves 1 step.
fast moves 2 steps.

### Logic to Be Careful With
slow=squaresum(slow);
fast=squaresum(squaresum(fast));
slow and fast must be maintained separately.
fast must continue from its previous position.
if(slow==fast){
    return slow==1;
}
Meeting at 1 → happy.
Meeting anywhere else → cycle → not happy.

### Edge Cases Handled
n = 1 → true
n = 19 → true
n = 2 → false
Numbers entering the non-1 cycle → false

### Mistakes Made
nitially, fast was calculated from slow:
fast=squaresum(slow);
Then fast was discarded every iteration.
This means fast was not actually moving independently, so the code could TLE.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
