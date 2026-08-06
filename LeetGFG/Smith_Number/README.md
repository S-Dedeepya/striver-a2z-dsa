# Smith Number

**Platform:** GeeksForGeeks  
**Problem Link:** [View Problem](https://www.geeksforgeeks.org/problems/smith-number4132/1)  
**Submission Date:** 6 Aug 2026  
**Language:** java  

## Approach

<!-- Describe your approach here -->

## Time & Space Complexity

**Time Complexity:** O(√n)  
**Space Complexity:** O(1)  

## Revision Notes

### Intuition
Find the sum of digits of the number and the sum of digits of its prime factors.
If both sums are equal and the number is composite, it is a Smith number.

### Lines / Logic To Be Careful With
Check if the number is prime first; prime numbers are not Smith numbers.
After factorization, add the remaining factor if n > 1 and use += while adding digit sums.

### Edge Cases Handled
Prime numbers should return false.
Handle the remaining prime factor after the loop (if (n > 1)).

## Solution

```java
class Solution {
    public boolean smithNum(int n) {
        if(isPrime(n)) return false;
        int sum =sumdigit(n);
        int primesum=primesum(n);
        if(sum==primesum){
            return true;
        }
        return false;
    }
    public static int sumdigit(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public static int primesum(int n){
        int sum=0;
        for(int i=2;(i*i)<=n;i++){
            while(n%i==0){
                sum+=sumdigit(i);
                n/=i;
            }
        }
        if(n>1){
            sum+=sumdigit(n);
        }
        return sum;
    }
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
```
