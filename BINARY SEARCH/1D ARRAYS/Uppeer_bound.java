public class Uppeer_bound {
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        int target=2;
        int left=0;
        int right=arr.length-1;
        int res=upper_bound(arr,left,right,target);
        System.out.println(res);
    }
    public static int upper_bound(int[] arr,int left,int right,int target){
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                if(left!=right){
                    return upper_bound(arr,mid+1,right,target);
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
