# 0021. Merge Two Sorted Lists

**Platform:** LeetCode  
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/merge-two-sorted-lists/)  
**Submission Date:** 21 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
wrote cases for:
if the both nodes from both lists have same value then create two nodes of same value and connect both. increment both temp pointers
if any of those temp value is lesser than the other then create node for that value and increment the temp pointer of that respective list.

### Lines / Logic To Be Careful With
Check if the head is actually null before add newnodes in any case

### Edge Cases Handled
If both lists are null return null

## Solution

See `solution.java` in this folder.
