import java.util.Arrays;

public class Majority_element_bruteforce {
    public static void main(String[] args) {
        int arr[]={-1, -1, -1, -1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
    }
}
