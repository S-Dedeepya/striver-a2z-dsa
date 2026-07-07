class Solution {
    public long sumAndMultiply(int n) {
        int num=0;
        int sum=0;
        int temp=n;
        int rev=0;
        while(temp!=0){
            if(temp%10!=0){
                num=num*10+temp%10;
                sum=sum+temp%10;
            }
            temp=temp/10;
        }
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return (long) rev*sum;
    }
}