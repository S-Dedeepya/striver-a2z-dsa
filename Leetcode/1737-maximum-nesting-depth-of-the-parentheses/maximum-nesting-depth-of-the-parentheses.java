class Solution {
    public int maxDepth(String s) {
        char[] string=s.toCharArray();
        int count=0;
        int max=0;
        for(int i=0;i<string.length;i++){
            if(string[i]=='('){
                count++;
                max=Math.max(max,count);
            }
            if(string[i]==')'){
                count--;
            }
        }
        return max;
    }
}