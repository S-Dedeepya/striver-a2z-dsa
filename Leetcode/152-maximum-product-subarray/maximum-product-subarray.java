class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix=nums[i]*prefix;
            suffix=nums[nums.length-1-i]*suffix;
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}