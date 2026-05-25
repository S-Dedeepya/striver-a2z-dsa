public class Palindrome {
    public static void main(String args[]){
        int n=123;
        int t=n;
        int rev=0;
        while(t!=0){
            rev=rev*10+t%10;
            t=t/10;
        }
        if(n==rev)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
