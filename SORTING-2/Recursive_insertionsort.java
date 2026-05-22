import java.util.Arrays;

public class Recursive_insertionsort {
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int i,int n){
        if(i==n)
            return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        sort(arr,i+1,n);
    }
}
