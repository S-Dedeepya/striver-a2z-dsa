import java.util.Arrays;

public class Quick_sort {
    public static void main(String args[]){
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int start,int end){
        int mid=start+(end-start)/2;
        int low=start,high=end;
        int pivot=arr[mid];
        if(low>=high)
            return;
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        sort(arr,start,high);
        sort(arr,low,end);
    }

}
