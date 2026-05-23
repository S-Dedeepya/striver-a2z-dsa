public class Largest_ele {
    public static void main(String[] args){
        int arr[]={-4, -3, 0, 1, -8};
        int res=large_ele(arr);
        System.out.println(res);
    }
    public static int large_ele(int[] arr){
        int max1=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            max1=Math.max(arr[i],max1);
        }
        return max1;
    }
}
