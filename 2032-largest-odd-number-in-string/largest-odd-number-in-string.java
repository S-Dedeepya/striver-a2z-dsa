class Solution {
    public String largestOddNumber(String num) {
        int max=-1;
        int index=-1;
        if((int)num.charAt(num.length() -1 )%2 !=0){
            return num;
        }
        for(int i=0;i<num.length();i++){
            if((int)num.charAt(i)%2 !=0){
                index=i;
            }
        }
        if(index==-1){
            return "";
        }
        return num.substring(0,index+1);
    }
}