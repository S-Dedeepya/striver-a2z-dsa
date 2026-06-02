public class Count_occur {
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10};
        int target=3;
        int res=count(arr,target);
        System.out.println(res);
    }
    public static int count(int[] arr,int target){
        int left=0,ans=arr.length,c=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if (ans == arr.length || arr[ans] != target) {
        return 0;
        }
        for(int i=ans;i<arr.length;i++){
            if(arr[i]!=target){
                return c;
            }else{
                c++;
            }
        }
        return c;
    }
}
