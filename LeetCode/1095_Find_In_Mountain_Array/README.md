# 1095. Find in Mountain Array

**Platform:** LeetCode
**Difficulty:** Hard  
**Problem Link:** [View Problem](https://leetcode.com/problems/find-in-mountain-array/)
**Submission Date:** 15 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int peak=findpeak(mountainArr);
        int left=0;
        int right=n-1;
        int ans=findelement_left(mountainArr,left,peak-1,target);
        if(ans!=-1) return ans;
        return findelement_right(mountainArr,peak,right,target);
    }
    public static int findpeak(MountainArray mountainArr){
        int n=mountainArr.length();
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            int x=mountainArr.get(mid);
            int y=mountainArr.get(mid+1);
            if(x>y){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public static int findelement_left(MountainArray mountainArr,int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            int x=mountainArr.get(mid);
            if(x==target){
                return mid;
            }else if(x>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static int findelement_right(MountainArray mountainArr,int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            int x=mountainArr.get(mid);
            if(x==target){
                return mid;
            }else if(x<target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
```

### Intuition
first find the peak then left of the peak search for the target and right of the peak also search for the target. if not found return -1;

### Logic to Be Careful With
finding the peak, left array and right array different binary search algorithm as left is increasing and right is decreasing

### Edge Cases Handled
allllllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)
