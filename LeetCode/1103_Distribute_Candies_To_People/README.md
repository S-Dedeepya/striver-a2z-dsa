# 1103. Distribute Candies to People

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/distribute-candies-to-people/)
**Submission Date:** 10 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res=new int[num_people];
        for(int i=0;i<res.length;i++){
            if(candies<(i+1)){
                res[i]=candies;
                candies=0;
            }else{
                res[i]=i+1;
                candies-=res[i];
            }
        }
        int j=0;
        int total=0;
        while(candies>0){
            if(j>=res.length){
                j=0;
                total=total+num_people;
            }
            if(candies<(total+num_people+j+1)){
                res[j]+=candies;
                candies=0;
            }else{
                res[j]=res[j]+total+num_people+j+1;
                candies-=(total+num_people+j+1);
            }
            j++;
        }
        return res;
    }
}
```

### Intuition
Distribute candies in increasing order:
1 → 2 → 3 → 4 → 5 → 6 → ...
People receive candies in a circular manner.
First distribute one complete round: 1, 2, 3, ... num_people.
If candies are still left, continue with the next amounts.
total keeps track of how much the amount has increased after completing each round.

### Logic to Be Careful With
if(j >= res.length)

Not:

if(j > res.length)

Because the last valid index is:

res.length - 1

### Edge Cases Handled
candies < num_people
candies == num_people
Candies finish exactly on a person's turn.
Candies continue for multiple rounds.
Only one person.

### Mistakes Made
j → current person.
total → increase in the amount after completing a round.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
