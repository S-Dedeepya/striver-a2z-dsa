class Solution {
    public boolean isAnagram(String s, String t) {
        int a[]=new int[128];
        int b[]=new int[128];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)-'a']++;
        }
        for(int i=0;i<128;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}