class Solution {
    public int rowWithMax1s(int[][] arr) {
        int index=-1;
        int max=0;
        for(int i=0;i<arr.length;i++){
            int low=0;
            int high=arr[i].length-1;
            int ans=arr[i].length;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[i][mid]==1){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            if(arr[i].length-ans>max){
                max=arr[i].length-low;
                index=i;
            }
        }
        return index;
    }
};