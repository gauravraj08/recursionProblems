import java.util.ArrayList;
import java.util.List;

public class targetCombo {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> combo=new ArrayList<>();
        int index=0;
        return printTargetSeq(index,candidates,target,ds,combo);
    }
    private static List<List<Integer>> printTargetSeq(int index,int[] arr,int target,List<Integer> ds,List<List<Integer>> combo){
        if(index==arr.length){
            if(target==0){
                combo.add(new ArrayList<>(ds));
            }
            return combo;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            printTargetSeq(index,arr,target-arr[index],ds,combo);
            ds.remove(ds.size()-1);
        }
        printTargetSeq(index+1,arr,target,ds,combo);

        return combo;
    }

    public static void main(String[] args) {
     int[] arr={2,3,6,7};
        List<List<Integer>> combo=combinationSum(arr,7);
        System.out.println(combo);
    }
}
