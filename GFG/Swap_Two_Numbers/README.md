# Swap Two Numbers

**Platform:** GeeksForGeeks
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/swap-the-numbers/1)
**Submission Date:** 8 Oct 2026
**Language:** java

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

<!-- Note: See individual solution sections below -->

## Solution 1

```java
import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a + " " + b);
    }
}
```

### Intuition
a = 5, b = 3

a = 5 ^ 3
b = (5 ^ 3) ^ 3 = 5
a = (5 ^ 3) ^ 5 = 3

Result: a = 3, b = 5

### Logic to Be Careful With
a=a^b;
        b=a^b;
        a=a^b;

### Edge Cases Handled
allllllllllllllllllllllllllllll

### Mistakes Made
nopeeeeeeeeeeeeeeeeeee

**Time Complexity:** O(1)  
**Space Complexity:** O(1)
