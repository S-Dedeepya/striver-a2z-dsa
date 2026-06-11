class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[j]=nums[i];
                j+=2;
            }
        }
        j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[j]=nums[i];
                j+=2;
            }
        }
        return ans;
    }
}