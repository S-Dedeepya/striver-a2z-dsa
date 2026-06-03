class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                max=Math.max(i+1-j,max);
                j=i+1;
            }
        }
        max=Math.max(nums.length-j,max);
        return max;
    }
}