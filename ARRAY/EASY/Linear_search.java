public class Linear_search {
    public static void main(String args[]){
        int arr[]={1, 3, 5, -4, 1};
        int target=1;
        int res=search(arr,target);
        System.out.println(res);
    }
    public static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
