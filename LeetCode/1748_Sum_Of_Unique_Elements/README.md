# 1748. Approach

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/sum-of-unique-elements/)
**Submission Date:** 30 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int sumOfUnique(int[] nums) {
        int ans=0;
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==1){
                ans+=i;
            }
        }
        return ans;
    }
}
```

### Intuition
We need the sum of numbers that appear exactly once.
Use a frequency array arr to count how many times each number appears.
First loop → count frequencies.
Second loop → if frequency is 1, add that number to ans

### Logic to Be Careful With
int[] arr=new int[101];
Since the values are within 1 to 100, index the value directly.
arr[nums[i]]++;
Increase the frequency of the current number.
if(arr[i]==1){
    ans+=i;
}
Only numbers appearing exactly once are added.

### Edge Cases Handled
[1,2,3] → 6
[1,1,2,2,3] → 3
All numbers repeated → 0
One element → that element itself.

### Mistakes Made
in second loop add index value instead of value present at that index.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
