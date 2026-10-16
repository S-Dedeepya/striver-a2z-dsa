# 1528. None of the test cases are wrong. They're just confusing.

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/shuffle-string/)
**Submission Date:** 16 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        String res="";
        char[] ch=new char[indices.length];
        for(int i=0;i<ch.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            res+=ch[i];
        }
        return res;
    }
}
```

### Intuition
The indices array tells us the final position of each character in s.



Create a character array ch to store characters at their correct positions.



Place each character using ch[indices[i]] = s.charAt(i).



Convert the reordered character array into a string and return it.

### Logic to Be Careful With
char[] ch = new char[indices.length]; — creates an array to hold the reordered characters.



ch[indices[i]] = s.charAt(i); — places the character at its target index.



res += ch[i]; — builds the final string from left to right.

### Edge Cases Handled
ALLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL

### Mistakes Made
NOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
