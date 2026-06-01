public class Lower_bound {
    public static void main(String[] args) {
        int arr[]={3,5,8,15,19};
        int target=3;
        int left=0;
        int right=arr.length-1;
        int res=lower_bound(arr,left,right,target);
        System.out.println(res);
    }
    public static int lower_bound(int[] arr,int left,int right,int target){
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                if(left!=right){
                    return lower_bound(arr,left,mid,target);
                }else{
                    return mid;
                }
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
