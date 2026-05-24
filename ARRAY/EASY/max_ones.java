public class max_ones {
    public static void main(String[] args){
        int[] arr={1, 0, 1, 1, 1, 0, 1, 1, 1};
        int res=ones(arr);
        System.out.println(res);
    }
    public static int ones(int arr[]){
        int c1=0,c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c1++;
            }else{
                c2=Math.max(c1,c2);
                c1=0;
            }
        }
        return Math.max(c1,c2);
    }
}
