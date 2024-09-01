public class sumofN {
    static int printSum(int n){
        if(n==1){
            return 1;
        }
        int smallAns=printSum(n-1);
        return n+smallAns;
    }
    public static void main(String[] args) {
        int ans=printSum(5);
        System.out.println(ans);
    }
}
