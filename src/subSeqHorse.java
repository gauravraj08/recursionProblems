import java.util.ArrayList;
import java.util.List;

public class subSeqHorse {
    static void solve(int[] bet,int n,int k){
       List<Integer> ds=new ArrayList<>();
       int size=0;
       int targetDup=k;
       int sum=0;
       List<List<Integer>> res=new ArrayList<>();
        getSol(0,bet,n,k,ds,size,res,targetDup,sum);
        System.out.println(size);
    }
    static void getSol(int index,int[] bet,int n,int target,List<Integer> ds,int size,List<List<Integer>> res,int targetDup,int sum){
        if(sum<targetDup){
            size=Math.max(ds.size(),size);
        }


    }
    public static void main(String[] args) {
        int[] bet={30, 40, 50, 20, 20, 10, 90, 10, 10, 10};
        solve(bet,10,100);
    }
}
