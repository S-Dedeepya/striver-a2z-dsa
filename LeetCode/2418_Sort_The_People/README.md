# 2418. Sort the People

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/sort-the-people/)
**Submission Date:** 14 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            int max=heights[i];
            String tall=names[i];
            for(int j=i;j<heights.length;j++){
                if(max<heights[j]){
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                    int temp0=max;
                    max=heights[j];
                    heights[j]=temp0;
                }
            }
        }
        return names;
    }
}
```

### Intuition
Sort names in descending order of their corresponding heights.



For each position i, find a taller person in the remaining array and swap their names so the tallest people come first.

### Logic to Be Careful With
int max = heights[i]; — stores the current maximum height.



String tall = names[i]; — stores the current name, but this variable is never used.



for(int j = i; j < heights.length; j++) — searches the remaining elements.



Swapping names[i] and names[j] keeps the names aligned with the people being reordered.

### Edge Cases Handled
Already sorted heights → names should remain in order.



Equal heights → their relative order may change depending on the swaps.



One person → returns the same names array.

### Mistakes Made
nopeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
