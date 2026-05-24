public class find_miss {
    public static void main(String[] args){
        int[] arr={0, 2, 3, 1, 4};
        int res=miss(arr);
        System.out.println(res);
    }
    public static int miss(int[] arr){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<=n;i++){
            ans^=i;
        }
        for(int i=0;i<n;i++){
            ans^=(arr[i]);
        }
        return ans;
    }
}
