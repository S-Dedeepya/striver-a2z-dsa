# 1051. Height Checker

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/height-checker/)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        for(int i=0;i<expected.length;i++){
            for(int j=1;j<expected.length-i;j++){
                if(expected[j-1]>expected[j]){
                    int temp=expected[j-1];
                    expected[j-1]=expected[j];
                    expected[j]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}
```

### Intuition
expected is a copy of heights.
Sort expected in ascending order.
Compare heights[i] with expected[i].
Every mismatch means that student is not at the expected height position.

### Logic to Be Careful With
if(expected[j-1] > expected[j])

→ swap adjacent elements for bubble sort.
if(heights[i] != expected[i])
    count++;

→ count positions where original and sorted arrays differ.

### Edge Cases Handled
Already sorted → 0
Reverse sorted → many/all positions mismatch
Duplicate heights → handled correctly
One element →

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
