import java.util.ArrayList;

public class countOfSub {
    public static void printTargetSubseq(int target){
        int idx=0,curr=0;
        int[] arr={2,2,4};
//        ArrayList<Integer> ds=new ArrayList<>();
        int count=printSubseq(idx,arr,curr,target,3);
        System.out.println(count);

    }

    private static int printSubseq(int index,int[] arr,int curr,int target,int n){
        if(index==n){
            if(curr==target) return 1;
            return 0;
        }
        //take it
        curr+=arr[index];
        int l=printSubseq(index + 1, arr, curr, target, n);
        //not take
        curr-=arr[index];
        int r=printSubseq(index+1,arr,curr,target,n);

        return  l+r;

    }
    public static void main(String[] args) {
        int sum=4;
        printTargetSubseq(sum);
    }
}
