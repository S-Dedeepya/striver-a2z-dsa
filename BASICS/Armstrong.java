public class Armstrong {
    public static void main(String[] args) {
        int n=370;
        int t=n;
        int ans=0;
        while(t!=0){
            ans=ans+(t%10)*(t%10)*(t%10);
            t=t/10;
        }
        if(n==ans){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
