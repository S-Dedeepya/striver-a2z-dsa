# 0921. Minimum Add to Make Parentheses Valid

**Platform:** LeetCode
**Difficulty:** Medium  
**Problem Link:** [View Problem](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)
**Submission Date:** 6 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                ans++;
                count=0;
            }
        }
        return count+ans;
    }
}
```

### Intuition
count tracks unmatched opening brackets (.
When we see ( → count++.
When we see ) → count--.
If count becomes negative, we have an unmatched ).
We need one ( to fix it, so ans++.
At the end, remaining count represents unmatched (, requiring count closing brackets.

### Logic to Be Careful With
if(count<0){
    ans++;
    count=0;
}

- Negative count means there is no available ( for the current ).
- Add one insertion and reset the balance to 0.
return count+ans;

- ans → ( needed for unmatched ).
- count → ) needed for unmatched (.

### Edge Cases Handled
()" → 0
"(((" → 3
")))" → 3
"())" → 1
"()(()" → 1
Empty string → 0

### Mistakes Made
- You correctly detected negative balance.
- But you didn't reset count after fixing an unmatched ).
- Add:
count=0;

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
