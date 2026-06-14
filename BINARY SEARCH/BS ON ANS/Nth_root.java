public class Nth_root {
    public static void main(String[] args) {
        int n=3;
        int m=27;
        int low=1;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=multiply(mid,n);
            if(val==m){
                System.out.print(mid);
                return;
            }else if(val<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(-1);
    }
    public static long multiply(int mid,int n){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
        }
        return ans;
    }
}
