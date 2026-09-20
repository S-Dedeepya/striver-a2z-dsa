# 3498. Reverse Degree of a String

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/reverse-degree-of-a-string/)
**Submission Date:** 20 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int reverseDegree(String s) {
        int product=0;
        for(int i=0;i<s.length();i++){
            int index_in_string=i+1;
            int index_rev_alpha=26-((int)(s.charAt(i))-97);
            product+=(index_in_string*index_rev_alpha);
        }
        return product;
    }
}
```

### Intuition
Each character gets a reverse alphabet value:
a → 26
b → 25
...
z → 1
Multiply this reverse alphabet value by the character's 1-based position in the string.
Add all the products.

### Logic to Be Careful With
'a' has ASCII value 97.
s.charAt(i) - 97 gives the normal alphabet index:
a → 0
b → 1
...
26 - index gives the reverse alphabet value.

### Edge Cases Handled
Single-character string.
"a" → reverse value 26.
"z" → reverse value 1.
String containing all same characters.
First/last alphabet characters (a, z).

### Mistakes Made
no mistakes madeeeeeeeeeeee

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
