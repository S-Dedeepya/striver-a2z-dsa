1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int[] res=new int[arr.length];
4        int k=0;
5        for(int i=0;i<res.length;i++){
6            if(arr[k]!=0){
7                res[i]=arr[k];
8            }else if(arr[k]==0){
9                res[i]=0;
10                if(i+1<arr.length){
11                    res[i+1]=0;
12                    i++;
13                }
14            }
15            k++;
16        }
17       for(int i=0;i<arr.length;i++){
18        arr[i]=res[i];
19       }
20    }
21}