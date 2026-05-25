public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int res=fact(5);
        System.out.println(res);
    }
    public static int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
    }
}
