import java.util.Arrays;

public class zero_end {
    public static void main(String[] args){
        int arr[]={0, 20, 0, -20, 0, 20};
        move_zero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void move_zero(int[] arr){
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
            j++;
        }
    }
}
