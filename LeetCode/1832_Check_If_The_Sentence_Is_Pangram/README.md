# 1832. Check if the Sentence Is Pangram

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
**Submission Date:** 26 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
```

### Intuition
A pangram contains every letter from a to z at least once.
Use an array of size 26 to store the frequency of each letter.
Convert each character to an index using:
s.charAt(i)-'a'
After counting, check whether every position in the array is non-zero.

### Logic to Be Careful With
arr[s.charAt(i)-'a']++;
'a' → index 0
'b' → index 1
...
'z' → index 25
if(arr[i]==0){
    return false;
}
If any letter has frequency 0, the string is not a pangram.

### Edge Cases Handled
Contains every letter exactly once → true
Missing even one letter → false
Repeated letters → still true if all 26 letters are present
Minimum possible pangram length → 26

### Mistakes Made
No mistakes in the code. ✅
Correctly used an array of size 26.
Correctly checked every alphabet character.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
