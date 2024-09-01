import java.util.ArrayList;

public class sumOfSubset {
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        int sum=0;
        return getSum(0,arr,new ArrayList<>(),sum);
    }

    private static ArrayList<Integer> getSum(int index, ArrayList<Integer> arr, ArrayList<Integer> ds, int sum) {
        if(index==arr.size()){
        ds.add(sum);
            return ds;
        }
//        sum+= arr.get(index);
        getSum(index+1,arr,ds,sum+ arr.get(index));
//        sum-=arr.get(index);
        getSum(index+1,arr,ds,sum);
        return ds;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ds=new ArrayList<>();
        ds.add(2);
        ds.add(3);
        ArrayList<Integer> res=subsetSums(ds,ds.size());
        System.out.println(res);
    }
}
