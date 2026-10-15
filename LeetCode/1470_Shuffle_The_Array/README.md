# 1470. Shuffle the Array

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/shuffle-the-array/)
**Submission Date:** 15 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length/2;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                ans[k]=nums[i++];
            }else{
                ans[k]=nums[j++];
            }
        }
        return ans;
    }
}
```

### Intuition
The array contains two halves: x1, x2, ..., xn followed by y1, y2, ..., yn.



Create a new array and alternate elements from the first and second halves.



The result becomes x1, y1, x2, y2, ..., xn, yn.

### Logic to Be Careful With
int[] ans = new int[nums.length]; — creates the result array.



int i = 0; — points to the first half.



int j = nums.length / 2; — points to the second half.



if(k % 2 == 0) — fills even result indices from the first half.



ans[k] = nums[i++]; — copies the first-half element, then increments i.



ans[k] = nums[j++]; — copies the second-half element, then increments j.

### Edge Cases Handled
ALLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL

### Mistakes Made
NOOOOOOOOOOOOOOOOOOOOOO

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
