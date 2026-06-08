public class Print_max_Subarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=0,s=0,e=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum>max){
                max=sum;
                s=start;
                e=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
