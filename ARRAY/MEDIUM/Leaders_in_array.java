public class Leaders_in_array {
    public static void main(String[] args) {
        int[] arr={-3, 4, 5, 1, -4, -5};
        int sum=0;
        System.out.print(arr[arr.length-1]+" ");
        for(int i=arr.length-2;i>=0;i--){
            sum+=arr[i+1];
            if(arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
