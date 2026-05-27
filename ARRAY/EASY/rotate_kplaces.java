import java.util.Arrays;

public class rotate_kplaces {
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4, 5};
        rotate(arr,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr,int k){
        k=k%arr.length;
        while(k!=0){
            int last=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=last;
            k--;
        }
    }
}
