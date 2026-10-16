# 0136. Single Number

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/single-number/)
**Submission Date:** 16 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
```

### Intuition
sort array technique

### Logic to Be Careful With
careful with returned value

### Edge Cases Handled
alllllllllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)

## Solution 2

```java
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return 0;
    }
}
```

### Intuition
by using extra memory space

### Logic to Be Careful With
checking value and keys

### Edge Cases Handled
allllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

## Solution 3

```java
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=0;
            while(j<nums.length){
                if(j==i){
                    j++;
                    continue;
                }
                if(nums[i]==nums[j]){
                    break;
                }
                j++;
            }
            if(j>=nums.length){
                return nums[i];
            }
        }
        return 0;
    }
}
```

### Intuition
brute forceeeeeeeeeeeeeeeeeeeeee

### Logic to Be Careful With
finding the answerrrrrrrrrrrrrrrrrrrrrrrrr

### Edge Cases Handled
allllllllllllllllllllllllllllllll

### Mistakes Made
npoeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)

## Solution 4

```java
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
}
```

### Intuition
using xor operator. optimized

### Logic to Be Careful With
alllllllllllllllllllllllllllllllllllll

### Edge Cases Handled
allllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
