import java.util.Arrays;

public class Long_conseq_sequence {
    public static void main(String[] args) {
        int arr[]={100, 4, 200, 1, 3, 2};
        Arrays.sort(arr);
        int count=0;
        int longest=1;
        int small=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==small){
                count++;
                small=arr[i];
            }else if(arr[i]!=small){
                count=1;
                small=arr[i];
            }
            longest=Math.max(longest,count);
        }
        System.out.println(longest);
    }
}
