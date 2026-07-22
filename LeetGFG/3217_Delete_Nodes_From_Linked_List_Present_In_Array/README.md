# 3217. Delete Nodes From Linked List Present in Array

**Platform:** LeetCode  
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/)  
**Submission Date:** 22 Jul 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(n)  
**Space Complexity:** O(n)  

## Revision Notes

### Intuition
Create a hash set and store array values in it
Traverse the prev and temp pointers throughout the linked list and check if the temp val is there in hash set. If yes write logic for if the temp node is head node as well if its not head node. also deal if the temp val is not there in hash set

### Lines / Logic To Be Careful With
Be careful with temp and prev pointers

### Edge Cases Handled
use hash set instead of two nested loops to check if temp val is equal to array value at index at i

## Solution

See `solution.java` in this folder.
