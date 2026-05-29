public class Count_subarrays_withsum {
    public static void main(String[] args) {
        int[] arr={3, 1, 2, 4};
        int res=long_Array(arr,6);
        System.out.println(res);
    }
    public static int long_Array(int[] arr,int k){
        int c1=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    c1++;
                }
            }
        }
        return c1;
    }
}
