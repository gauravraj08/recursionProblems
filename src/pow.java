public class pow {
    private static void power(double p,int n){
        double ans=1;
        for(int i=0;i<n;i++){
            ans *= p;

        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        double p=2;
        power(p,10);
    }
}
