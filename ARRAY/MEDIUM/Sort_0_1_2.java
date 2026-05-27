import java.util.Arrays;

public class Sort_0_1_2 {
    public static void main(String args[]){
        int arr[]={1, 0, 2, 1, 0};
        int res[]=sort(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sort(int[] arr){
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count1++;
            }
            if(arr[i]==1){
                count2++;
            }
        }
        for(int k=0;k<count1;k++){
            arr[k]=0;
        }
        for(int k=count1;k<count2+count1;k++){
            arr[k]=1;
        }
        for(int k=count2+count1;k<arr.length;k++){
            arr[k]=2;
        }
        return arr;
    }    
}
