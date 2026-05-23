import java.util.Arrays;

public class left_Rotate {
    public static void main(String[] args){
        int arr[]={7, 6, 5, 4};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr){
        int last=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=last;
    }
}
