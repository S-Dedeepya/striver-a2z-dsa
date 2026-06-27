1class Solution {
2    public boolean rotateString(String s, String goal) {
3        String res=s+s;
4        if(res.contains(goal)){
5            return true;
6        }
7        return false;
8    }
9}