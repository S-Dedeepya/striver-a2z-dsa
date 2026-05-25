public class Sum {
    public static void main(String[] args) {
        int n=5;
        int ans = print(n);
        System.out.println(ans);
    }
    public static int print(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        return n+print(n-1);
    }
}
