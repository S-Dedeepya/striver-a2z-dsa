class Solution {
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k > arr.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            low=Math.min(low,arr[i]);
            high=Math.max(arr[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=min_days(arr,m,k,mid);
            if(ans>=m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int min_days(int[] arr,int m,int k,int mid){
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }else{
                ans+=count/k;
                count=0;
            }
        }
        ans+=count/k;
        return ans;
    }
}