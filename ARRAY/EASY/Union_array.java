import java.util.Arrays;

public class Union_array {
    public static void main(String[] args) {
        int[] arr={3, 4, 6, 7, 9, 9};
        int[] arr1={1, 5, 7, 8, 8};
        int[] res=union(arr,arr1);
        System.out.println(Arrays.toString(res));
    }
    public static int[] union(int[] arr,int[] arr1){
        int[] res=new int[arr.length+arr1.length];
        int i=0,j=0,k=0;
        while(i< arr.length && j< arr1.length ){
            if(arr[i]<arr1[j]){
                res[k]=arr[i];
                k++;
                i++;
            }else if(arr[i]>arr1[j]){
                res[k]=arr1[j];
                k++;
                j++;
            }else{
                res[k]=arr[i];
                k++;
                i++;
                j++;
            }
        }
        while(i<arr.length){
            res[k]=arr[i];
            k++;
            i++;
        }
        while(j<arr1.length){
            res[k]=arr1[j];
            k++;
            j++;
        }
        return res;
    }
}
