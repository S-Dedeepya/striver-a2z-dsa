class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=cal(mid,piles);
            if(ans<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int cal(int mid,int[] piles){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/mid);
        }
        return total;
    }
}