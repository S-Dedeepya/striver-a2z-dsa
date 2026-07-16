1class Solution {
2    public boolean isHappy(int n) {
3        int sum=0;
4        HashSet<Integer> h=new HashSet<>();
5        while(n!=1){
6            h.add(n);
7            while(n!=0){
8                sum+=(n%10)*(n%10);
9                n/=10;
10            }
11            if(h.contains(sum)){
12                return false;
13            }
14            n=sum;
15            sum=0;
16        }
17        return true;
18    }
19}