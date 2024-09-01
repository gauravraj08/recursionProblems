import java.util.ArrayList;

public class subsetSum {
    public static void printTargetSubseq(int target){
        int idx=0,curr=0;
        int[] arr={2,2,4};
        ArrayList<Integer> ds=new ArrayList<>();
        printSubseq(idx,ds,arr,curr,target,3);

    }

    private static boolean printSubseq(int index,ArrayList<Integer> ds,int[] arr,int curr,int target,int n){
        if(index==n){
            if(curr==target){
                for(int j:ds){
                    System.out.print(j+" ");

                }
                System.out.println();
                return true;
            }
            return false;
        }
        //take it
        ds.add(arr[index]);
        curr+=arr[index];
        if(printSubseq(index + 1, ds, arr, curr, target, n)) return true;
        //not take
        curr-=arr[index];
        ds.remove(Integer.valueOf(arr[index]));
        if(printSubseq(index+1,ds,arr,curr,target,n)) return true;

        return  false;

    }
    public static void main(String[] args) {
        int sum=4;
        printTargetSubseq(sum);
    }
}
