public class Long_subarray_sum0 {
    public static void main(String args[]){
        int[] arr={1, 0, -4, 3, 1, 0};
        int res=long_Array(arr);
        System.out.println(res);
    }
    public static int long_Array(int[] arr){
        int c1=0,c2=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    c2=j-i+1;
                    c1=Math.max(c1,c2);
                }
            }
        }
        return c1;
    }
}
