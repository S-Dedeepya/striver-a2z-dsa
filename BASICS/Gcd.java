public class Gcd {
    public static void main(String[] args) {
        int n1=4;
        int n2=6;
        int res=gcd(n1,n2);
        System.out.println(res);
    }
    public static int gcd(int n1,int n2){
        int gcd=1;
        int n= (n1<n2)?n1:n2;
        for(int i=2;i<=n;i++){
            if(n1%i==0 && n2 %i ==0){
                gcd =i;
            }
        }
        return gcd;
    }
}
