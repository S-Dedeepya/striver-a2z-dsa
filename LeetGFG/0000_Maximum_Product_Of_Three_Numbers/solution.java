1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        return Math.max(nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1],nums[0]*nums[1]*nums[nums.length-1]);
5    }
6}