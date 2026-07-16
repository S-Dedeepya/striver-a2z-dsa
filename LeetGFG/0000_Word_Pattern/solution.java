1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        HashMap<Character,String> h=new HashMap<>();
4        String[] arr=s.split(" ");
5        if(pattern.length()!=arr.length) return false;
6        for(int i=0;i<pattern.length();i++){
7            if(h.containsKey(pattern.charAt(i))){
8                if(h.get(pattern.charAt(i)).equals(arr[i])){
9                }else{
10                    return false;
11                }
12            }else{
13                if(h.containsValue(arr[i])){
14                    return false;
15                }
16            }
17            h.put(pattern.charAt(i),arr[i]);
18        }
19        return true;
20    }
21}