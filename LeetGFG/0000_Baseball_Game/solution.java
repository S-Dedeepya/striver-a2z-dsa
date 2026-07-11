1class Solution {
2    public int calPoints(String[] operations) {
3        List<Integer> list=new ArrayList<>();
4        int temp=0,sum=0;
5        for(int i=0;i<operations.length;i++){
6            if(operations[i].equals("+")){
7                list.add(list.get(list.size()-1)+list.get(list.size()-2));
8            }else if(operations[i].equals("C")){
9                temp=list.get(list.size()-1);
10                list.remove(list.size()-1);
11            }else if(operations[i].equals("D")){
12                list.add(list.get(list.size()-1)*2);
13            }else{
14                int a=Integer.parseInt(operations[i]);
15                list.add(a);
16            }
17        }
18        for(int i=0;i<list.size();i++){
19            sum+=list.get(i);
20        }
21        return sum;
22    }
23}