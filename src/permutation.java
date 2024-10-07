import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        getPer(0,nums,res);
        return  res;
    }
    private static void getPer(int index,int[] arr,List<List<Integer>> res){
        if(index==arr.length){
            List<Integer> ds = new ArrayList<>();
            for (int i:arr) ds.add(i);
            res.add(new ArrayList(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(i,index,arr);
            getPer(index+1,arr,res);
            swap(i,index,arr);
        }
    }
    private static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(permute(arr));
    }
}
