import java.util.Arrays;

public class remove_dup {
    public static void main(String[] args){
        int arr[]={-30, -30, 0, 0, 10, 20, 30, 30};
        int res=remove_dup1(arr);
        for(int i=0;i<=res;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int remove_dup1(int[] arr){
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i;
    }
}
