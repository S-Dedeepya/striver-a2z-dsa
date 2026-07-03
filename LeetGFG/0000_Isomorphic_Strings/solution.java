1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character,Character> h =new HashMap<Character,Character>();
4        for(int i=0;i<s.length();i++){
5            char c1=s.charAt(i);
6            char c2=t.charAt(i);
7            if(h.containsKey(c1)){
8                if(h.get(c1)!=c2){
9                    return false;
10                }
11            }else if(h.containsValue(c2)){
12                return false;
13            }
14            h.put(c1,c2);
15        }
16        return true;
17    }
18}