class Solution {
    public int findMin(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[left]<arr[right]){
                if(arr[mid]<arr[right]){
                    right=mid-1;
                }else{
                    left=mid;
                }
            }else{
                if(arr[mid]>arr[right]){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
        }
        return arr[left];
    }
}