# 0083. Remove Duplicates from Sorted List

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)  
**Submission Date:** 21 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Create prev and temp nodes. Check the temp node vale and node next to it vale. if they both are same then point the prev node to temp next node. and move temp followed by prev node

### Lines / Logic To Be Careful With
Write the correct loop condition. it should check if the temp next node is not pointing to null but not whether temp is null as we need to check two adjacent node values

### Edge Cases Handled
Need to return null if head is null.

## Solution

See `solution.java` in this folder.
