import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combo2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> combo=new ArrayList<>();
        Arrays.sort(candidates);
        getCombination(0,candidates,target,new ArrayList<>(),combo);
        return combo;
    }

    private static void getCombination(int index, int[] candidates, int target, List<Integer> ds, List<List<Integer>> combo) {
        if(target==0) {
            combo.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            ds.add(candidates[i]);
            getCombination(i + 1, candidates, target - candidates[i], ds, combo);
            ds.remove(ds.size() - 1);
        }

    }
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr,8));
    }
}
