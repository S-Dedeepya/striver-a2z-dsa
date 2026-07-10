1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long left=1;
4        long right=num;
5        while(left<=right){
6            long mid=left+(right-left)/2;
7            if((long)(mid*mid)==num){
8                return true;
9            }else if((mid*mid)>num){
10                right=mid-1;
11            }else{
12                left=mid+1;
13            }
14        }
15        return false;
16    }
17}