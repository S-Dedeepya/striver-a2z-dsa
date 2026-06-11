class Solution {
    public int minimumChairs(String s) {
        int max=0;
        int chair=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                chair++;
            }
            if(s.charAt(i)=='L'){
                max=Math.max(chair,max);
                chair--;
            }
        }
        return Math.max(chair,max);
    }
}