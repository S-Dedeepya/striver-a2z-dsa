public class Selection_sort{
    public static void main(String args[]){
        int arr[]={13,46,24,52,20,9};
        sort(arr);
    }
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}