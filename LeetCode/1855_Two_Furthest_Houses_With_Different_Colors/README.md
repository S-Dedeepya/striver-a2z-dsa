# 1855. Two Furthest Houses With Different Colors

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/two-furthest-houses-with-different-colors/)
**Submission Date:** 16 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int maxDistance(int[] colors) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int j=colors.length-1;j>=0;j--){
            if(colors[j]!=colors[0]){
                max1=j;
                break;
            }
        }
        for(int i=0;i<colors.length-1;i++){
            if(colors[i]!=colors[colors.length-1]){
                max2=colors.length-1-i;
                break;
            }
        }
        return Math.max(max1,max2);
    }
}
```

### Intuition
Need the maximum distance j - i where colors[i] != colors[j].
The maximum distance must involve one of the two ends:
First element with the farthest different element from the right.
Last element with the farthest different element from the left.
Calculate both possibilities and take the maximum.

### Logic to Be Careful With
For the first element, i = 0, so distance is simply j.
For the last element, j = n-1, so distance is n-1-i.
We only need to check these two cases because any maximum-distance pair must use an endpoint.

### Edge Cases Handled
all edge cases handled

### Mistakes Made
no mistakes made while writing the code

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
