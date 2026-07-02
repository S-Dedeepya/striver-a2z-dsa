1class Solution {
2    public String reverseWords(String s) {
3        String[] st=s.split(" +");
4        StringBuilder string=new StringBuilder();
5        for(int i=st.length-1;i>=0;i--){
6            string.append(st[i]);
7            string.append(" ");
8        }
9        return string.toString().trim();
10    }
11}