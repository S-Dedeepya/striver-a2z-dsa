class Solution {
    public int[] applyOperations(int[] arr) {
        int j=0,k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }
        }
        while(j<arr.length){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k++;
            }
            j++;
        }  
        return arr;
    }
}