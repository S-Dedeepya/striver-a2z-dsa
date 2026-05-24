public class appear_once {
    public static void main(String[] args){
        int[] arr={1, 3, 10, 3, 5, 1, 5};
        int res=appear_once(arr);
        System.out.println(res);
    }
    public static int appear_once(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans; 
    }
}
