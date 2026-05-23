public class Check_sort {
    public static void main(String[] args){
        int arr[]={1,9,6,8,5,4,0};
        check_sort(arr);
    }
    public static void check_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("True");
    }
}
