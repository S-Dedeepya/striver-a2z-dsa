public class Array_rotated{
    public static void main(String[] args){
        int[] arr={4, 5, 6, 7, 0, 1, 2, 3};
        int target=4;
        int res=arr_rotate(arr,target);
        System.out.println(res);
    }
    public static int arr_rotate(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[left]<arr[right]){
                if(arr[left]<arr[mid]){
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
        return left;
    }
}
