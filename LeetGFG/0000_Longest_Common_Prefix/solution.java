1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String word="";
4        Arrays.sort(strs);
5        char[] first=strs[0].toCharArray();
6        char[] last=strs[strs.length-1].toCharArray();
7        for(int i=0;i<first.length;i++){
8            if(first[i]==last[i]){
9                word+=first[i];
10            }else{
11                break;
12            }
13        }
14        return word;
15    }
16}