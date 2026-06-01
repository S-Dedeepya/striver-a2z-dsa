class Solution {
    public boolean check(int[] arr) {
        int c=1,i=0;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                rotate(arr,c);
                break;
            }else{
                c++;
                i++;
            }
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                return false;
            }
        }
        return true;
    }
    public static void rotate(int[] arr,int k){
        k=k%arr.length;
        while(k!=0){
            int last=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=last;
            k--;
        }
    }
}