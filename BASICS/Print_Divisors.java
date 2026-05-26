public class Print_Divisors {
    public static void main(String[] args) {
        int n=7;
        print(n);
    }
    public static void print(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}
