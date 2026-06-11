class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] res={-1,-1};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                res[0]=lower(left,mid,arr,target);
                res[1]=upper(mid,right,arr,target);
                return res;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;
    }
    public static int lower(int left,int right,int[] arr,int target){
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                ans=mid;
                right=mid -1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static int upper(int left,int right,int[] arr,int target){
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=target){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}