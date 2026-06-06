class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        left[0]=0;
        right[right.length-1]=0;
        for(int i=1;i<left.length;i++){
            int sum=0;
            for(int j=i;j>0;j--){
                sum=sum+nums[j-1];
            }
            left[i]=sum;
        }
        for(int i=0;i<right.length;i++){
            int sum=0;
            for(int k=i+1;k<right.length;k++){
                sum=sum+nums[k];
            }
            right[i]=sum;
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}