1class Solution {
2    public int smallestRangeI(int[] nums, int k) {
3        int max=Integer.MIN_VALUE;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<nums.length;i++){
6            max=Math.max(max,nums[i]);
7            min=Math.min(min,nums[i]);
8        }
9        min=min+k;
10        if(max-k<min){
11            while(max-k<min){
12                k--;
13            }
14            max=max-k;
15            return max-min;
16        }else{
17            max=max-k;
18        }
19        return max-min;
20    }
21}