# 2094. Finding 3-Digit Even Numbers

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/finding-3-digit-even-numbers/)
**Submission Date:** 12 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] res=new int[10];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<digits.length;i++){
            res[digits[i]]++;
        }
        for(int i=100;i<999;i=i+2){
            int[] arr=new int[10];
            int x=i;
            arr[x%10]++;
            x/=10;
            arr[x%10]++;
            x/=10;
            arr[x%10]++;
            boolean what=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>res[j]){
                    what=false;
                    break;
                }
            }
            if(what){
                list.add(i);
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
```

### Intuition
Check every possible 3-digit even number from 100 to 999.
Count how many times each digit appears in the given digits array.
For every number, count how many times its 3 digits are used.
If the required frequency is not greater than the available frequency, the number is valid.
Store valid numbers in an ArrayList.

### Logic to Be Careful With
Step 1 — Count Available Digits
int[] res = new int[10];

for(int i = 0; i < digits.length; i++){
    res[digits[i]]++;
}
res[digit] = number of times that digit is available.
Step 2 — Check 3-Digit Even Numbers
for(int i = 100; i < 1000; i += 2)
Start from 100.
i += 2 checks only even numbers.
1000 is excluded because we need exactly 3 digits.
Step 3 — Extract Digits
int x = i;

arr[x % 10]++;
x /= 10;

arr[x % 10]++;
x /= 10;

arr[x % 10]++;

For example:

248

248 % 10 → 8
24  % 10 → 4
2   % 10 → 2

### Edge Cases Handled
0 can be the last digit.
0 cannot be the first digit.
Duplicate digits must be handled using frequency.
Number must be even.
A digit cannot be used more times than it appears.

### Mistakes Made
Important Mistake 1 — Don't Modify i

❌ Wrong:

i /= 10;

i is the for loop variable, so changing it can break the loop.

✅ Use x:

x /= 10;
Important Mistake 2 — Add the Original Number

After extracting digits, x becomes 0.

So add:

list.add(i);

not:

list.add(x);
Step 4 — Check Frequency
if(arr[j] > res[j]){
    what = false;
    break;
}
res[] → available digits.
arr[] → required digits.
If required > available → number cannot be formed.
Step 5 — Convert ArrayList to int[]

ArrayList<Integer> cannot directly return as primitive int[].

int[] ans = new int[list.size()];

for(int i = 0; i < list.size(); i++){
    ans[i] = list.get(i);
}

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
