1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(hm.containsKey(nums[i])){
6                return true;
7            }else{
8                hm.put(nums[i],1);
9            }
10        }
11        return false;
12    }
13}