class Solution {
    public String removeOuterParentheses(String s) {
        char[] st=s.toCharArray();
        int count=0;
        String ans="";
        for(int i=0;i<st.length;i++){
            if(st[i]==')'){
                count--;
            }
            if(count!=0){
                ans+=st[i];
            }
            if(st[i]=='('){
                count++;
            }
        }
        return ans;
    }
}