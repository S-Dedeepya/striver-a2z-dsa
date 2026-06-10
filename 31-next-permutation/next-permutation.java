class Solution {
    public void nextPermutation(int[] arr) {
        int index=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;
            }
            return;
        }
        for(int i=n-1;i>=index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        for(int i=index+1;i<(n+index+1)/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i+index+1];
            arr[n-1-i+index+1]=temp;
        }
    }
}