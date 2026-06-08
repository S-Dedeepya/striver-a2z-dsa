class Solution {
    public void setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    markrow(i,arr,r);
                    markcol(j,arr,c);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==1||c[j]==1){
                    if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
                }
            }
        }
    }
    public static void markrow(int i,int[][] arr,int[] r){
        int n=arr.length;
        int m=arr[0].length;
        for(int j=0;j<m;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
        r[i]=1;
    }
    public static void markcol(int j,int[][] arr,int[] c){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
        c[j]=1;
    }
}