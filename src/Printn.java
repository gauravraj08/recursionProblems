public class Printn {
    static void printWithoutLoop(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printWithoutLoop(n-1);
        System.out.print(n+" ");
        return;
    }
    public static void main(String[] args) {
        printWithoutLoop(7);
    }
}
