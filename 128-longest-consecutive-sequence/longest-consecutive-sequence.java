class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int longest=1;
        int last=Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1!=last){
                if(nums[i]==last){
                    continue;
                }
                count=1;
                last=nums[i];
            }else if(nums[i]-1==last){
                count++;
                last=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}