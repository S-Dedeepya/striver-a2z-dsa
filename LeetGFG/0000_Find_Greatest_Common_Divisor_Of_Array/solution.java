1class Solution {
2    public int findGCD(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            max=Math.max(max,nums[i]);
7            min=Math.min(min,nums[i]);
8        }
9        for(int i=min;i>=0;i--){
10            if((min%i)==0 && max%i==0){
11                return i;
12            }
13        }
14        return 0;
15    }
16}