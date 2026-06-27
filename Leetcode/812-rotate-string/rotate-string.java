class Solution {
    public boolean rotateString(String s, String goal) {
        String res=s+s;
        if(res.contains(goal)){
            return true;
        }
        return false;
    }
}