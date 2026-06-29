1class Solution {
2    public String removeOuterParentheses(String s) {
3        char[] st=s.toCharArray();
4        int count=0;
5        String ans="";
6        for(int i=0;i<st.length;i++){
7            if(st[i]==')'){
8                count--;
9            }
10            if(count!=0){
11                ans+=st[i];
12            }
13            if(st[i]=='('){
14                count++;
15            }
16        }
17        return ans;
18    }
19}