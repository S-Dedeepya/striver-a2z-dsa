public class Patterns_22{
    public static void main(String[] args) {
        int n=4;
        // Pattern 1
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 2
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 3
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        //pattern 4
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        //pattern 5
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 6
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        //pattern 7
        for(int i=0;i<n;i++){
            for(int j=n;(j-i-1)>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 8
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 9
        for(int i=0;i<n;i++){
            for(int j=n;(j-i-1)>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 10
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 11
        for(int i=0;i<n;i++){
            for(int j=0;j<=i && i%2==0;j++){
                System.out.print((j+1)% 2);
            }
            for(int j=0;j<=i && i%2 !=0;j++){
                System.out.print((j)% 2);
            }
            System.out.println();
        }
        //pattern 12
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
        //pattern 13
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k++);
            }
            System.out.println();
        }
        //pattern 14
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        //pattern 15
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        //pattern 16
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
        //pattern 17
        for(int i=0;i<n;i++){
            for(int j= n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            for(int j=0;j<i;j++){
                System.out.print((char)(65+i-1-j));
            }
            System.out.println();
        }
    }
}