public class Square_root {
    public static void main(String[] args){
        int n=28;
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid<=n){
                ans=mid;
                low=low+1;
            }else{
                high=high-1;
            }
        }
        System.out.println(ans);
    }
}
