1class Solution {
2    public int numEquivDominoPairs(int[][] d) {
3        int count=0;
4        for(int i=0;i<d.length;i++){
5            for(int j=i+1;j<d.length;j++){
6                int a=d[i][0];
7                int b=d[i][1];
8                int c=d[j][0];
9                int e=d[j][1];
10                if((a==c && b==e) || (a==e && b==c)){
11                    count++;
12                }
13            }
14        }
15        return count;
16    }
17}