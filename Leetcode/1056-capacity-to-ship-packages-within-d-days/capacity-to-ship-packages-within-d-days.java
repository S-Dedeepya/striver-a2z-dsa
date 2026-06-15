class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);;
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=find_ans(weights,mid);
            if(ans<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int find_ans(int[] weights,int mid){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                days++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
}