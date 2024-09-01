public class goodNo {
    private static long MOD = 1_000_000_007;
    private static int countGoodNumbers(long n) {
        long evenDigits=5;
        long primeDigits=4;
        long even=(n+1)/2;
        long odd=n/2;

        long first=pow(evenDigits,even)%MOD;
        long second=pow(primeDigits,odd)%MOD;

        return (int)((first*second)%MOD);
    }
    private static long pow(long x,long n){
        if(n==0) return 1;
        long temp = pow(x,n/2);
        if(n%2==0){
            return (temp*temp)%MOD;
        }
        else{
            return (x*temp*temp)%MOD;
        }
    }
    public static void main(String[] args) {
        long n=5;
        countGoodNumbers(n);
    }
}
