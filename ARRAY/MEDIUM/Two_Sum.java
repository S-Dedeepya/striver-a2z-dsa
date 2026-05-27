import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[]={-6, 7, 1, -7, 6, 2};
        int target=3;
        int res[]=two_sum(arr,target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] two_sum(int[] arr,int target){
        int res[]=new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}
