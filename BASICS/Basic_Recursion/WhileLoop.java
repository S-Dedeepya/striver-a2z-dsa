public class WhileLoop {
    public static void main(String[] args) {
        int d=2;
        int n=0,count=0,sum=0;
        while(count!=50){
            if(n%10==d){
                sum=sum+n;
                count++;
            }
            n++;
        }
        System.out.println(sum);
    }
}
