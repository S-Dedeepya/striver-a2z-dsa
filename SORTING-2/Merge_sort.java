import java.util.Arrays;

public class Merge_sort {
    public static void main(String args[]){
        int[] arr={5,4,3,2,1};
        int[] res=sort1(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sort1(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int left[]= sort1(Arrays.copyOfRange(arr, 0, mid));
        int right[]= sort1(Arrays.copyOfRange(arr,mid, arr.length));
        return merge1(left,right);
    }
    public static int[] merge1(int[] left,int[] right){
        int i=0,j=0,k=0;
        int ans[]= new int[left.length+right.length];
        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                k++;
                i++;
            }else{
                ans[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            k++;
            j++;
        }
        return ans;
    }
}
