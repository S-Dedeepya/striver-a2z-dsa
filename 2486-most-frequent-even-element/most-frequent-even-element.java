class Solution {
    public int mostFrequentEven(int[] arr) {
        int[] res=new int[100001];
        int max=0;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                res[arr[i]]++;
            }
        }
        for(int i=0;i<100001;i+=2){
            if(res[i]>max){
                max=res[i];
                ans=i;
            }
        }
        return ans;
    }
}