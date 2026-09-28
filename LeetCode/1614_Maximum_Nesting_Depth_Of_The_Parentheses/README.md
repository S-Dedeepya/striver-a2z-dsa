# 1614. Maximum Nesting Depth of the Parentheses

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)
**Submission Date:** 28 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int maxDepth(String s) {
        char[] string=s.toCharArray();
        int count=0;
        int max=0;
        for(int i=0;i<string.length;i++){
            if(string[i]=='('){
                count++;
                max=Math.max(max,count);
            }
            if(string[i]==')'){
                count--;
            }
        }
        return max;
    }
}
```

### Intuition
Track the current depth of parentheses using count.
When we see ( → increase depth.
When we see ) → decrease depth.
Keep the maximum value reached by count.
That maximum is the maximum nesting depth.

### Logic to Be Careful With
if(string[i]=='('){
    count++;
    max=Math.max(max,count);
}
Increase count before updating max.
This captures the depth after entering the new parenthesis.
if(string[i]==')'){
    count--;
}
Closing a parenthesis reduces the current depth.

### Edge Cases Handled
"()" → 1
"(())" → 2
"((()))" → 3
"()()" → 1
"1+(2*3)/(2-1)" → 1
No parentheses → 0

### Mistakes Made
No mistakes in your code. ✅
char[] conversion is valid, though you could also use s.charAt(i) directly.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
