class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        if(arr.length<k) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int res=find(arr,mid);
            if(res>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public static int find(int[] arr,int mid){
        int sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }else{
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
}
