public class Second_large {
    public static void main(String[] args){
        int arr[]={7, 7, 2, 2, 10, 10, 10};
        int res=large_ele(arr);
        System.out.println(res);
    }
    public static int large_ele(int[] arr){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE)
            return -1;
        return max2;
    }
    
}
