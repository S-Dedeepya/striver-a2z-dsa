import java.util.Arrays;

public class zero_end {
    public static void main(String[] args){
        int arr[]={0, 20, 0, -20, 0, 20};
        move_zero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void move_zero(int[] arr){
        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
}
