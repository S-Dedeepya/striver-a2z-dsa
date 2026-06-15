class Solution {
    public int smallestDivisor(int[] nums, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=find_ans(nums,mid);
            if(ans<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int find_ans(int[] nums,int mid){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=Math.ceil((double)nums[i]/mid);
        }
        return res;
    }
}