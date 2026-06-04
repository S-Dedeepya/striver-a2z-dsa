class Solution {
    public void rotate(int[][] arr) {
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
    }
}