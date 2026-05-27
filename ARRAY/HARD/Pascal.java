public class Pascal {
    public static void main(String[] args) {
        int r=5;
        int c=3;
        int res=pascal(r,c);
        System.out.println(res);
    }
    public static int pascal(int r,int c){
        if(c>r||c<=0||r<=0){
        return 0;
        }
        if(r==c||c==1){
            return 1;
        }
        return pascal(r-1, c-1)+pascal(r-1, c);
    }
}
