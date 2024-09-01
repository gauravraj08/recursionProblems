import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class targetCombo2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> combo=new ArrayList<>();
        int index=0;
        Arrays.sort(candidates);
        getCombination(index,candidates,target,ds,combo);
        HashSet<List<Integer>> uniqueCombos = new HashSet<>(combo);
        return new ArrayList<>(uniqueCombos);
    }

    private static List<List<Integer>> getCombination(int index, int[] candidates, int target, List<Integer> ds, List<List<Integer>> combo) {
        if(index==candidates.length){
            if(target==0) {
                if(!combo.contains(ds)) combo.add(new ArrayList<>(ds));
            }
            return combo;
        }
        if(candidates[index]<=target) {
            ds.add(candidates[index]);
            getCombination(index + 1, candidates, target - candidates[index], ds, combo);
            ds.remove(ds.size() - 1);
        }
        getCombination(index+1,candidates,target,ds,combo);
        return combo;
    }

    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr,8));
    }
}
