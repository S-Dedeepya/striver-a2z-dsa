1class Solution {
2    public int maxProduct(int[] nums) {
3        int prefix=1;
4        int suffix=1;
5        int max=Integer.MIN_VALUE;
6        for(int i=0;i<nums.length;i++){
7            if(prefix==0) prefix=1;
8            if(suffix==0) suffix=1;
9            prefix=nums[i]*prefix;
10            suffix=nums[nums.length-1-i]*suffix;
11            max=Math.max(max,Math.max(prefix,suffix));
12        }
13        return max;
14    }
15}