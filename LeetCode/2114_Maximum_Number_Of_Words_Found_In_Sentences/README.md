# 2114. Maximum Number of Words Found in Sentences

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/)
**Submission Date:** 10 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=0;
        for(int i=0;i<sentences.length;i++){
            count=countwords(sentences[i]);
            max=Math.max(count,max);
        }
        return max;
    }
    public static int countwords(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') count++;
        }
        return count+1;
    }
}
```

### Intuition
Count the words in each sentence.



Track the maximum word count across all sentences.



Since words are separated by spaces, the number of words equals the number of spaces plus 1.

### Logic to Be Careful With
count=countwords(sentences[i]);
max=Math.max(count,max);


→ Count words in the current sentence and update the maximum.
if(s.charAt(i)==' ') count++;


→ Count spaces between words.
return count+1;


→ Add 1 because a sentence with n spaces contains n+1 words.

### Edge Cases Handled
"Hello" → 1 word



"Hello World" → 2 words



Multiple sentences → return the largest word count.

### Mistakes Made
nopeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)
