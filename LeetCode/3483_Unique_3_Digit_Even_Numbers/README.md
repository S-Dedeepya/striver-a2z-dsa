# 3483. Unique 3-Digit Even Numbers

**Platform:** LeetCode
**Difficulty:** Easy  
**Problem Link:** [View Problem](https://leetcode.com/problems/unique-3-digit-even-numbers/)
**Submission Date:** 11 Sept 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
class Solution {
    public int totalNumbers(int[] digits) {
        int[] nums=new int[10];
        for(int i=0;i<digits.length;i++){
            nums[digits[i]]++;
        }
        int ans=0;
        for(int i=100;i<999;i=i+2){
            int x=i;
            int[] arr=new int[10];
            arr[x%10]++;
            x/=10;
            arr[x%10]++;
            x/=10;
            arr[x%10]++;
            boolean what=true;
            for(int j=0;j<arr.length;j++){
                if(nums[j]<arr[j]){
                    what=false;
                    break;
                }
            }
            if(what){
                ans++;
            }
        }
        return ans;
    }
}
```

### Intuition
Check every 3-digit even number from 100 to 999.
Store the frequency of each digit in the input array.
For each number, count how many times each digit is used.
The number is valid if every required digit is available enough times.

### Logic to Be Careful With
Step 1 — Store Available Digits
int[] nums = new int[10];

for(int i = 0; i < digits.length; i++){
    nums[digits[i]]++;
}
nums[i] = how many times digit i is available.
Step 2 — Check Every 3-Digit Even Number
for(int i = 100; i < 1000; i += 2)
Starts at 100.
i += 2 means only even numbers are checked.
1000 is excluded because we only need 3-digit numbers.
Step 3 — Extract Digits

For a number like 248:

248 % 10 → 8
24  % 10 → 4
2   % 10 → 2

So:

arr[x % 10]++;
x /= 10;

is used to count the digits.

### Edge Cases Handled
Duplicate digits.
0 can be the last digit but not the first digit.
Number must be even.
A digit cannot be used more times than it appears.

### Mistakes Made
Important Mistake 1 — Reset arr

❌ Wrong:

int[] arr = new int[10];

for(...){
    ...
}

arr keeps the digits from the previous number.

✅ Correct:

for(...){
    int[] arr = new int[10];

Each number needs a fresh digit count.

Important Mistake 2 — Compare Correctly

❌ Wrong:

if(nums[j] != arr[j])

We don't need the counts to be equal because some available digits may remain unused.

✅ Correct:

if(arr[j] > nums[j])

Meaning:

required > available → invalid
required <= available → valid
Example
digits = [1, 2, 2, 4]
number = 122

Available:

1 → 1
2 → 2
4 → 1

Required:

1 → 1
2 → 2

4 is unused, which is perfectly fine.

Therefore 122 is valid.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
