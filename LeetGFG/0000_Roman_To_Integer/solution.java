1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        map.put('I',1);
5        map.put('V',5);
6        map.put('X',10);
7        map.put('L',50);
8        map.put('C',100);
9        map.put('D',500);
10        map.put('M',1000);
11        char[] st=s.toCharArray();
12        int ans=0;
13        for(int i=0;i<st.length-1;i++){
14            if(map.get(st[i])<map.get(st[i+1])){
15                ans-=map.get(st[i]);
16            }else{
17                ans+=map.get(st[i]);
18            }
19        }
20        ans+=map.get(st[st.length-1]);
21        return ans;
22    }
23}