public class FLoor_Ceil {
    public static void main(String[] args) {
        int[] arr={2, 4, 6, 8, 10, 12, 14};
        int target=1;
        floor_ceil(arr,target);
    }
    public static void floor_ceil(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(target+" "+target);
                return;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid -1;
            }
        }
        if(right == -1){
            System.out.println(-1+" "+arr[left]);
        }else if(left == arr.length){
            System.out.println(arr[right]+" "+-1);
        }else {
            System.out.println(arr[right]+" "+arr[left]);
        }
    }
}
