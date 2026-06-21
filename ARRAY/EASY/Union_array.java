class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                     list.add(a[i]);
                } 
                i++;
            }else{
                if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            } 
            i++;
        }
        while(j<n2){
            if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
