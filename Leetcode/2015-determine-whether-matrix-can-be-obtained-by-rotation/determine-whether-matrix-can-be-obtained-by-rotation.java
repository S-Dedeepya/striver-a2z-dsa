class Solution {
    public boolean findRotation(int[][] arr, int[][] target) {
        int n=4;
        return rotate(arr,target,n);
    }
    public static boolean rotate(int[][] arr,int[][] target,int n){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1]=temp;
            }
        }
        n--;
        return check(arr,target,n);
    }
    public static boolean check(int[][] arr,int[][] target, int n){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=target[i][j] && n!=0){
                    return rotate(arr,target,n);
                }
                if(arr[i][j]!=target[i][j] && n==0){
                    return false;
                }
            }
        }
        return true;
    }
}