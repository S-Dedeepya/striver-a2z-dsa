class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int index=0;
        int res[]=new int[2];
        for(int i=0;i<mat.length;i++){
            Arrays.sort(mat[i]);
            int low=0;
            int high=mat[i].length-1;
            int ans=mat[i].length;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mat[i][mid]==1){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            if(mat[i].length-ans>max){
                max=mat[i].length-ans;
                index=i;
            }
        }
        res[0]=index;
        res[1]=max;
        return res;
    }
}