class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int repeating=-1;
        int missing=-1;
        int res[]= new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
           res[arr[i]]++;
        }
        for(int i=1;i<res.length;i++){
            if(res[i]==2){
                repeating=i;
            }
            if(res[i]==0){
                missing=i;
            }
        }
        list.add(repeating);
        list.add(missing);
        return list;
    }
}