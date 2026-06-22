public class Long_sub_array_sumk {
    public int longestSubarray(int[] arr, int k) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
