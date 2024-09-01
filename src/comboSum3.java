import java.util.ArrayList;
import java.util.List;

public class comboSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={30, 40, 50, 20, 20, 10, 90, 10, 10, 10};
        List<List<Integer>> res=new ArrayList<>();
        int size=0;
        return getCombo(0,arr,new ArrayList<>(),res,k,n,size);
    }
    private static List<List<Integer>>  getCombo(int index,int[] arr,List<Integer> ds,List<List<Integer>> res,int k,int target,int size){
        if(target==0){
            size=Math.max(size,ds.size());
            if(ds.size()==k){
                res.add(new ArrayList<>(ds));
            }
            System.out.println("At index"+ index + " "+size);
            return res;
        }
        if(index==arr.length) return res;
        if(arr[index]<=target){
            ds.add(arr[index]);
            getCombo(index+1,arr,ds,res,k,target-arr[index],size);
            ds.remove(ds.size()-1);
        }
        getCombo(index+1,arr,ds,res,k,target,size);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(10,100));
    }
}
