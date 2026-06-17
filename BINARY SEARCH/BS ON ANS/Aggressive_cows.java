import java.util.Arrays;

public class Aggressive_cows {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1]-stalls[0];
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=cows(stalls,mid,k);
            if(ans==1){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
    public static int cows(int[] arr,int a,int k){
        int no_cows=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=a){
                no_cows++;
                last=arr[i];
            }
        }
        if(no_cows>=k){
            return 1;
        }
        return 0;
    }
}
