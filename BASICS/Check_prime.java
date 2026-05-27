public class Check_prime {
    public static void main(String[] args) {
        int n=9;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
