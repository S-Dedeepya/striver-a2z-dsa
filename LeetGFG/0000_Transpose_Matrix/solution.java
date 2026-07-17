1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int[][] res=new int[matrix[0].length][matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            int top=0;
6            for(int j=0;j<matrix[i].length;j++){
7                res[top++][i]=matrix[i][j];
8            }
9        }
10        return res;
11    }
12}