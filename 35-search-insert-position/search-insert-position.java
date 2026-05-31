class Solution {
    public int searchInsert(int[] arr, int target) {
        int left=0,right=arr.length-1;
        int mid=0;
        if(target<arr[0]){
            return 0;
        }
        while(left<=right){
            mid=left +(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left ;
    }
}