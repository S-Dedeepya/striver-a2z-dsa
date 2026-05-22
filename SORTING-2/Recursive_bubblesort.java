import java.util.Arrays;

public class Recursive_bubblesort {
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int n){
        if(n<=0)
            return;
        for(int j=1;j<n;j++){
            if(arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
        sort(arr,n-1);
    }
}
